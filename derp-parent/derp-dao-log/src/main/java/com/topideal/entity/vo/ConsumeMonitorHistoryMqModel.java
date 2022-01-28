package com.topideal.entity.vo;
import java.io.Serializable;
import java.sql.Timestamp;
import java.math.BigDecimal;

import com.topideal.common.system.ibatis.PageModel;

/**
 * MQ消费监控历史表
 * @author lian_
 */
public class ConsumeMonitorHistoryMqModel extends PageModel implements Serializable{

	// 创建时间
	private Timestamp createTime;
	// 模块编码
	private String modelCode;
	// 关闭时间
	private Timestamp closeTime;
	// 模块描述
	private String model;
	// id
	private Long id;
	// 消费时间
	private Timestamp consumeDate;
	// 关键字
	private String keyword;
	// 埋点
	private String point;
	// 状态（1-成功，0-失败）
	private String status;
	// 关联日志id（mongoDB）
	private String logId;
	// 类型（用于冻结/释放库存）0-冻结 1-释放冻结
	private String type;
	// 耗时
	private Double differenceTime;
	// 失败原因
	private String expMsg;
	 //是否已重推（0：否   1：是）
    private String isResend;
    //重推时间
    private Timestamp resendDate;

    /*consumeDate get 方法 */
    public Timestamp getConsumeDate(){
        return consumeDate;
    }
    /*consumeDate set 方法 */
    public void setConsumeDate(Timestamp  consumeDate){
        this.consumeDate=consumeDate;
    }
    /*type get 方法 */
    public String getType(){
        return type;
    }
    /*type set 方法 */
    public void setType(String  type){
        this.type=type;
    }
    /*expMsg get 方法 */
    public String getExpMsg(){
        return expMsg;
    }
    /*expMsg set 方法 */
    public void setExpMsg(String  expMsg){
        this.expMsg=expMsg;
    }
    /*point get 方法 */
    public String getPoint(){
        return point;
    }
    /*point set 方法 */
    public void setPoint(String  point){
        this.point=point;
    }
    /*resendDate get 方法 */
    public Timestamp getResendDate(){
        return resendDate;
    }
    /*resendDate set 方法 */
    public void setResendDate(Timestamp  resendDate){
        this.resendDate=resendDate;
    }
    /*differenceTime get 方法 */
    public Double getDifferenceTime(){
        return differenceTime;
    }
    /*differenceTime set 方法 */
    public void setDifferenceTime(Double  differenceTime){
        this.differenceTime=differenceTime;
    }
    /*createTime get 方法 */
    public Timestamp getCreateTime(){
        return createTime;
    }
    /*createTime set 方法 */
    public void setCreateTime(Timestamp  createTime){
        this.createTime=createTime;
    }
    /*modelCode get 方法 */
    public String getModelCode(){
        return modelCode;
    }
    /*modelCode set 方法 */
    public void setModelCode(String  modelCode){
        this.modelCode=modelCode;
    }
    /*closeTime get 方法 */
    public Timestamp getCloseTime(){
        return closeTime;
    }
    /*closeTime set 方法 */
    public void setCloseTime(Timestamp  closeTime){
        this.closeTime=closeTime;
    }
    /*model get 方法 */
    public String getModel(){
        return model;
    }
    /*model set 方法 */
    public void setModel(String  model){
        this.model=model;
    }
    /*logId get 方法 */
    public String getLogId(){
        return logId;
    }
    /*logId set 方法 */
    public void setLogId(String  logId){
        this.logId=logId;
    }
    /*id get 方法 */
    public Long getId(){
        return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
        this.id=id;
    }
    /*keyword get 方法 */
    public String getKeyword(){
        return keyword;
    }
    /*keyword set 方法 */
    public void setKeyword(String  keyword){
        this.keyword=keyword;
    }
    /*status get 方法 */
    public String getStatus(){
        return status;
    }
    /*status set 方法 */
    public void setStatus(String  status){
        this.status=status;
    }
    /*isResend get 方法 */
    public String getIsResend(){
        return isResend;
    }
    /*isResend set 方法 */
    public void setIsResend(String  isResend){
        this.isResend=isResend;
    }






}
