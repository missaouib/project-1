<template>
  <div>
    <JFX-Dialog
      :visible.sync="visible"
      :showClose="true"
      @comfirm="comfirm"
      :width="'460'"
      :title="'清关资料导出确认'"
      :btnAlign="'center'"
      top="8vh"
    >
      <el-row v-if="inTableData.list && inTableData.list.length > 0">
        <el-col :span="24" class="fs-14 clr-II">
          查询该入库仓库关联采购清关单证模板有多个，请选择导出模板：
        </el-col>
        <el-col :span="24" class="mr-t-10">
          <!-- 表格 -->
          <JFX-table
            :tableData.sync="inTableData"
            :tableHeight="'420px'"
            :showPagination="false"
            @selection-change="selectionChange"
          >
            <el-table-column
              label="选择"
              align="center"
              width="80"
              v-if="isRadio"
            >
              <template slot-scope="scope">
                <el-radio v-model="choseId" :label="scope.row.fileTempId">
                  {{ scope.row.kk || '' }}
                </el-radio>
              </template>
            </el-table-column>
            <el-table-column
              v-else
              type="selection"
              align="center"
              width="80"
            ></el-table-column>
            <el-table-column
              prop="fileTempCode"
              label="清关模板编码"
              align="center"
              min-width="110"
            ></el-table-column>
            <el-table-column
              prop="fileTempName"
              label="清关模板名称"
              align="center"
              show-overflow-tooltip
            ></el-table-column>
          </JFX-table>
          <!-- 表格 end-->
        </el-col>
      </el-row>
      <el-row v-if="outTableData.list && outTableData.list.length > 0">
        <el-col :span="24" class="fs-14 clr-II">
          查询该出库仓库关联采购清关单证模板有多个，请选择导出模板：
        </el-col>
        <el-col :span="24" class="mr-t-10">
          <!-- 表格 -->
          <JFX-table
            :tableData.sync="outTableData"
            :tableHeight="'420px'"
            :showPagination="false"
            @selection-change="selectionChangeOut"
          >
            <el-table-column
              label="选择"
              align="center"
              width="80"
              v-if="isRadio"
            >
              <template slot-scope="scope">
                <el-radio v-model="choseId" :label="scope.row.fileTempId">
                  {{ scope.row.kk || '' }}
                </el-radio>
              </template>
            </el-table-column>
            <el-table-column
              v-else
              type="selection"
              align="center"
              width="80"
            ></el-table-column>
            <el-table-column
              prop="fileTempCode"
              label="清关模板编码"
              align="center"
              min-width="110"
            ></el-table-column>
            <el-table-column
              prop="fileTempName"
              label="清关模板名称"
              align="center"
              show-overflow-tooltip
            ></el-table-column>
          </JFX-table>
          <!-- 表格 end-->
        </el-col>
      </el-row>
    </JFX-Dialog>
  </div>
</template>
<script>
  import commomMix from '@m/index'
  export default {
    mixins: [commomMix],
    props: {
      visible: {
        type: Object,
        default: function () {
          return { show: false }
        }
      },
      // 模板数据
      targetData: {
        type: Object,
        default: function () {
          return {}
        }
      },
      isRadio: {
        type: Boolean,
        default: false
      }
    },
    data() {
      return {
        inTableData: {
          list: [],
          loading: false,
          pageNum: 1,
          pageSize: 10000,
          total: 10001
        },
        outTableData: {
          list: [],
          loading: false,
          pageNum: 1,
          pageSize: 10000,
          total: 10001
        },
        choseId: '',
        tableChoseListOut: []
      }
    },
    mounted() {
      const { inList = [], outList = [] } = this.targetData
      this.inTableData.list = inList || []
      this.outTableData.list = outList || []
    },
    methods: {
      selectionChangeOut(list) {
        this.tableChoseListOut = list
      },
      comfirm() {
        if (!this.isRadio) {
          // 多选
          const tableChoseList = [
            ...this.tableChoseList,
            ...this.tableChoseListOut
          ]
          if (tableChoseList.length < 1) {
            this.$errorMsg('至少选择一条记录！')
            return false
          }
          const inFileTemp = this.tableChoseList || [] // 入库选中数据
          const outFileTemp = this.tableChoseListOut || [] // 出库选中数据
          this.$emit('comfirm', { inFileTemp, outFileTemp })
        } else {
          // 单选
          if (!this.choseId) {
            this.$errorMsg('至少选择一条记录！')
            return false
          }
          const tableChoseList = [
            ...this.inTableData.list,
            ...this.outTableData.list
          ]
          const target = tableChoseList.find(
            (item) => +this.choseId === +item.fileTempId
          )
          this.$emit('comfirm', target)
        }
      }
    }
  }
</script>
