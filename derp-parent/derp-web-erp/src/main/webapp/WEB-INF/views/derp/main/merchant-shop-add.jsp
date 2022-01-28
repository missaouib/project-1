<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- Start content -->
<div class="content">
    <div class="container-fluid mt80">
        <!-- Start row -->
          <div class="row">
           <div class="col-12">
              <div class="card-box" >
                                          <!--  title   start  -->
              <div class="col-12">
                <div>
                   <div class="col-12 row">
                    <div>
                       <ol class="breadcrumb">
                       <li><i class="block"></i> 当前位置：</li>
                       <li class="breadcrumb-item"><a href="#">公司档案</a></li>
                       <li class="breadcrumb-item "><a href="javascript:$load.a('/merchantShop/toPage.html');">店铺信息</a></li>
                       <li class="breadcrumb-item "><a href="javascript:$load.a('/merchantShop/toAddPage.html');">新增</a></li>
                    </ol>
                    </div>
                   </div>
                    <!--  title   end  -->               
                          <!--  title   基本信息   start -->
                    <div class="title_text">店铺信息</div>
                <form id="add-form">
                    <div class="form-row mt20 ml15">
                        <div class="col-4">
                            <div class="row">
                                <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr"><i class="red">*</i>店铺类型<a title="单主店：指内部公司开立的店铺且仅有一货主；外部店：指外部主体开立的店铺且可代发多货主商品；" href="#" class="dripicons-information" style="color: #00a0e9;padding-left: 5px;"></a><span>：</span></span></label>
                                <div class="col-8 ml10 line">
                                    <select class="form-control"  id="storeTypeCode" name="storeTypeCode"></select>
                                </div>

                            </div>
                        </div>
                        <div class="col-7">
                            <div class="row">
                                <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr"><i class="red">*</i>运营类型<span>：</span></span></label>
                                <div class="col-5 ml10 line">
                                    <select class="form-control"   id="shopTypeCode" name="shopTypeCode">
                                        <option value="">请选择</option>
                                        <c:forEach items="${shopTypeList}" var="shopType">
                                            <option value="${shopType.selectValue }">${shopType.selectLable }</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                     <div class="form-row  ml15">
                    <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr"><i class="red">*</i>店铺名称<span>：</span></span></label>
                            <div class="col-8 ml10 line">
                                <input type="text" required="" parsley-type="text" class="form-control" name="shopName" id="shopName" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                            </div>
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="row">
                            <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr"><i class="red">*</i>店铺编码<span>：</span></span></label>
                            <div class="col-5 ml10 line">
                                <input type="text" required="" parsley-type="text" class="form-control" name="shopCode" id="shopCode" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                            </div>
                        </div>
                    </div>
                </div>
                  <div class="form-row ml15">
                    <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr"><i class="red">*</i>数据来源<span>：</span></span></label>
                            <div class="col-8 ml10 line">
                               <select class="form-control" name="dataSourceCode" id="dataSourceCode">
                                 		<option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">状态<span>：</span></span></label>
                            <div class="col-5 ml10 line">
                               <select class="form-control" name="status" id="status">
                                    <option value="1">启用</option>
                              		<option value="0">禁用</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row  ml15">
                    <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr"><i class="red" id="merchantIdFlag">*</i>开店公司<span>：</span></span></label>
                            <div class="col-8 ml10 line" id="merchantIdDIV1" style="display: none">
                            <select class="form-control"   id="merchantId" name="merchantId" onchange="gradeChange(this);">
                            	 <option value="">请选择</option>
                                <c:forEach items="${merchantBean }" var="merchant">
                                    <option value="${merchant.id }">${merchant.name }</option>
                                </c:forEach>
                             </select>
                            </div>
                            <div class="col-8 ml10 line" id="merchantIdDIV2" style="display: none">
                                <input type="text" required="" parsley-type="text" class="form-control" name="merchantName" id="merchantId" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                            </div>
                        </div>
                    </div>
                         <div class="col-7">
                        <div class="row">
                            <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr"><i class="red">*</i>客户<span>：</span></span></label>
                            <div class="col-5 ml10 line">
                            <select class="form-control"   id="customerId" name="customerId" >
	                         </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row ml15">
                     <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr"><i class="red">*</i>平台名称<span>：</span></span></label>
                            <div class="col-8 ml10 line">
                               <select class="form-control" name="storePlatformCode" id="storePlatformCode">
                                </select>
                            </div>
                            <input name="storePlatformName" id="storePlatformName" type="hidden">
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="row">
                        <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr"><i class="red">*</i>仓库<span>：</span></span></label>
                            <div class="col-5 ml10 line">
                            <select class="form-control"   id="depotId" name="depotId" onchange="loadBuAllRows();">
	                                <option value="">请选择仓库</option>
	                         </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row ml15">
                    <div class="col-4">
                        <div class="row" id="buIdDiv">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr"><i class="red">*</i>开店事业部<span>：</span></span></label>
                            <div class="col-8 ml10 line">
                                <select class="form-control" name="buId" id="buId" onchange="replacetr();">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="row">
                            <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr"><i class="red">*</i>店铺统一ID<span>：</span></span></label>
                            <div class="col-5 ml10 line">
                                <input type="text" required="" parsley-type="text" class="form-control" name="shopUnifyId" id="shopUnifyId" onkeyup="this.value=this.value.replace(/^ +| +$/g,'')">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row ml15">
                    <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr"><i class="red">*</i>专营母品牌<span>：</span></span></label>
                            <div class="col-8 ml10 line">
                                <select class="form-control" name="superiorParentBrandId" id="superiorParentBrandId">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="row">
                            <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr"><i class="red">*</i>结算币种<span>：</span></span></label>
                            <div class="col-5 ml10 line">
                                <select class="form-control" name="currency" id="currency">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>


                <div style="display:none;">
                <div class="title_text">菜鸟商品同步</div>
                <div class="form-row ml15 mt20">
                     <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;">app key<span>：</span></label>
                            <div class="col-8 ml10 line">
                               <input name="appKey" id="appKey" type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="row">
                        <label  class="col-4 col-form-label" style="white-space:nowrap;">session key<span>：</span></label>
                            <div class="col-5 ml10 line">
                            	<input name="sessionKey" id="sessionKey" type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row ml15">
                     <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;">app secret<span>：</span></label>
                            <div class="col-8 ml10 line">
                               <input name="appSecret" id="appSecret" type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-7">
                        <div class="row">
                        <label  class="col-4 col-form-label" style="white-space:nowrap;">是否同步菜鸟商品<span>：</span></label>
                            <div class="col-5 ml10 line">
                            	<select class="form-control"   id="isSycnMerchandise" name="isSycnMerchandise" >
	                         	</select>
                            </div>
                        </div>
                    </div>
                </div>
                </div>

                </form>
                      <!--   公司主体  start -->
                      <div class="title_text">店铺货主信息</div>
                      <div class="row col-12 mt20 table-responsive">
                          <table id="datatable-buttons" class="table table-striped" cellspacing="0"
                                 width="100%">
                              <thead>
                              <tr>
                                  <th>操作</th>
                                  <th>货主公司</th>
                                  <th>货主事业部</th>
                              </tr>
                              </thead>
                              <tbody>
                              </tbody>
                          </table>
                      </div>
                      <!--保存按钮-->
                      <div class="form-row m-t-50">
                          <div class="col-12">
                              <div class="row">
                                  <div class="col-6">
                                      <button type="button" class="btn btn-info waves-effect waves-light fr btn_default" id="save-buttons">保 存</button>
                                  </div>
                                  <div class="col-6">
                                      <button type="button" class="btn btn-light waves-effect waves-light btn_default" id="cancel-buttons">取 消</button>
                                  </div>
                              </div>
                          </div>
                      </div>
                </div>
             </div>
           </div>
                  <!-- end row -->
        </div>
        <!-- container -->
    </div>

