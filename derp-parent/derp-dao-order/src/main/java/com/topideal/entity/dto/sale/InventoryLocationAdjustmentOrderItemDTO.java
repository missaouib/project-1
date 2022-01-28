package com.topideal.entity.dto.sale;
import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.topideal.common.constant.DERP;
import com.topideal.common.constant.DERP_ORDER;
import com.topideal.common.system.ibatis.PageModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class InventoryLocationAdjustmentOrderItemDTO extends PageModel implements Serializable{

	@ApiModelProperty(value = "id")
    private Long id;
 
	@ApiModelProperty(value = "库位调整单id")
    private Long inventoryLocationId;
    
	@ApiModelProperty(value = "关联外部单号")
    private String externalCode;
    
	@ApiModelProperty(value = "系统订单号")
    private String orderCode;
    
	@ApiModelProperty(value = "调增商品ID")
    private Long increaseGoodsId;
   
	@ApiModelProperty(value = "调增商品货号")
    private String increaseGoodsNo;
   
	@ApiModelProperty(value = "调增商品编码")
    private String increaseGoodsCode;
  
	@ApiModelProperty(value = "调增商品名称")
    private String increaseGoodsName;
  
	@ApiModelProperty(value = "调减商品ID")
    private Long reduceGoodsId;
  
	@ApiModelProperty(value = "调减商品货号")
    private String reduceGoodsNo;
   
	@ApiModelProperty(value = "调减商品编码")
    private String reduceGoodsCode;
    
	@ApiModelProperty(value = "调减商品名称")
    private String reduceGoodsName;
   
	@ApiModelProperty(value = "调整数量")
    private Integer adjustNum;
    
	@ApiModelProperty(value = "库存类型 0：好品 1：坏品")
    private String inventoryType;
	
	@ApiModelProperty(value = "库存类型（中文）")
    private String inventoryTypeLabel;
    
	@ApiModelProperty(value = "创建时间")
    private Timestamp createDate;
   
	@ApiModelProperty(value = "修改时间")
    private Timestamp modifyDate;

	@ApiModelProperty(value = "仓库名称")
    private String depotName;

	@ApiModelProperty(value = "事业部名称")
    private String buName;

	@ApiModelProperty(value = "归属月份")
    private String ownMonth;

	@ApiModelProperty(value = "备注")
    private String remark;
    
	@ApiModelProperty(value = "调增商品原货号")
    private String increaseOriginalGoodsNo;
  
	@ApiModelProperty(value = "调增商品原货号id")
    private Long increaseOriginalGoodsId;
  
	@ApiModelProperty(value = "调减商品原货号")
    private String reduceOriginalGoodsNo;
  
	@ApiModelProperty(value = "调减商品原货号id")
    private Long reduceOriginalGoodsId;
   
	@ApiModelProperty(value = "平台编码")
    private String platformCode;
    
	@ApiModelProperty(value = "平台名称")
    private String platformName;
   
	@ApiModelProperty(value = " 店铺编码")
    private String shopCode;
  
	@ApiModelProperty(value = "店铺名称")
    private String shopName;
  
	@ApiModelProperty(value = "理货单位 00-托盘 01-箱 02-件")
    private String tallyingUnit;
	
	@ApiModelProperty(value = "理货单位（中文）")
    private String tallyingUnitLabel;

    /*id get 方法 */
    public Long getId(){
    return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
    this.id=id;
    }
    /*inventoryLocationId get 方法 */
    public Long getInventoryLocationId(){
    return inventoryLocationId;
    }
    /*inventoryLocationId set 方法 */
    public void setInventoryLocationId(Long  inventoryLocationId){
    this.inventoryLocationId=inventoryLocationId;
    }
    /*externalCode get 方法 */
    public String getExternalCode(){
    return externalCode;
    }
    /*externalCode set 方法 */
    public void setExternalCode(String  externalCode){
    this.externalCode=externalCode;
    }
    /*orderCode get 方法 */
    public String getOrderCode(){
    return orderCode;
    }
    /*orderCode set 方法 */
    public void setOrderCode(String  orderCode){
    this.orderCode=orderCode;
    }
    /*increaseGoodsId get 方法 */
    public Long getIncreaseGoodsId(){
    return increaseGoodsId;
    }
    /*increaseGoodsId set 方法 */
    public void setIncreaseGoodsId(Long  increaseGoodsId){
    this.increaseGoodsId=increaseGoodsId;
    }
    /*increaseGoodsNo get 方法 */
    public String getIncreaseGoodsNo(){
    return increaseGoodsNo;
    }
    /*increaseGoodsNo set 方法 */
    public void setIncreaseGoodsNo(String  increaseGoodsNo){
    this.increaseGoodsNo=increaseGoodsNo;
    }
    /*increaseGoodsCode get 方法 */
    public String getIncreaseGoodsCode(){
    return increaseGoodsCode;
    }
    /*increaseGoodsCode set 方法 */
    public void setIncreaseGoodsCode(String  increaseGoodsCode){
    this.increaseGoodsCode=increaseGoodsCode;
    }
    /*increaseGoodsName get 方法 */
    public String getIncreaseGoodsName(){
    return increaseGoodsName;
    }
    /*increaseGoodsName set 方法 */
    public void setIncreaseGoodsName(String  increaseGoodsName){
    this.increaseGoodsName=increaseGoodsName;
    }
    /*reduceGoodsId get 方法 */
    public Long getReduceGoodsId(){
    return reduceGoodsId;
    }
    /*reduceGoodsId set 方法 */
    public void setReduceGoodsId(Long  reduceGoodsId){
    this.reduceGoodsId=reduceGoodsId;
    }
    /*reduceGoodsNo get 方法 */
    public String getReduceGoodsNo(){
    return reduceGoodsNo;
    }
    /*reduceGoodsNo set 方法 */
    public void setReduceGoodsNo(String  reduceGoodsNo){
    this.reduceGoodsNo=reduceGoodsNo;
    }
    /*reduceGoodsCode get 方法 */
    public String getReduceGoodsCode(){
    return reduceGoodsCode;
    }
    /*reduceGoodsCode set 方法 */
    public void setReduceGoodsCode(String  reduceGoodsCode){
    this.reduceGoodsCode=reduceGoodsCode;
    }
    /*reduceGoodsName get 方法 */
    public String getReduceGoodsName(){
    return reduceGoodsName;
    }
    /*reduceGoodsName set 方法 */
    public void setReduceGoodsName(String  reduceGoodsName){
    this.reduceGoodsName=reduceGoodsName;
    }
    /*adjustNum get 方法 */
    public Integer getAdjustNum(){
    return adjustNum;
    }
    /*adjustNum set 方法 */
    public void setAdjustNum(Integer  adjustNum){
    this.adjustNum=adjustNum;
    }
    /*inventoryType get 方法 */
    public String getInventoryType(){
    return inventoryType;
    }
    /*inventoryType set 方法 */
    public void setInventoryType(String  inventoryType){
        this.inventoryType=inventoryType;
        if(StringUtils.isNotBlank(inventoryType)){
            this.inventoryTypeLabel= DERP_ORDER.getLabelByKey(DERP_ORDER.inventoryLocationAdjustmentOrderItem_inventoryTypeList, inventoryType);
        }
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

    public String getInventoryTypeLabel() {
        return inventoryTypeLabel;
    }

    public void setInventoryTypeLabel(String inventoryTypeLabel) {
        this.inventoryTypeLabel = inventoryTypeLabel;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public String getBuName() {
        return buName;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    public String getOwnMonth() {
        return ownMonth;
    }

    public void setOwnMonth(String ownMonth) {
        this.ownMonth = ownMonth;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIncreaseOriginalGoodsNo() {
        return increaseOriginalGoodsNo;
    }

    public void setIncreaseOriginalGoodsNo(String increaseOriginalGoodsNo) {
        this.increaseOriginalGoodsNo = increaseOriginalGoodsNo;
    }

    public Long getIncreaseOriginalGoodsId() {
        return increaseOriginalGoodsId;
    }

    public void setIncreaseOriginalGoodsId(Long increaseOriginalGoodsId) {
        this.increaseOriginalGoodsId = increaseOriginalGoodsId;
    }

    public String getReduceOriginalGoodsNo() {
        return reduceOriginalGoodsNo;
    }

    public void setReduceOriginalGoodsNo(String reduceOriginalGoodsNo) {
        this.reduceOriginalGoodsNo = reduceOriginalGoodsNo;
    }

    public Long getReduceOriginalGoodsId() {
        return reduceOriginalGoodsId;
    }

    public void setReduceOriginalGoodsId(Long reduceOriginalGoodsId) {
        this.reduceOriginalGoodsId = reduceOriginalGoodsId;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getTallyingUnit() {
        return tallyingUnit;
    }

    public void setTallyingUnit(String tallyingUnit) {
        this.tallyingUnit = tallyingUnit;
        this.tallyingUnitLabel = DERP.getLabelByKey(DERP.order_tallyingUnitList, tallyingUnit);
    }
	public String getTallyingUnitLabel() {
		return tallyingUnitLabel;
	}
    
}
