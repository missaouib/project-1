<template>
  <div class="mr-t-20">
    <JFX-table :tableData.sync="tableData" :showPagination="false">
      <el-table-column
        prop="company"
        label="公司"
        align="center"
        min-width="120"
        show-overflow-tooltip
      ></el-table-column>
      <el-table-column
        prop="type"
        label="单据类型"
        align="center"
        min-width="100"
      ></el-table-column>
      <el-table-column
        prop="status"
        label="生成状态"
        align="center"
        min-width="100"
      ></el-table-column>
      <el-table-column
        prop="code"
        label="单据编号"
        align="center"
        min-width="130"
      ></el-table-column>
      <el-table-column
        prop="orderSatus"
        label="单据状态"
        align="center"
        min-width="100"
      ></el-table-column>
    </JFX-table>
    <div class="mr-t-20 clr-II fs-14">
      注：生成过程中
      <font style="color: red">请勿关闭或离开</font>
      该页面，否则将导致单据不能正常生成
    </div>
    <div class="flex-c-c mr-t-30">
      <el-button id="pur_cancle_btn" v-if="!done" @click="backTo">
        取 消
      </el-button>
      <el-button
        type="primary"
        v-if="!done"
        @click="save"
        :loading="saveLoading"
      >
        开始生成
      </el-button>
      <el-button type="primary" v-if="done" @click="backToList">
        返回列表
      </el-button>
    </div>
  </div>
</template>
<script>
  import {
    toSaleStepThreePage,
    saveFirstOrderStatusAndIdepot,
    saveLinkOrderAndDepot
  } from '@a/purchaseManage/index'
  import commomMix from '@m/index'
  export default {
    mixins: [commomMix],
    props: {
      tradeLinkId: ''
    },
    data() {
      return {
        tableData: {
          list: [],
          loading: false,
          pageNum: 1,
          pageSize: 10000,
          total: 10001
        },
        detail: {},
        done: false,
        saveLoading: false
      }
    },
    mounted() {
      this.init()
    },
    methods: {
      async init() {
        this.tableData.loading = true
        try {
          const res = await toSaleStepThreePage({ id: this.tradeLinkId })
          const {
            map = {},
            goodsIds,
            goodsNos,
            goodsNums,
            outDepotId
          } = res.data
          const list = []
          let i = 0
          for (const key in map) {
            if (key !== 'errorList') {
              const {
                purchaseContractList = null,
                purchaseList = null,
                saleOrderList = null
              } = map[key]
              if (purchaseList) {
                purchaseList.forEach(() => {
                  list.push({
                    company: key,
                    type: '采购订单',
                    status: '待生成',
                    code: '',
                    orderSatus: '',
                    index: i
                  })
                  i = i + 1
                })
              }
              if (saleOrderList) {
                saleOrderList.forEach((item) => {
                  list.push({
                    company: key,
                    type:
                      item.businessModel + '' === '0' ? '预售订单' : '销售订单',
                    status: '待生成',
                    code: '',
                    orderSatus: '',
                    index: i
                  })
                  i = i + 1
                })
              }
              if (purchaseContractList) {
                purchaseContractList.forEach((item) => {
                  list.push({
                    company: key,
                    type: 'PO 合同',
                    status: '待生成',
                    code: null,
                    orderSatus: ''
                  })
                })
              }
            }
          }
          this.tableData.list = list
          this.detail = { goodsIds, goodsNos, goodsNums, outDepotId }
        } catch (error) {
          console.log(error)
        }
        this.tableData.loading = false
      },
      // 返回上一步
      async backTo() {
        this.$emit('setAct', { tradeLinkId: this.tradeLinkId, step: 1 })
      },
      // 生成
      async save() {
        console.log(this)
        this.saveLoading = true
        this.tableData.loading = true
        try {
          await saveFirstOrderStatusAndIdepot({
            purchaseTradeLinkId: this.tradeLinkId
          })
          console.log(this.detail)
          const goodsIdsArr = this.detail.goodsIds.split(',')
          const goodsNosArr = this.detail.goodsNos.split(',')
          const goodsNumsArr = this.detail.goodsNums.split(',')
          // 校验可用量
          if (goodsIdsArr.length) {
            const { isInventoryValidate } = await this.$checkInventoryNum({
              itemList: goodsIdsArr.map((goodId, index) => {
                return {
                  goodsId: goodId,
                  goodsNo: goodsNosArr[index],
                  okNum: goodsNumsArr[index] || 0,
                  depotId: this.detail.outDepotId || '',
                  inventoryType: 2
                }
              })
            })
            if (!isInventoryValidate) throw new Error(false)
          }
          const res3 = await saveLinkOrderAndDepot({
            purchaseTradeLinkId: this.tradeLinkId
          })
          if (res3.data) {
            this.tableData.list.forEach((item) => {
              item.status = '已生成'
              if (item.index !== null && item.index !== undefined) {
                const str = res3.data[item.index]
                const arr = str.split(';')
                item.code = arr[0]
                item.orderSatus = arr[1]
              }
            })
            this.done = true
            this.$successMsg('操作成功')
          }
        } catch (error) {
          console.log(error)
        }
        this.saveLoading = false
        this.tableData.loading = false
      },
      // 返回列表
      backToList() {
        this.closeTag()
      }
    }
  }
</script>
<style lang="scss" scoped></style>
