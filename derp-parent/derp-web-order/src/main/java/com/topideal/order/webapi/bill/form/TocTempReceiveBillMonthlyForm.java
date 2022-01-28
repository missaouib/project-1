package com.topideal.order.webapi.bill.form;

import com.topideal.common.system.webapi.PageForm;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author: Wilson Lau
 * @Date: 2021/11/18 13:40
 * @Description: Toc暂估应收月结快照
 */
public class TocTempReceiveBillMonthlyForm extends PageForm implements Serializable {

    @ApiModelProperty(value = "token", required = true)
    private String token;

    @ApiModelProperty(value = "ids", required = false)
    private String ids;

    @ApiModelProperty(value = "电商平台编码：第e仓：100011111；京东自营：100044998；京东POP-拜耳：10002075；菜鸟：1000000310；拼多多：1000004790", required = false)
    private String storePlatformCode;

    @ApiModelProperty(value = "客户id",required = false)
    private Long customerId;

    @ApiModelProperty(value = "店铺类型值编码 001:POP; 002:一件代发",required = false)
    private String shopTypeCode;

    @ApiModelProperty(value = "结算状态：0-未结算 1-部分结算 2-已结算",required = false)
    private String settlementStatus;

    @ApiModelProperty(value = "店铺编码算",required = false)
    private String shopCode;

    @ApiModelProperty(value = "月结月份",required = false)
    private String month;

    @ApiModelProperty(value = "事业部", required = false)
    private Long buId;

    @ApiModelProperty(value = "暂估类型 0-收入 1-费用")
    private String type;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getStorePlatformCode() {
        return storePlatformCode;
    }

    public void setStorePlatformCode(String storePlatformCode) {
        this.storePlatformCode = storePlatformCode;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getShopTypeCode() {
        return shopTypeCode;
    }

    public void setShopTypeCode(String shopTypeCode) {
        this.shopTypeCode = shopTypeCode;
    }

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Long getBuId() {
        return buId;
    }

    public void setBuId(Long buId) {
        this.buId = buId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