</div> <!-- content -->
		<div class="popupbg" style="display: none">
		    <div class="popup_box">
		        <img src="/resources/assets/images/uploading.gif" alt="">
		        <p>正在新增中...</p>
		    </div>
		</div>
<script src='/resources/js/system/base.js' type="text/javascript"></script>
<script type="text/javascript">
$module.constant.getConstantListByNameURL.call($('select[name="storePlatformCode"]')[0],"storePlatformList",null);
$module.constant.getConstantListByNameURL.call($('select[name="isSycnMerchandise"]')[0],"merchantShopRel_isSycnMerchandiseList",null);
$module.constant.getConstantListByNameURL.call($('select[name="storeTypeCode"]')[0],"merchantShopRel_storeTypeList",null);
$module.constant.getConstantListByNameURL.call($('select[name="dataSourceCode"]')[0],"dataSourceList","${detail.dataSourceCode}");
$module.depot.loadSelectData.call($("select[name='depotId']")[0], null, null);
$module.constant.getConstantListByNameURL.call($('select[name="currency"]')[0],"currencyCodeList","");

function gradeChange(obj){
    var merchantId = $(obj).val();
    debugger;
    //根据商家加载客户
    $module.customer.loadSelectDataByMerchantId.call($("select[name='customerId']")[0],null,"1",merchantId,null);
    replacetr();
	//加载仓库
	$module.depot.getSelectBeanByMerchantRel.call($("select[name='depotId']")[0],null,{"merchantId":merchantId});
	// 根据开店公司加载开店事业部
    $module.businessUnit.getSelectBeanByMerchantDepotRel.call($("select[name='buId']")[0],null,merchantId);
}

