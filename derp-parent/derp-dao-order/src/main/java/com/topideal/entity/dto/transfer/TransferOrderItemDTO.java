package com.topideal.entity.dto.transfer;

import com.topideal.common.constant.DERP;
import com.topideal.common.system.ibatis.PageModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 调拨订单表体
 *
 * @author lian_
 */
@ApiModel
public class TransferOrderItemDTO extends PageModel implements Serializable {

    //调出商品编码
    @ApiModelProperty(value = "调出商品编码", required = false)
    private String outGoodsCode;
    //调拨订单ID
    @ApiModelProperty(value = "调拨订单id", required = false)
    private Long transferOrderId;
    //调入商品id
    @ApiModelProperty(value = "调入商品id", required = false)
    private Long inGoodsId;
    //调入商品货号
    @ApiModelProperty(value = "调入商品货号", required = false)
    private String inGoodsNo;
    //调出商品名称
    @ApiModelProperty(value = "调出商品名称", required = false)
    private String outGoodsName;
    //调出商品id
    @ApiModelProperty(value = "调出商品id", required = false)
    private Long outGoodsId;
    //调入商品名称
    @ApiModelProperty(value = "调入商品名称", required = false)
    private String inGoodsName;
    //调入商品编码
    @ApiModelProperty(value = "调入商品编码", required = false)
    private String inGoodsCode;
    //调拨数量
    @ApiModelProperty(value = "调拨数量", required = false)
    private Integer transferNum;
    //创建人
    @ApiModelProperty(value = "创建人", required = false)
    private Long creater;
    //id
    @ApiModelProperty(value = "id", required = false)
    private Long id;
    //创建时间
    @ApiModelProperty(value = "创建时间", required = false)
    private Timestamp createDate;
    //调出商品货号
    @ApiModelProperty(value = "调出商品货号", required = false)
    private String outGoodsNo;
    //品牌类型
    @ApiModelProperty(value = "品牌类型", required = false)
    private String brandName;
    //合同号
    @ApiModelProperty(value = "合同号", required = false)
    private String bargainno;
    //采购单价
    @ApiModelProperty(value = "单价", required = false)
    private Double price;
    //毛重
    @ApiModelProperty(value = "毛重", required = false)
    private Double grossWeight;
    //净重
    @ApiModelProperty(value = "净重", required = false)
    private Double netWeight;
    //箱号
    @ApiModelProperty(value = "箱号", required = false)
    private String contNo;
    //调入条形码
    @ApiModelProperty(value = "合同号", required = false)
    private String inBarcode;
    //调出条形码
    @ApiModelProperty(value = "调出条形码", required = false)
    private String outBarcode;
    //调入数量
    @ApiModelProperty(value = "调入数量", required = false)
    private Integer inTransferNum;
    //调入单位
    @ApiModelProperty(value = "调入单位", required = false)
    private String inUnit;
    @ApiModelProperty(value = "调入单位中文", required = false)
    private String inUnitLabel;
    //调出单位
    @ApiModelProperty(value = "调出单位", required = false)
    private String outUnit;
    @ApiModelProperty(value = "调出单位中文", required = false)
    private String outUnitLabel;
    //备注
    @ApiModelProperty(value = "备注", required = false)
    private String remark;
    //修改时间
    @ApiModelProperty(value = "修改时间", required = false)
    private Timestamp modifyDate;
    // 工厂编码
    @ApiModelProperty(value = "工厂编码", required = false)
    private String outFactoryNo;
    //调入商品标准条码
    @ApiModelProperty(value = "调入商品标准条码", required = false)
    private String inCommbarcode;
    //调出商品标准条码
    @ApiModelProperty(value = "调出商品标准条码", required = false)
    private String outCommbarcode;
    //总毛重
    @ApiModelProperty(value = "总毛重", required = false)
    private Double grossWeightSum;
    //总净重
    @ApiModelProperty(value = "总净重", required = false)
    private Double netWeightSum;

    //序号
    @ApiModelProperty(value = "序号", required = false)
    private Integer seq;
    //箱数
    @ApiModelProperty(value = "箱数", required = false)
    private Integer boxNum;
    //托盘号
    @ApiModelProperty(value = "托盘号", required = false)
    private String torrNo;

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    private String zcode;//自编码

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getInTransferNum() {
        return inTransferNum;
    }

    public void setInTransferNum(Integer inTransferNum) {
        this.inTransferNum = inTransferNum;
    }

    public String getInBarcode() {
        return inBarcode;
    }

    public void setInBarcode(String inBarcode) {
        this.inBarcode = inBarcode;
    }

    public String getInUnit() {
        return inUnit;
    }

    public void setInUnit(String inUnit) {
        this.inUnit = inUnit;
        if (StringUtils.isNotBlank(inUnit)) {
            this.inUnitLabel = DERP.getLabelByKey(DERP.unitList, inUnit);
        }
    }

    /*contNo get 方法 */
    public String getContNo() {
        return contNo;
    }

    /*contNo set 方法 */
    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    /*grossWeight get 方法 */
    public Double getGrossWeight() {
        return grossWeight;
    }

    /*grossWeight set 方法 */
    public void setGrossWeight(Double grossWeight) {
        this.grossWeight = grossWeight;
    }

    /*netWeight get 方法 */
    public Double getNetWeight() {
        return netWeight;
    }

    /*netWeight set 方法 */
    public void setNetWeight(Double netWeight) {
        this.netWeight = netWeight;
    }

    /*price get 方法 */
    public Double getPrice() {
        return price;
    }

