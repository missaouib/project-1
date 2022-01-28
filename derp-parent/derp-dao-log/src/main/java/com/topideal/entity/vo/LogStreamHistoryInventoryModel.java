package com.topideal.entity.vo;
import java.io.Serializable;
import java.sql.Timestamp;

import com.topideal.common.system.ibatis.PageModel;

public class LogStreamHistoryInventoryModel extends PageModel implements Serializable{

    /**
    * 主键ID
    */
    private Long id;
    /**
    * 埋点
    */
    private String point;
    /**
    * 关键字
    */
    private String keyword;
    /**
    * 模块描述
    */
    private String model;
    /**
    * 模块编码
    */
    private String modelCode;
    /**
    * 消费时间
    */
    private Timestamp consumeDate;
    /**
    * 状态（1-成功，0-失败，2-关闭，3-重推成功）
    */
    private String status;
    /**
    * 创建时间
    */
    private Timestamp createTime;
    /**
    * 关联日志id（mongoDB）
    */
    private String logId;
    /**
    * 类型 0-冻结  1-释放冻结 2-进境国检 3-进境海关
    */
    private String type;
    /**
    * 耗时
    */
    private Double differenceTime;
    /**
    * 是否关闭(1-是，0-否)
    */
    private String isClose;
    /**
     * 错误类型
     */
     private String errorType;

    /*id get 方法 */
    public Long getId(){
    return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
    this.id=id;
    }
    /*point get 方法 */
    public String getPoint(){
    return point;
    }
    /*point set 方法 */
    public void setPoint(String  point){
    this.point=point;
    }
    /*keyword get 方法 */
    public String getKeyword(){
    return keyword;
    }
    /*keyword set 方法 */
    public void setKeyword(String  keyword){
    this.keyword=keyword;
    }
    /*model get 方法 */
    public String getModel(){
    return model;
    }
    /*model set 方法 */
    public void setModel(String  model){
    this.model=model;
    }
    /*modelCode get 方法 */
    public String getModelCode(){
    return modelCode;
    }
    /*modelCode set 方法 */
    public void setModelCode(String  modelCode){
    this.modelCode=modelCode;
    }
    /*consumeDate get 方法 */
    public Timestamp getConsumeDate(){
    return consumeDate;
    }
    /*consumeDate set 方法 */
    public void setConsumeDate(Timestamp  consumeDate){
    this.consumeDate=consumeDate;
    }
    /*status get 方法 */
    public String getStatus(){
    return status;
    }
    /*status set 方法 */
    public void setStatus(String  status){
    this.status=status;
    }
    /*createTime get 方法 */
    public Timestamp getCreateTime(){
    return createTime;
    }
    /*createTime set 方法 */
    public void setCreateTime(Timestamp  createTime){
    this.createTime=createTime;
    }
    /*logId get 方法 */
    public String getLogId(){
    return logId;
    }
    /*logId set 方法 */
    public void setLogId(String  logId){
    this.logId=logId;
    }
    /*type get 方法 */
    public String getType(){
    return type;
    }
    /*type set 方法 */
    public void setType(String  type){
    this.type=type;
    }
    /*differenceTime get 方法 */
    public Double getDifferenceTime(){
    return differenceTime;
    }
    /*differenceTime set 方法 */
    public void setDifferenceTime(Double  differenceTime){
    this.differenceTime=differenceTime;
    }
    /*isClose get 方法 */
    public String getIsClose(){
    return isClose;
    }
    /*isClose set 方法 */
    public void setIsClose(String  isClose){
    this.isClose=isClose;
    }
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}






}