$(function(){
    getSuperiorList($('select[name="superiorParentBrandId"]'));
	//初始化添加一行
	addtr();
	
	//保存按钮
	$("#save-buttons").click(function(){
		var url = "/merchantShop/saveShop.asyn";	
		var form = $("#add-form").serializeArray();
		var json = {};
		$.each(form,function(i,v){
			json[v.name] = v.value;
		});

		//必填项校验
        if($("#storeTypeCode").val()==""){
            $custom.alert.error("店铺类型不能为空！");
            return ;
        }
        if($("#shopTypeCode").val()==""){
            $custom.alert.error("运营类型不能为空！");
            return ;
        }
		if($("#shopName").val()==""){
			$custom.alert.error("店铺名称不能为空！");
			return ;
		}
		if($("#shopCode").val()==""){
			$custom.alert.error("店铺编码不能为空！");
			return ;
		}
		var dataSource = $("#dataSourceCode").val();
		if(dataSource==""){
			$custom.alert.error("数据来源不能为空！");
			return ;
		}

		if($("#storeTypeCode").val()=='DZD'){
            if($("input[name='merchantId']").val()==""){
                $custom.alert.error("开店公司不能为空！");
                return ;
            }
            if($("#buId").val()==""){
                $custom.alert.error("开店事业部不能为空！");
                return ;
            }
        }

        if($("#customerId").val()==""){
            $custom.alert.error("客户不能为空！");
            return ;
        }

		if($("#depotId").val()==""){
			$custom.alert.error("仓库不能为空！");
			return ;
		}
		
		if($("#storePlatformCode").val()==""){
			$custom.alert.error("平台名称不能为空！");
			return ;
		}

        var buNameVal = $("#buId").find("option:selected").text();//事业部名称
        json['buName']=buNameVal;
        if($("#shopUnifyId").val()==""){
            $custom.alert.error("店铺统一ID不能为空！");
            return ;
        }

        if($("#superiorParentBrandId").val()==""){
            $custom.alert.error("专营母品牌不能为空！");
            return ;
        }


		//商品
        var shipperList = [];
        var merchantIds = '';
        var check=true;
        $("#datatable-buttons tbody tr").each(function (index, item) {
        	 var merchantId = $(this).find("td").eq(1).find("select").val();//公司id
        	 var merchantName = $(this).find("td").eq(1).find("select option:selected").text();//公司名称
        	 var buId = $(this).find("td").eq(2).find("select").val();//事业部id
        	 var buName = $(this).find("td").eq(2).find("select option:selected").text();//事业部名称
            // 外部店时，货主公司和货主事业部必填
            if($("#storeTypeCode").val()=='WBD'){
                if(merchantId==null||merchantId==''||merchantId==undefined){
                    $custom.alert.error("货主公司不能为空！");
                    check=false;
                    return ;
                }
                if(buId==null||buId==''||buId==undefined){
                    $custom.alert.error("货主事业部不能为空！");
                    check=false;
                    return ;
                }
            }else if($("#storeTypeCode").val()=='DZD'){
                if(merchantId && !buId){
                    $custom.alert.error("请输入完整的店铺货主信息");
                    check=false;
                    return ;
                }else if(!merchantId && buId){
                    $custom.alert.error("请输入完整的店铺货主信息");
                    check=false;
                    return ;
                }
            }
            if(merchantId && buId){
                var patt1 = new RegExp(merchantId+buId);
                if(patt1.test(merchantIds)){
                    $custom.alert.error(merchantName+"存在多条记录");
                    check=false;
                    return ;
                }
                merchantIds+=merchantId+buId+","
            }
            if(merchantId && buId){
                var shipper = {};//货主公司
                shipper.merchantId = merchantId;
                shipper.merchantName = merchantName;
                shipper.buId = buId;
                shipper.buName = buName;
                shipperList.push(shipper);
            }
        });
        json.shipperList=shipperList;
        var jsonStr = JSON.stringify(json);
        
        if(check==false) return ;//检查不通过

        $custom.request.ajaxSync(url,{"json":jsonStr},function(result){
			if(result.state == '200'){
				$custom.alert.success("新增成功！");
				setTimeout(function () {
					$load.a("/merchantShop/toPage.html");
				}, 1000);
			}else{
				if(result.expMessage != null){
					$custom.alert.error(result.expMessage);
			}else{
				$custom.alert.error("新增失败！");
			}
			}
		});
	});
	
	//返回
	$("#cancel-buttons").click(function(){
		$load.a("/merchantShop/toPage.html");
	});

    // 若电商平台改变了
    $("#storePlatformCode").change(function() {
        var platformName=$("#storePlatformCode option:selected").val();
        $("#storePlatformName").val(platformName);
    });

});
// 若店铺类型改变了
$("#storeTypeCode").change(function() {
    $("#depotId").empty();
    var storeTypeCode=$("#storeTypeCode option:selected").val();
    if(storeTypeCode=='DZD'){// 当店铺类型为“单主店”时
        //清空选择的商家
        $("select[name='merchantId'] option:first").prop('selected', 'selected');
        //清空客户
        $("select[name='customerId']").empty();
        $("#merchantIdDIV1").show();
        $("#merchantIdDIV2").hide();
        $("#buIdDiv").show();
        $("#merchantIdFlag").css("display","inline-block");
    }else if(storeTypeCode=='WBD'){// 当店铺类型为“外部店”时
        $("#merchantIdDIV1").hide();
        $("#merchantIdDIV2").show();
        $("#buIdDiv").hide();//开店事业部字段隐藏
        $module.depot.loadSelectData.call($("select[name='depotId']")[0], null, null);
        //加载全部客户
        $module.customer.loadSelectDataByDto.call($("select[name='customerId']")[0], null ,"1",null);
        $("#merchantIdFlag").css("display","none");
    }
    replacetr();
});

