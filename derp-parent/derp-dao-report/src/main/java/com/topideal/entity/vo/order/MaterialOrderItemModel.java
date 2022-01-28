package com.topideal.entity.vo.order;
import com.topideal.common.system.ibatis.PageModel;

import java.io.Serializable;
import java.sql.Timestamp;

public class MaterialOrderItemModel extends PageModel implements Serializable{

    /**
    * id
    */
    private Long id;
    /**
    * 领料单ID
    */
    private Long orderId;
    /**
    * 商品ID
    */
    private Long goodsId;
    /**
    * 领取数量
    */
    private Integer num;
    /**
    * 合同号
    */
    private String contractNo;
    /**
    * 箱号
    */
    private String boxNo;
    /**
    *
    */
    private Double grossWeight;
    /**
    *
    */
    private Double netWeight;
    /**
    * 品牌类型
    */
    private String brandName;
    /**
    * 商品编码
    */
    private String goodsCode;
    /**
    * 商品名称
    */
    private String goodsName;
    /**
    * 商品货号
    */
    private String goodsNo;
    /**
    * 单位名称
    */
    private String unitName;
    /**
    * 单位
    */
    private Long unit;
    /**
    * 条形码
    */
    private String barcode;
    /**
    * 理货单位(00-托盘，01-箱，02-件
    */
    private String tallyingUnit;
    /**
    * 标准条码
    */
    private String commbarcode;
    /**
    *
    */
    private Double grossWeightSum;
    /**
    *
    */
    private Double netWeightSum;
    /**
    * 序号
    */
    private Integer seq;
    /**
    * 修改时间
    */
    private Timestamp modifyDate;
    /**
    * 创建时间
    */
    private Timestamp createDate;

    /*id get 方法 */
    public Long getId(){
    return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
    this.id=id;
    }
    /*orderId get 方法 */
    public Long getOrderId(){
    return orderId;
    }
    /*orderId set 方法 */
    public void setOrderId(Long  orderId){
    this.orderId=orderId;
    }
    /*goodsId get 方法 */
    public Long getGoodsId(){
    return goodsId;
    }
    /*goodsId set 方法 */
    public void setGoodsId(Long  goodsId){
    this.goodsId=goodsId;
    }
    /*num get 方法 */
    public Integer getNum(){
    return num;
    }
    /*num set 方法 */
    public void setNum(Integer  num){
    this.num=num;
    }
    /*contractNo get 方法 */
    public String getContractNo(){
    return contractNo;
    }
    /*contractNo set 方法 */
    public void setContractNo(String  contractNo){
    this.contractNo=contractNo;
    }
    /*boxNo get 方法 */
    public String getBoxNo(){
    return boxNo;
    }
    /*boxNo set 方法 */
    public void setBoxNo(String  boxNo){
    this.boxNo=boxNo;
    }
    /*grossWeight get 方法 */
    public Double getGrossWeight(){
    return grossWeight;
    }
    /*grossWeight set 方法 */
    public void setGrossWeight(Double  grossWeight){
    this.grossWeight=grossWeight;
    }
    /*netWeight get 方法 */
    public Double getNetWeight(){
    return netWeight;
    }
    /*netWeight set 方法 */
    public void setNetWeight(Double  netWeight){
    this.netWeight=netWeight;
    }
    /*brandName get 方法 */
    public String getBrandName(){
    return brandName;
    }
    /*brandName set 方法 */
    public void setBrandName(String  brandName){
    this.brandName=brandName;
    }
    /*goodsCode get 方法 */
    public String getGoodsCode(){
    return goodsCode;
    }
    /*goodsCode set 方法 */
    public void setGoodsCode(String  goodsCode){
    this.goodsCode=goodsCode;
    }
    /*goodsName get 方法 */
    public String getGoodsName(){
    return goodsName;
    }
    /*goodsName set 方法 */
    public void setGoodsName(String  goodsName){
    this.goodsName=goodsName;
    }
    /*goodsNo get 方法 */
    public String getGoodsNo(){
    return goodsNo;
    }
    /*goodsNo set 方法 */
    public void setGoodsNo(String  goodsNo){
    this.goodsNo=goodsNo;
    }
    /*unitName get 方法 */
    public String getUnitName(){
    return unitName;
    }
    /*unitName set 方法 */
    public void setUnitName(String  unitName){
    this.unitName=unitName;
    }
    /*unit get 方法 */
    public Long getUnit(){
    return unit;
    }
    /*unit set 方法 */
    public void setUnit(Long  unit){
    this.unit=unit;
    }
    /*barcode get 方法 */
    public String getBarcode(){
    return barcode;
    }
    /*barcode set 方法 */
    public void setBarcode(String  barcode){
    this.barcode=barcode;
    }
    /*tallyingUnit get 方法 */
    public String getTallyingUnit(){
    return tallyingUnit;
    }
    /*tallyingUnit set 方法 */
    public void setTallyingUnit(String  tallyingUnit){
    this.tallyingUnit=tallyingUnit;
    }
    /*commbarcode get 方法 */
    public String getCommbarcode(){
    return commbarcode;
    }
    /*commbarcode set 方法 */
    public void setCommbarcode(String  commbarcode){
    this.commbarcode=commbarcode;
    }
    /*grossWeightSum get 方法 */
    public Double getGrossWeightSum(){
    return grossWeightSum;
    }
    /*grossWeightSum set 方法 */
    public void setGrossWeightSum(Double  grossWeightSum){
    this.grossWeightSum=grossWeightSum;
    }
    /*netWeightSum get 方法 */
    public Double getNetWeightSum(){
    return netWeightSum;
    }
    /*netWeightSum set 方法 */
    public void setNetWeightSum(Double  netWeightSum){
    this.netWeightSum=netWeightSum;
    }
    /*seq get 方法 */
    public Integer getSeq(){
    return seq;
    }
    /*seq set 方法 */
    public void setSeq(Integer  seq){
    this.seq=seq;
    }
    /*modifyDate get 方法 */
    public Timestamp getModifyDate(){
    return modifyDate;
    }
    /*modifyDate set 方法 */
    public void setModifyDate(Timestamp  modifyDate){
    this.modifyDate=modifyDate;
    }
    /*createDate get 方法 */
    public Timestamp getCreateDate(){
    return createDate;
    }
    /*createDate set 方法 */
    public void setCreateDate(Timestamp  createDate){
    this.createDate=createDate;
    }






}