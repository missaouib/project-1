package com.topideal.entity.dto.sale;
import com.topideal.common.system.ibatis.PageModel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BillOutinDepotItemDTO extends PageModel implements Serializable{

    /**
    * id主键
    */
    private Long id;
    /**
    * 出入库单id
    */
    private Long outinDepotId;
    private String outinDepotCode ;
    /**
    * 商品id
    */
    private Long goodsId;
    /**
    * 商品货号
    */
    private String goodsNo;
    /**
    * 商品名称
    */
    private String goodsName;
    /**
    * 平台账单号
    */
    private String platformSku;
    /**
    * 标准条码
    */
    private String commbarcode;
    /**
     * 条码
     */
    private String barcode;
    /**
    * po号
    */
    private String poNo;
    /**
    * 数量
    */
    private Integer num;
    /**
    * 单价
    */
    private BigDecimal price;
    /**
    * 金额
    */
    private BigDecimal amount;
    /**
    * 创建时间
    */
    private Timestamp createDate;
    /**
    * 修改时间
    */
    private Timestamp modifyDate;
    /**
     * 爬虫映射量
     */
    private Integer contrastNum;
    /**
     * 结算单价（含税）
     */
     private BigDecimal taxPrice;
     /**
     * 结算金额（含税）
     */
     private BigDecimal taxAmount;
     /**
     * 税额
     */
     private BigDecimal tax;
     /**
     * 税率
     */
     private Double taxRate;

    /*id get 方法 */
    public Long getId(){
    return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
    this.id=id;
    }
    /*outinDepotId get 方法 */
    public Long getOutinDepotId(){
    return outinDepotId;
    }
    /*outinDepotId set 方法 */
    public void setOutinDepotId(Long  outinDepotId){
    this.outinDepotId=outinDepotId;
    }
    /*goodsId get 方法 */
    public Long getGoodsId(){
    return goodsId;
    }
    /*goodsId set 方法 */
    public void setGoodsId(Long  goodsId){
    this.goodsId=goodsId;
    }
    /*goodsNo get 方法 */
    public String getGoodsNo(){
    return goodsNo;
    }
    /*goodsNo set 方法 */
    public void setGoodsNo(String  goodsNo){
    this.goodsNo=goodsNo;
    }
    /*goodsName get 方法 */
    public String getGoodsName(){
    return goodsName;
    }
    /*goodsName set 方法 */
    public void setGoodsName(String  goodsName){
    this.goodsName=goodsName;
    }
    /*platformSku get 方法 */
    public String getPlatformSku(){
    return platformSku;
    }
    /*platformSku set 方法 */
    public void setPlatformSku(String  platformSku){
    this.platformSku=platformSku;
    }
    /*commbarcode get 方法 */
    public String getCommbarcode(){
    return commbarcode;
    }
    /*commbarcode set 方法 */
    public void setCommbarcode(String  commbarcode){
    this.commbarcode=commbarcode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /*poNo get 方法 */
    public String getPoNo(){
    return poNo;
    }
    /*poNo set 方法 */
    public void setPoNo(String  poNo){
    this.poNo=poNo;
    }
    /*num get 方法 */
    public Integer getNum(){
    return num;
    }
    /*num set 方法 */
    public void setNum(Integer  num){
    this.num=num;
    }
    /*price get 方法 */
    public BigDecimal getPrice(){
    return price;
    }
    /*price set 方法 */
    public void setPrice(BigDecimal  price){
    this.price=price;
    }
    /*amount get 方法 */
    public BigDecimal getAmount(){
    return amount;
    }
    /*amount set 方法 */
    public void setAmount(BigDecimal  amount){
    this.amount=amount;
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

	public String getOutinDepotCode() {
		return outinDepotCode;
	}
	public void setOutinDepotCode(String outinDepotCode) {
		this.outinDepotCode = outinDepotCode;
	}

    public Integer getContrastNum() {
        return contrastNum;
    }

    public void setContrastNum(Integer contrastNum) {
        this.contrastNum = contrastNum;
    }
	public BigDecimal getTaxPrice() {
		return taxPrice;
	}
	public void setTaxPrice(BigDecimal taxPrice) {
		this.taxPrice = taxPrice;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public Double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}


}
