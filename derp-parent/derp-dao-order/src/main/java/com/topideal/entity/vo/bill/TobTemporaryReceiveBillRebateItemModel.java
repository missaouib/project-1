package com.topideal.entity.vo.bill;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.topideal.common.system.ibatis.PageModel;

public class TobTemporaryReceiveBillRebateItemModel extends PageModel implements Serializable{

    /**
    * ID
    */
    private Long id;
    /**
    * 账单Id
    */
    private Long billId;
    /**
    * 销售SD单号
    */
    private String relSdCode;
    /**
    * 商品id
    */
    private Long goodsId;
    /**
    * 商品名称
    */
    private String goodsName;
    /**
    * 商品货号
    */
    private String goodsNo;
    /**
    * 销售单价
    */
    private BigDecimal price;
    /**
    * 上架好品量
    */
    private Integer shelfNum;
    /**
    * 销售SD类型id
    */
    private Long sdTypeId;
    /**
    * 销售SD类型名称
    */
    private String sdTypeName;
    /**
    * 暂估返利金额
    */
    private BigDecimal rebateAmount;
    /**
    * 创建时间
    */
    private Timestamp createDate;
    /**
    * 修改时间
    */
    private Timestamp modifyDate;
    /**
     * 映射费项id
     */
	 private Long projectId;
	 /**
	 * 映射费项名称
	 */
	 private String projectName;
	 
	/**
    * 母品牌
    */
    private String parentBrandName;
    /**
    * 母品牌id
    */
    private Long parentBrandId;
    /**
    * 母品牌编码
    */
    private String parentBrandCode;


    private Double sdRatio;
    /**
     * 标准品牌id
     */
    private Long brandId;
    /**
     * 标准品牌名称
    */
    private String brandName;
    /**
     * 是否红冲单：0-否，1-是
     */
    private String isWriteOff;
    /**
     * 原销售SD单号
     */
    private String originalSaleSdOrderCode;

    /*id get 方法 */
    public Long getId(){
    return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
    this.id=id;
    }
    /*billId get 方法 */
    public Long getBillId(){
    return billId;
    }
    /*billId set 方法 */
    public void setBillId(Long  billId){
    this.billId=billId;
    }
    /*relSdCode get 方法 */
    public String getRelSdCode(){
    return relSdCode;
    }
    /*relSdCode set 方法 */
    public void setRelSdCode(String  relSdCode){
    this.relSdCode=relSdCode;
    }
    /*goodsId get 方法 */
    public Long getGoodsId(){
    return goodsId;
    }
    /*goodsId set 方法 */
    public void setGoodsId(Long  goodsId){
    this.goodsId=goodsId;
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
    /*price get 方法 */
    public BigDecimal getPrice(){
    return price;
    }
    /*price set 方法 */
    public void setPrice(BigDecimal  price){
    this.price=price;
    }
    /*shelfNum get 方法 */
    public Integer getShelfNum(){
    return shelfNum;
    }
    /*shelfNum set 方法 */
    public void setShelfNum(Integer  shelfNum){
    this.shelfNum=shelfNum;
    }
    /*sdTypeId get 方法 */
    public Long getSdTypeId(){
    return sdTypeId;
    }
    /*sdTypeId set 方法 */
    public void setSdTypeId(Long  sdTypeId){
    this.sdTypeId=sdTypeId;
    }
    /*sdTypeName get 方法 */
    public String getSdTypeName(){
    return sdTypeName;
    }
    /*sdTypeName set 方法 */
    public void setSdTypeName(String  sdTypeName){
    this.sdTypeName=sdTypeName;
    }
    /*rebateAmount get 方法 */
    public BigDecimal getRebateAmount(){
    return rebateAmount;
    }
    /*rebateAmount set 方法 */
    public void setRebateAmount(BigDecimal  rebateAmount){
    this.rebateAmount=rebateAmount;
    }
    /*createDate get 方法 */
    public Timestamp getCreateDate(){
    return createDate;
    }
    /*createDate set 方法 */
    public void setCreateDate(Timestamp  createDate){
    this.createDate=createDate;
    }
    /*modifyDate get 方法 */
    public Timestamp getModifyDate(){
    return modifyDate;
    }
    /*modifyDate set 方法 */
    public void setModifyDate(Timestamp  modifyDate){
    this.modifyDate=modifyDate;
    }
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getParentBrandName() {
		return parentBrandName;
	}
	public void setParentBrandName(String parentBrandName) {
		this.parentBrandName = parentBrandName;
	}
	public Long getParentBrandId() {
		return parentBrandId;
	}
	public void setParentBrandId(Long parentBrandId) {
		this.parentBrandId = parentBrandId;
	}
	public String getParentBrandCode() {
		return parentBrandCode;
	}
	public void setParentBrandCode(String parentBrandCode) {
		this.parentBrandCode = parentBrandCode;
	}

    public Double getSdRatio() {
        return sdRatio;
    }

    public void setSdRatio(Double sdRatio) {
        this.sdRatio = sdRatio;
    }

    public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    public String getIsWriteOff() {
        return isWriteOff;
    }

    public void setIsWriteOff(String isWriteOff) {
        this.isWriteOff = isWriteOff;
    }

    public String getOriginalSaleSdOrderCode() {
        return originalSaleSdOrderCode;
    }

    public void setOriginalSaleSdOrderCode(String originalSaleSdOrderCode) {
        this.originalSaleSdOrderCode = originalSaleSdOrderCode;
    }
}