function getSuperiorList(obj){
    var selectObj=$(obj);
    var jsonData=$module.constant.ajax('/brandSuperior/getSelectBean.asyn');
    selectObj.empty();
    selectObj.append("<option value=''>请选择</option>");
    jsonData.forEach(function(o,i){
        selectObj.append("<option value='"+ o.value+"'>"+o.label+"</option>");
    });
}


//添加行
function addtr() {
    //加载公司
    var merchantList = $module.merchantAll.listData();
    var merchantOption = '<option value="">请选择</option>';
    var buOption = '';//事业部下拉框
    var storeTypeCode=$("#storeTypeCode option:selected").val();// 店铺类型
    if(storeTypeCode=='DZD'){// 当店铺类型为“单主店”时,货主公司均默认为开店公司，且不能修改调整；
        var shopMerchantId=$("#merchantId").val()// 开店公司
        merchantList.forEach(function(o,i){
            if (shopMerchantId != null && shopMerchantId != "" && shopMerchantId != undefined && shopMerchantId==o.value) {
                merchantOption = merchantOption+'<option value="'+ o.value+'">'+o.label+'</option>';
            }
        });
        var depotId = $("#depotId").val();
        var buId = $("#buId").val();// 开店事业部
        // 根据开店公司加载事业部
        var bUList = $module.businessUnit.getListByDepot(shopMerchantId,depotId,null);
        bUList.forEach(function(o,i){
            if(buId!=o.value){ // 货主事业部选择过滤掉开店事业部选项
                buOption = buOption+'<option value="'+ o.value+'">'+o.label+'</option>';
            }
        });
    }else{
        merchantList.forEach(function(o,i){
            merchantOption = merchantOption+'<option value="'+ o.value+'">'+o.label+'</option>';
        });
    }
    $("#datatable-buttons").append('<tr>' +
        '<td class="tc nowrap"><i class="fi-plus" onclick="addtr();"></i>&nbsp;&nbsp;&nbsp;<i class="fi-minus" onclick="deltr(this);"></i></td>' +
        '<td><select name="shipperMerchantId" class="edit_input" style="width: 200px;" onchange="loadBu(this);">'+merchantOption+'</select></td>'+
        '<td><select name="shipperBuId" class="edit_input" style="width: 150px;"><option value="">请选择</option>'+buOption+'</select></td>'+
        '</tr>');
}

