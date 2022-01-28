package com.topideal.entity.dto.sale;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.topideal.common.constant.DERP;
import com.topideal.common.constant.DERP_ORDER;
import com.topideal.common.system.ibatis.PageModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class BillOutinDepotDTO extends PageModel implements Serializable{

	@ApiModelProperty(value = "id")
    private Long id;

	@ApiModelProperty(value = "出入库单号")
    private String code;
	
	@ApiModelProperty(value = "仓库ID")
    private Long depotId;
    @ApiModelProperty(value = "仓库名称")
    private String depotName;
    @ApiModelProperty(value = "客户id")
    private Long customerId; 
	@ApiModelProperty(value = "客户名称")
    private String customerName;
    @ApiModelProperty(value = "平台账单号")
    private String billCode;
  
	@ApiModelProperty(value = "处理类型 XSC-销售出库 GJC-国检出库 PKC-盘亏出库 BFC-报废 PYR-盘盈入库 KTR-客退入库")
    private String processingType;

	@ApiModelProperty(value = "处理类型（中文）")
    private String processingTypeLabel;
    @ApiModelProperty(value = "出库时间")
    private Timestamp deliverDate;
	@ApiModelProperty(value = "出库开始时间",hidden=true)
    private String deliverStartDate;
	@ApiModelProperty(value = "出库结束时间",hidden=true)
    private String deliverEndDate;
    @ApiModelProperty(value = "账单总量")
    private Integer totalNum;
    @ApiModelProperty(value = "账单金额")
    private BigDecimal totalAmount;
    /**
    * 库存调整类型  0 调减 1调增
    */
	@ApiModelProperty(value = "库存调整类型")
    private String operateType;

	@ApiModelProperty(value = "库存调整类型（中文）")
    private String operateTypeLabel;
    
	 @ApiModelProperty(value = "单据状态 00-待审核 01-处理中 02-已出库 03-已入库")
    private String state;

	@ApiModelProperty(value = "单据状态（中文）")
    private String stateLabel;
    
	@ApiModelProperty(value = "账单来源")
    private String billSource;

	@ApiModelProperty(value = "账单来源（中文）")
    private String billSourceLabel;
    
	@ApiModelProperty(value = "创建时间")
    private Timestamp createDate;
    
	@ApiModelProperty(value = "修改时间")
    private Timestamp modifyDate;

	@ApiModelProperty(value = "商家id")
    private Long merchantId;

	@ApiModelProperty(value = "商家名称")
    private String merchantName;

    
	@ApiModelProperty(value = "币种")
    private String currency;

	@ApiModelProperty(value = "币种（中文）01 人民币 02 日元 03 澳元 04 美元 05 港币 06 欧元  07 英镑")
    private String currencyLabel;

	@ApiModelProperty(value = "创建人ID")
    private Long createrId;

	 @ApiModelProperty(value = "创建人")
    private String creater;

	@ApiModelProperty(value = "事业部名称")
    private String buName;
 
	@ApiModelProperty(value = "事业部id")
    private Long buId;
	@ApiModelProperty(value = "当前登录用户绑定的事业部集合")
    private List<Long> buList;
	
	@ApiModelProperty(value = "主键id集合")
	private String ids;

    /**
     * 事业部库位类型ID
     */
    @ApiModelProperty(value = "事业部库位类型ID")
    private Long stockLocationTypeId;

    /**
     * 库位类型
     */
    @ApiModelProperty(value = "库位类型")
    private String stockLocationTypeName;
	
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
    /*depotId get 方法 */
    public Long getDepotId(){
    return depotId;
    }
    /*depotId set 方法 */
    public void setDepotId(Long  depotId){
    this.depotId=depotId;
    }
    /*depotName get 方法 */
    public String getDepotName(){
    return depotName;
    }
    /*depotName set 方法 */
    public void setDepotName(String  depotName){
    this.depotName=depotName;
    }
    /*customerId get 方法 */
    public Long getCustomerId(){
    return customerId;
    }
    /*customerId set 方法 */
    public void setCustomerId(Long  customerId){
    this.customerId=customerId;
    }
    /*customerName get 方法 */
    public String getCustomerName(){
    return customerName;
    }
    /*customerName set 方法 */
    public void setCustomerName(String  customerName){
    this.customerName=customerName;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    /*processingType get 方法 */
    public String getProcessingType(){
    return processingType;
    }
    /*processingType set 方法 */
    public void setProcessingType(String  processingType){
    this.processingType=processingType;
    this.processingTypeLabel = DERP_ORDER.getLabelByKey(DERP_ORDER.processingTypeList, processingType) ;
    }
    /*deliverDate get 方法 */
    public Timestamp getDeliverDate(){
    return deliverDate;
    }
    /*deliverDate set 方法 */
    public void setDeliverDate(Timestamp  deliverDate){
    this.deliverDate=deliverDate;
    }
    /*totalNum get 方法 */
    public Integer getTotalNum(){
    return totalNum;
    }
    /*totalNum set 方法 */
    public void setTotalNum(Integer  totalNum){
    this.totalNum=totalNum;
    }
    /*totalAmount get 方法 */
    public BigDecimal getTotalAmount(){
    return totalAmount;
    }
    /*totalAmount set 方法 */
    public void setTotalAmount(BigDecimal  totalAmount){
    this.totalAmount=totalAmount;
    }
    /*operateType get 方法 */
    public String getOperateType(){
    return operateType;
    }
    /*operateType set 方法 */
    public void setOperateType(String  operateType){
    this.operateType=operateType;
    this.operateTypeLabel = DERP_ORDER.getLabelByKey(DERP_ORDER.billOutinDepot_operateTypeList, operateType) ;
    }
    /*state get 方法 */
    public String getState(){
    return state;
    }
    /*state set 方法 */
    public void setState(String  state){
    this.state=state;
    this.stateLabel = DERP_ORDER.getLabelByKey(DERP_ORDER.billOutinDepot_stateList, state) ;
    }
    /*billSource get 方法 */
    public String getBillSource(){
    return billSource;
    }
    /*billSource set 方法 */
    public void setBillSource(String  billSource){
    this.billSource=billSource;
    this.billSourceLabel = DERP_ORDER.getLabelByKey(DERP_ORDER.billOutinDepot_billSourceList, billSource) ;
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

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
        this.currencyLabel = DERP.getLabelByKey(DERP.currencyCodeList, currency) ;
    }
	public String getProcessingTypeLabel() {
		return processingTypeLabel;
	}
	public void setProcessingTypeLabel(String processingTypeLabel) {
		this.processingTypeLabel = processingTypeLabel;
	}
	public String getOperateTypeLabel() {
		return operateTypeLabel;
	}
	public void setOperateTypeLabel(String operateTypeLabel) {
		this.operateTypeLabel = operateTypeLabel;
	}
	public String getStateLabel() {
		return stateLabel;
	}
	public void setStateLabel(String stateLabel) {
		this.stateLabel = stateLabel;
	}
	public String getBillSourceLabel() {
		return billSourceLabel;
	}
	public void setBillSourceLabel(String billSourceLabel) {
		this.billSourceLabel = billSourceLabel;
	}
	public String getCurrencyLabel() {
		return currencyLabel;
	}
	public void setCurrencyLabel(String currencyLabel) {
		this.currencyLabel = currencyLabel;
	}
	public String getDeliverStartDate() {
		return deliverStartDate;
	}
	public void setDeliverStartDate(String deliverStartDate) {
		this.deliverStartDate = deliverStartDate;
	}
	public String getDeliverEndDate() {
		return deliverEndDate;
	}
	public void setDeliverEndDate(String deliverEndDate) {
		this.deliverEndDate = deliverEndDate;
	}

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getBuName() {
        return buName;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    public Long getBuId() {
        return buId;
    }

    public void setBuId(Long buId) {
        this.buId = buId;
    }

    public List<Long> getBuList() {
        return buList;
    }

    public void setBuList(List<Long> buList) {
        this.buList = buList;
    }
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}

    public Long getStockLocationTypeId() {
        return stockLocationTypeId;
    }

    public void setStockLocationTypeId(Long stockLocationTypeId) {
        this.stockLocationTypeId = stockLocationTypeId;
    }

    public String getStockLocationTypeName() {
        return stockLocationTypeName;
    }

    public void setStockLocationTypeName(String stockLocationTypeName) {
        this.stockLocationTypeName = stockLocationTypeName;
    }
}