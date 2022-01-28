package com.topideal.entity.vo.common;
import java.io.Serializable;
import java.sql.Timestamp;

import com.topideal.common.system.ibatis.PageModel;

public class SdSaleTypeModel extends PageModel implements Serializable{

    /**
    * ID
    */
    private Long id;
    /**
    * 销售SD类型
    */
    private String sdType;
    /**
    * 销售SD简称
    */
    private String sdTypeName;
    /**
    * 映射费项id
    */
    private Long projectId;
    /**
    * 映射费项名称
    */
    private String projectName;
    /**
    * NC收支费项id
    */
    private Long paymentSubjectId;
    /**
    * NC收支费项名称
    */
    private String paymentSubjectName;
    /**
    * 状态 1- 启用 2-禁用
    */
    private String status;
    /**
    * 创建人id
    */
    private Long creator;
    /**
    * 创建人名称
    */
    private String createName;
    /**
    * 创建时间
    */
    private Timestamp createDate;
    /**
    * 修改人id
    */
    private Long modifier;
    /**
    * 修改人名称
    */
    private String modifiyName;
    /**
    * 修改时间
    */
    private Timestamp modifyDate;

    /**
     * 类型 1-单比例 2-多比例
     */
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*id get 方法 */
    public Long getId(){
    return id;
    }
    /*id set 方法 */
    public void setId(Long  id){
    this.id=id;
    }
    /*sdType get 方法 */
    public String getSdType(){
    return sdType;
    }
    /*sdType set 方法 */
    public void setSdType(String  sdType){
    this.sdType=sdType;
    }
    /*sdTypeName get 方法 */
    public String getSdTypeName(){
    return sdTypeName;
    }
    /*sdTypeName set 方法 */
    public void setSdTypeName(String  sdTypeName){
    this.sdTypeName=sdTypeName;
    }
    /*projectId get 方法 */
    public Long getProjectId(){
    return projectId;
    }
    /*projectId set 方法 */
    public void setProjectId(Long  projectId){
    this.projectId=projectId;
    }
    /*projectName get 方法 */
    public String getProjectName(){
    return projectName;
    }
    /*projectName set 方法 */
    public void setProjectName(String  projectName){
    this.projectName=projectName;
    }
    /*paymentSubjectId get 方法 */
    public Long getPaymentSubjectId(){
    return paymentSubjectId;
    }
    /*paymentSubjectId set 方法 */
    public void setPaymentSubjectId(Long  paymentSubjectId){
    this.paymentSubjectId=paymentSubjectId;
    }
    /*paymentSubjectName get 方法 */
    public String getPaymentSubjectName(){
    return paymentSubjectName;
    }
    /*paymentSubjectName set 方法 */
    public void setPaymentSubjectName(String  paymentSubjectName){
    this.paymentSubjectName=paymentSubjectName;
    }
    /*status get 方法 */
    public String getStatus(){
    return status;
    }
    /*status set 方法 */
    public void setStatus(String  status){
    this.status=status;
    }
    /*creator get 方法 */
    public Long getCreator(){
    return creator;
    }
    /*creator set 方法 */
    public void setCreator(Long  creator){
    this.creator=creator;
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
    /*modifiyName get 方法 */
    public String getModifiyName(){
    return modifiyName;
    }
    /*modifiyName set 方法 */
    public void setModifiyName(String  modifiyName){
    this.modifiyName=modifiyName;
    }
    /*modifyDate get 方法 */
    public Timestamp getModifyDate(){
    return modifyDate;
    }
    /*modifyDate set 方法 */
    public void setModifyDate(Timestamp  modifyDate){
    this.modifyDate=modifyDate;
    }






}