//替换行
function replacetr() {
    //加载公司
    var merchantList = $module.merchantAll.listData();
    var merchantOption = '<option value="">请选择</option>';
    var buOption = '';//事业部下拉框
    var storeTypeCode=$("#storeTypeCode option:selected").val();// 店铺类型
    if(storeTypeCode=='DZD'){// 当店铺类型为“单主店”时,货主公司均默认为开店公司，且不能修改调整；
        var shopMerchantId=$("#merchantId").val()// 开店公司
        merchantList.forEach(function(o,i){
            if (shopMerchantId != null && shopMerchantId != "" && shopMerchantId != undefined && shopMerchantId==o.value) {
                merchantOption = merchantOption+'<option value="'+ o.value+'">'+o.label+'</option>';
            }
        });
        var depotId = $("#depotId").val();
        var buId = $("#buId").val();// 开店事业部
        // 根据开店公司加载事业部
        debugger;
        var bUList = $module.businessUnit.getListByDepot(shopMerchantId,depotId,null);
        bUList.forEach(function(o,i){
            if(buId!=o.value){ // 货主事业部选择过滤掉开店事业部选项
                buOption = buOption+'<option value="'+ o.value+'">'+o.label+'</option>';
            }
        });
    }else{
        merchantList.forEach(function(o,i){
            merchantOption = merchantOption+'<option value="'+ o.value+'">'+o.label+'</option>';
        });
    }
    $("#datatable-buttons tbody").html("");
    $("#datatable-buttons").append('<tr>' +
        '<td class="tc nowrap"><i class="fi-plus" onclick="addtr();"></i>&nbsp;&nbsp;&nbsp;<i class="fi-minus" onclick="deltr(this);"></i></td>' +
        '<td><select name="shipperMerchantId" class="edit_input" style="width: 200px;" onchange="loadBu(this);">'+merchantOption+'</select></td>'+
        '<td><select name="shipperBuId" class="edit_input" style="width: 150px;"><option value="">请选择</option>'+buOption+'</select></td>'+
        '</tr>');
}


//删除行
function deltr(obj) {
    var rows = $(obj).parent("td").parent("tr").parent("tbody").find("tr").length;
    if (rows<=1) {
        $(obj).parent("td").parent("tr").remove();
        addtr();
    } else if(rows>1){
    	$(obj).parent("td").parent("tr").remove();
    }
}
function loadBu(obj){
	var depotId = $("#depotId").val();
	var merchantId = $(obj).val();
    var buId = $("#buId").val();// 开店事业部
    //加载事业部
    var bUList = $module.businessUnit.getListByDepot(merchantId,depotId,null);
    var bUselect = '<option value="">请选择</option>'
    var storeTypeCode=$("#storeTypeCode option:selected").val();// 店铺类型
    if(storeTypeCode=='DZD') {// 当店铺类型为“单主店”时,货主公司均默认为开店公司，且不能修改调整；
        bUList.forEach(function(o,i){
            if(buId!=o.value){ // 货主事业部选择过滤掉开店事业部选项
                bUselect = bUselect+'<option value="'+ o.value+'">'+o.label+'</option>';
            }
        });
    }else{
        bUList.forEach(function(o,i){
            bUselect = bUselect+'<option value="'+ o.value+'">'+o.label+'</option>';
        });
    }
	var selectObj = $(obj).parent("td").next("td").children("select");
	selectObj.empty();
	selectObj.append(bUselect);
}
//仓库变化刷新所有行事业部
function loadBuAllRows(){
    var merchantId = $("#merchantId").val();
	var depotId = $("#depotId").val();
    var buId = $("#buId").val();// 开店事业部
    // 改变仓库后，根据开店公司和仓库重新加载开店事业部
    $module.businessUnit.getSelectBeanByMerchantDepotRel.call($("select[name='buId']")[0],null, merchantId,depotId,null);

	$("#datatable-buttons tbody tr").each(function (index, item) {
	     	 var merchantId = $(this).find("td").eq(1).find("select").val();//公司id
	     	 var buobj = $(this).find("td").eq(2).find("select");//事业部对象
	     	 if(merchantId==''||merchantId==null||merchantId==undefined){
	     		buobj.empty();
	     		buobj.append('<option value="">请选择</option>');
	     	    return true;
	     	 }
	     	 //加载事业部
	    	 var bUList = $module.businessUnit.getListByDepot(merchantId,depotId,null);
	    	 var bUselect = '<option value="">请选择</option>';
	    	 bUList.forEach(function(o,i){
                 if(buId!=o.value) { // 货主事业部选择过滤掉开店事业部选项
                     bUselect = bUselect+'<option value="'+ o.value+'">'+o.label+'</option>';
                 }
             });
	    	buobj.empty();
	    	buobj.append(bUselect);
	  });
}
</script>