    /*price set 方法 */
    public void setPrice(Double price) {
        this.price = price;
    }

    /*brandName get 方法 */
    public String getBrandName() {
        return brandName;
    }

    /*brandName set 方法 */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /*bargainno get 方法 */
    public String getBargainno() {
        return bargainno;
    }

    /*bargainno set 方法 */
    public void setBargainno(String bargainno) {
        this.bargainno = bargainno;
    }

    /*outGoodsCode get 方法 */
    public String getOutGoodsCode() {
        return outGoodsCode;
    }

    /*outGoodsCode set 方法 */
    public void setOutGoodsCode(String outGoodsCode) {
        this.outGoodsCode = outGoodsCode;
    }

    /*transferOrderId get 方法 */
    public Long getTransferOrderId() {
        return transferOrderId;
    }

    /*transferOrderId set 方法 */
    public void setTransferOrderId(Long transferOrderId) {
        this.transferOrderId = transferOrderId;
    }

    /*inGoodsId get 方法 */
    public Long getInGoodsId() {
        return inGoodsId;
    }

    /*inGoodsId set 方法 */
    public void setInGoodsId(Long inGoodsId) {
        this.inGoodsId = inGoodsId;
    }

    /*inGoodsNo get 方法 */
    public String getInGoodsNo() {
        return inGoodsNo;
    }

    /*inGoodsNo set 方法 */
    public void setInGoodsNo(String inGoodsNo) {
        this.inGoodsNo = inGoodsNo;
    }

    /*outGoodsName get 方法 */
    public String getOutGoodsName() {
        return outGoodsName;
    }

    /*outGoodsName set 方法 */
    public void setOutGoodsName(String outGoodsName) {
        this.outGoodsName = outGoodsName;
    }

    /*outGoodsId get 方法 */
    public Long getOutGoodsId() {
        return outGoodsId;
    }

    /*outGoodsId set 方法 */
    public void setOutGoodsId(Long outGoodsId) {
        this.outGoodsId = outGoodsId;
    }

    /*inGoodsName get 方法 */
    public String getInGoodsName() {
        return inGoodsName;
    }

    /*inGoodsName set 方法 */
    public void setInGoodsName(String inGoodsName) {
        this.inGoodsName = inGoodsName;
    }

    /*inGoodsCode get 方法 */
    public String getInGoodsCode() {
        return inGoodsCode;
    }

    /*inGoodsCode set 方法 */
    public void setInGoodsCode(String inGoodsCode) {
        this.inGoodsCode = inGoodsCode;
    }

    /*transferNum get 方法 */
    public Integer getTransferNum() {
        return transferNum;
    }

    /*transferNum set 方法 */
    public void setTransferNum(Integer transferNum) {
        this.transferNum = transferNum;
    }

    /*creater get 方法 */
    public Long getCreater() {
        return creater;
    }

    /*creater set 方法 */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /*id get 方法 */
    public Long getId() {
        return id;
    }

    /*id set 方法 */
    public void setId(Long id) {
        this.id = id;
    }

    /*createDate get 方法 */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /*createDate set 方法 */
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    /*outGoodsNo get 方法 */
    public String getOutGoodsNo() {
        return outGoodsNo;
    }

    /*outGoodsNo set 方法 */
    public void setOutGoodsNo(String outGoodsNo) {
        this.outGoodsNo = outGoodsNo;
    }

    public String getOutUnit() {
        return outUnit;
    }

    public void setOutUnit(String outUnit) {
        this.outUnit = outUnit;
        if (StringUtils.isNotBlank(outUnit)) {
            this.outUnitLabel = DERP.getLabelByKey(DERP.unitList, outUnit);
        }
    }

    public String getOutBarcode() {
        return outBarcode;
    }

    public void setOutBarcode(String outBarcode) {
        this.outBarcode = outBarcode;
    }

    public String getOutFactoryNo() {
        return outFactoryNo;
    }

    public void setOutFactoryNo(String outFactoryNo) {
        this.outFactoryNo = outFactoryNo;
    }

    public String getZcode() {
        return zcode;
    }

    public void setZcode(String zcode) {
        this.zcode = zcode;
    }

    public String getInUnitLabel() {
        return inUnitLabel;
    }

    public String getOutUnitLabel() {
        return outUnitLabel;
    }

    public String getInCommbarcode() {
        return inCommbarcode;
    }

    public void setInCommbarcode(String inCommbarcode) {
        this.inCommbarcode = inCommbarcode;
    }

    public String getOutCommbarcode() {
        return outCommbarcode;
    }

    public void setOutCommbarcode(String outCommbarcode) {
        this.outCommbarcode = outCommbarcode;
    }

    public void setInUnitLabel(String inUnitLabel) {
        this.inUnitLabel = inUnitLabel;
    }

    public void setOutUnitLabel(String outUnitLabel) {
        this.outUnitLabel = outUnitLabel;
    }

    public Double getGrossWeightSum() {
        return grossWeightSum;
    }

    public void setGrossWeightSum(Double grossWeightSum) {
        this.grossWeightSum = grossWeightSum;
    }

    public Double getNetWeightSum() {
        return netWeightSum;
    }

    public void setNetWeightSum(Double netWeightSum) {
        this.netWeightSum = netWeightSum;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(Integer boxNum) {
        this.boxNum = boxNum;
    }

    public String getTorrNo() {
        return torrNo;
    }

    public void setTorrNo(String torrNo) {
        this.torrNo = torrNo;
    }
}

