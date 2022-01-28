package com.topideal.entity.dto.purchase;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.topideal.common.constant.DERP;
import com.topideal.common.constant.DERP_ORDER;
import com.topideal.common.constant.DERP_SYS;
import com.topideal.common.system.ibatis.PageModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class PurchaseInvoiceDTO extends PageModel implements Serializable{
    /**
    * 自增ID
    */
	@ApiModelProperty("自增ID")
    private Long id;
    /**
    * 编码
    */
	@ApiModelProperty("编码")
    private String code;
    /**
    * 商家ID
    */
	@ApiModelProperty("商家ID")
    private Long merchantId;
    /**
    * 商家名
    */
	@ApiModelProperty("商家名")
    private String merchantName;
    /**
    * 采购订单ID
    */
	@ApiModelProperty("采购订单ID")
    private Long purchaseOrderId;
    /**
    * 采购订单号
    */
	@ApiModelProperty("采购订单号")
    private String purchaseOrderCode;
    /**
    * 事业部ID
    */
	@ApiModelProperty("事业部ID")
    private Long buId;
    /**
    * 事业部名
    */
	@ApiModelProperty("事业部名")
    private String buName;
    /**
    * 供应商ID
    */
	@ApiModelProperty("供应商ID")
    private Long supplierId;
    /**
    * 供应商
    */
	@ApiModelProperty("供应商")
    private String supplierName;
    /**
    * PO号
    */
	@ApiModelProperty("PO号")
    private String poNo;
    /**
    * 预计付款时间
    */
	@ApiModelProperty("预计付款时间")
    private Timestamp paymentDate;
    /**
    * 收到发票时间
    */
	@ApiModelProperty("收到发票时间")
    private Timestamp invoiceDate;
    /**
    * 开发票时间
    */
	@ApiModelProperty("开发票时间")
    private Timestamp drawInvoiceDate;
	/**
    * 发票号
    */
	@ApiModelProperty("发票号")
    private String invoiceNo;
    /**
    * 付款人
    */
	@ApiModelProperty("开票人")
    private String payName;
    /**
    * 创建人
    */
	@ApiModelProperty("创建人")
    private Long creater;
    /**
    * 创建人用户名
    */
	@ApiModelProperty("创建人用户名")
    private String createName;
    /**
    * 创建时间
    */
	@ApiModelProperty("创建时间")
    private Timestamp createDate;
    /**
    * 修改人
    */
	@ApiModelProperty("修改人")
    private Long modifier;
    /**
    * 修改人用户名
    */
	@ApiModelProperty("修改人用户名")
    private String modifierUsername;
    /**
    * 修改时间
    */
	@ApiModelProperty("修改时间")
    private Timestamp modifyDate;
	
	@ApiModelProperty("商品明细")
	private List<PurchaseInvoiceItemDTO> itemList ;
	
	@ApiModelProperty(hidden = true)
	private List<Long> buIds ;

	@ApiModelProperty("发票总金额（不含税）")
	private BigDecimal amount;

    @ApiModelProperty("发票总金额（含税）")
	private BigDecimal taxAmount;

    @ApiModelProperty("币种")
    private String currency;
    private String currencyLabel;

    /**
     * 采购单业务模式  1 采购 2 代销 3 采购执行
     */
    @ApiModelProperty("采购单业务模式  1 采购 2 代销 3 采购执行")
    private String businessModel;
    private String businessModelLabel;

    public String getCurrencyLabel() {
        return currencyLabel;
    }

    public void setCurrencyLabel(String currencyLabel) {
        this.currencyLabel = currencyLabel;
    }

    public String getBusinessModelLabel() {
        return businessModelLabel;
    }

    public void setBusinessModelLabel(String businessModelLabel) {
        this.businessModelLabel = businessModelLabel;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
        this.currencyLabel = DERP_SYS.getLabelByKey(DERP.currencyCodeList, currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    /*id get 方法 */
    public Long getId(){
    return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
    this.id=id;
    }
    /*code get 方法 */
    public String getCode(){
    return code;
    }
    /*code set 方法 */
    public void setCode(String  code){
    this.code=code;
    }
    /*merchantId get 方法 */
    public Long getMerchantId(){
    return merchantId;
    }
    /*merchantId set 方法 */
    public void setMerchantId(Long  merchantId){
    this.merchantId=merchantId;
    }
    /*merchantName get 方法 */
    public String getMerchantName(){
    return merchantName;
    }
    /*merchantName set 方法 */
    public void setMerchantName(String  merchantName){
    this.merchantName=merchantName;
    }
    /*purchaseOrderId get 方法 */
    public Long getPurchaseOrderId(){
    return purchaseOrderId;
    }
    /*purchaseOrderId set 方法 */
    public void setPurchaseOrderId(Long  purchaseOrderId){
    this.purchaseOrderId=purchaseOrderId;
    }
    /*purchaseOrderCode get 方法 */
    public String getPurchaseOrderCode(){
    return purchaseOrderCode;
    }
    /*purchaseOrderCode set 方法 */
    public void setPurchaseOrderCode(String  purchaseOrderCode){
    this.purchaseOrderCode=purchaseOrderCode;
    }
    /*buId get 方法 */
    public Long getBuId(){
    return buId;
    }
    /*buId set 方法 */
    public void setBuId(Long  buId){
    this.buId=buId;
    }
    /*buName get 方法 */
    public String getBuName(){
    return buName;
    }
    /*buName set 方法 */
    public void setBuName(String  buName){
    this.buName=buName;
    }
    /*supplierId get 方法 */
    public Long getSupplierId(){
    return supplierId;
    }
    /*supplierId set 方法 */
    public void setSupplierId(Long  supplierId){
    this.supplierId=supplierId;
    }
    /*supplierName get 方法 */
    public String getSupplierName(){
    return supplierName;
    }
    /*supplierName set 方法 */
    public void setSupplierName(String  supplierName){
    this.supplierName=supplierName;
    }
    /*poNo get 方法 */
    public String getPoNo(){
    return poNo;
    }
    /*poNo set 方法 */
    public void setPoNo(String  poNo){
    this.poNo=poNo;
    }
    /*paymentDate get 方法 */
    public Timestamp getPaymentDate(){
    return paymentDate;
    }
    /*paymentDate set 方法 */
    public void setPaymentDate(Timestamp  paymentDate){
    this.paymentDate=paymentDate;
    }
    /*invoiceDate get 方法 */
    public Timestamp getInvoiceDate(){
    return invoiceDate;
    }
    /*invoiceDate set 方法 */
    public void setInvoiceDate(Timestamp  invoiceDate){
    this.invoiceDate=invoiceDate;
    }
    /*drawInvoiceDate get 方法 */
    public Timestamp getDrawInvoiceDate(){
    return drawInvoiceDate;
    }
    /*drawInvoiceDate set 方法 */
    public void setDrawInvoiceDate(Timestamp  drawInvoiceDate){
    this.drawInvoiceDate=drawInvoiceDate;
    }
    /*payName get 方法 */
    public String getPayName(){
    return payName;
    }
    /*payName set 方法 */
    public void setPayName(String  payName){
    this.payName=payName;
    }
    /*creater get 方法 */
    public Long getCreater(){
    return creater;
    }
    /*creater set 方法 */
    public void setCreater(Long  creater){
    this.creater=creater;
    }
    /*createName get 方法 */
    public String getCreateName(){
    return createName;
    }
    /*createName set 方法 */
    public void setCreateName(String  createName){
    this.createName=createName;
    }
    /*createDate get 方法 */
    public Timestamp getCreateDate(){
    return createDate;
    }
    /*createDate set 方法 */
    public void setCreateDate(Timestamp  createDate){
    this.createDate=createDate;
    }
    /*modifier get 方法 */
    public Long getModifier(){
    return modifier;
    }
    /*modifier set 方法 */
    public void setModifier(Long  modifier){
    this.modifier=modifier;
    }
    /*modifierUsername get 方法 */
    public String getModifierUsername(){
    return modifierUsername;
    }
    /*modifierUsername set 方法 */
    public void setModifierUsername(String  modifierUsername){
    this.modifierUsername=modifierUsername;
    }
    /*modifyDate get 方法 */
    public Timestamp getModifyDate(){
    return modifyDate;
    }
    /*modifyDate set 方法 */
    public void setModifyDate(Timestamp  modifyDate){
    this.modifyDate=modifyDate;
    }
	public List<PurchaseInvoiceItemDTO> getItemList() {
		return itemList;
	}
	public void setItemList(List<PurchaseInvoiceItemDTO> itemList) {
		this.itemList = itemList;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public List<Long> getBuIds() {
		return buIds;
	}
	public void setBuIds(List<Long> buIds) {
		this.buIds = buIds;
	}

	public String getBusinessModel() {
		return businessModel;
	}

	public void setBusinessModel(String businessModel) {
		this.businessModel = businessModel;
		this.businessModelLabel= DERP_ORDER.getLabelByKey(DERP_ORDER.purchaseOrder_businessModelList, businessModel);
	}






}
