<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<jsp:include page="/WEB-INF/views/common.jsp" />
<!-- Start content -->
<div class="content">
    <div class="container-fluid mt80">
        <!-- Start row -->
            <div class="row">
                <!--  title   start  -->
                <div class="col-12">
                    <div class="card-box">
                        <div class="col-12 row">
                            <div>
                                <ol class="breadcrumb">
                                    <li><i class="block"></i> 当前位置：</li>
                                    <li class="breadcrumb-item"><a href="#">财务进销存报表</a></li>
                                </ol>
                            </div>
                        </div>
                        <!--  title   end  -->
                        <div class="form_box">
                         <form id="form1">
                            <div>
                                <div class="form_item h35">
	                                <span class="msg_title"><i class="red">*</i>年月 :</span>
	                                <input type="text" required="" parsley-type="text" class="input_msg date-input" name="month" value='${now }'>
	                                <span class="msg_title">条码 :</span>
	                                <input class="input_msg" type="text" name="barcode">
	                                <span class="msg_title">二级分类 :</span>
                                    <select name="typeId" class="input_msg" id="typeId">
	                                   <option value="">全部</option>
	                                </select>
                                    <div class="fr">
                                        <button type="button" class="btn btn-find waves-effect waves-light btn_default" id="reload">查询</button>
                                        <button type="reset" class="btn btn-light waves-effect waves-light btn_default">重置</button>
                                    </div>
                                </div>
                            </div>
                            <div >
                                <div class="form_item h35">
                                    <span class="msg_title">仓库 :</span>
	                                <select name="depotId" class="input_msg" id="depotId">
	                                   <option value="">全部</option>
	                                </select>
	                                <span class="msg_title">标准品牌 :</span>
	                                <select name="brandId" class="input_msg" id="brandId">
	                                   <option value="">请选择</option>
	                                </select>
	                                  <input class="input_msg" type="hidden" name="brandIds" id="brandIds">
                                </div>
                            </div>
                             </form>
                        </div>
                       <div class="row col-md-12 mt20">
                            <div class="button-list">
								<shiro:hasPermission name="finance_createTask">
									<input type="button" class="btn btn-find waves-effect waves-light btn-sm" id="createTask" value="生成excel"/>
								</shiro:hasPermission>
								<shiro:hasPermission name="finance_flashInventorSummary">
<!-- 									<input type="button" class="btn btn-find waves-effect waves-light btn-sm" id="flashReport" value="刷新报表"/>
 -->									<label for="syn">
										<!-- <input type="checkbox" id="syn" name="syn">同步数据 -->
									</label>
									<input type="hidden"  id="selectTime" required="" >
								</shiro:hasPermission>
								<label id="labelTime" style="color: red;margin-left: 20px;"></label>
								<label id="labelStatus" style="color: red;"></label>
                            </div>
                        </div>
                        <div class="row col-12 mt20 table-responsive">
                            <table id="datatable-buttons" class="table table-striped" cellspacing="0" width="100%">
                                <thead>
                                <tr>
                                	<th>序号</th>
									<th style="min-width: 100px">标准品牌</th>
									<th style="min-width: 200px">二级分类</th>
									<th style="min-width: 100px">货号</th>
									<th style="min-width: 100px">标准条码</th>
									<th style="min-width: 100px">条形码</th>
									<th style="min-width: 200px">商品名称</th>
									<th>期初数量</th>
									<th>期初金额</th>
									<th>标准成本单价</th>
									<th>本期采购在途数量</th>
									<th>本期采购在途金额</th>
									<th>本期采购入库数量</th>
									<th>本期采购入库金额</th>
									<th>来货残损数量</th>
									<th>来货残损金额</th>
									<th>本期采购结转数量(汇总)</th>
									<th>本期采购结转金额(汇总)</th>
									<th>本期销售已上架数量</th>
									<th>本期销售已上架金额</th>
									<th>出库残损数量</th>
									<th>出库残损金额</th>
									<th>本期销售结转数量(汇总)</th>
									<th>本期销售结转金额(汇总)</th>
									<th>本月销毁数量</th>
									<th>本月销毁金额</th>
									<th>盘盈数量</th>
									<th>盘盈金额</th>
									<th>盘亏数量</th>
									<th>盘亏金额</th>																																																				
									<th>本期损益结转数量(汇总)</th>
									<th>本期损益结转金额(汇总)</th>
									<th>期末结存数量</th>
									<th>期末结存金额</th>
									<th>【调整】标准成本单价</th>
									<th>【调整】期末结存金额</th>
									<th>差异金额</th>
									<th>累计采购在途数量</th>
									<th>累计采购在途金额</th>
									<th>累计销售在途数量</th>
									<th>累计销售在途金额</th>
									<th>累计调拨在途数量</th>
									<th>累计调拨在途金额</th>									
                                </tr>
                                </thead>
                                <tbody>
                               
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!--======================Modal框===========================  -->
                    <!-- end row -->

                </div>
                <!-- container -->
            </div>

    </div> <!-- content -->
</div>
<script type="text/javascript">
$("button[type='reset']").click(function(){
     $(".goods_select2").each(function(){
        $(this).val("");
    }); 
});
//加载仓库
$module.depot.loadSelectByType.call($('select[name="depotId"]')[0],'a,c,d');
$module.merchandiseCat.getMerchandiseCat.call($('select[name="typeId"]')[0],'1',null);
$module.brand.loadParentBrandSelect.call($('select[name="brandId"]')[0],null);
$(document).ready(function() {
    $(".date-input").datetimepicker({
		 format: 'yyyy-mm',
	        autoclose: true,
	        todayBtn: true,
	        startView: 'year',
	        minView:'year',
	        maxView:'decade',
	        language:  'zh-CN',
   });
    $("#selectTime").datetimepicker({
        language:  'zh-CN',
        format: "yyyy-mm-dd",
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2
    });
    //初始化
    $mytable.fn.init();
    //配置表格参数
    $mytable.params={
        url:serverAddr+'/finance/financeSummaryList.asyn?r='+Math.random(),
        columns:[{  //序号
            data : null,
            bSortable : false,
            className : "",
            render : function(data, type, row, meta) {
                // 显示行号
                var startIndex = meta.settings._iDisplayStart;
                return startIndex + meta.row + 1;
               }
            },					
            {data:'brandName'},{data:'typeName'},{data:'goodsNo'},{data:'commbarcode'},{data:'barcode'},{data:'goodsName'},         
            {data:'initNum'},{data:'initAmount'},{data:'price'},{data:'purchaseNotshelfNum'},{data:'purchaseNotshelfAmount'},
            {data:'warehouseNum'},{data:'warehouseAmount'},{data:'inDamagedNum'},{data:'inDamagedAmount'},
            {data:'purchaseEndNum'},{data:'purchaseEndAmount'},{data:'saleShelfNum'},{data:'saleShelfAmount'},{data:'outDamagedNum'},{data:'outDamagedAmount'},
            {data:'saleEndNum'},{data:'saleEndAmount'},{data:'destroyNum'},{data:'destroyAmount'},
            {data:'profitNum'},{data:'profitAmount'},{data:'lossNum'},{data:'lossAmount'},
            {data:'lossOverflowNum'},{data:'lossOverflowAmount'},{data:'endNum'},{data:'endAmount'},
            {data:'tzPrice'},{data:'tzEndAmount'},{data:'differenceAmount'},{data:'addPurchaseNotshelfNum'},                      
            {data:'addPurchaseNotshelfAmount'},{data:'addSaleNoshelfNum'},{data:'addSaleNoshelfAmount'},
            {data:'addTransferNoshelfNum'},{data:'addTransferNoshelfAmount'}
            

	
        ],
        formid:'#form1'
    }
    //每一行都进行 回调
    $mytable.rewriter.fnRowCallback=function(nRow, aData, iDisplayIndex){
    	$("#labelTime").text("生成时间："+aData.createDate);
    	if(aData.status=='030'){
    	   $("#labelStatus").text("账表状态：已关账");
    	}else{
    	   $("#labelStatus").text("账表状态：未关账");
    	}
    	//出库残损负号显示
    	if(aData.outDamagedNum>0){
    	   $('td:eq(20)', nRow).html('-'+aData.outDamagedNum);
    	}
    };
   
  //生成列表信息
  $('#datatable-buttons').mydatatables();
  
  $("#flashReport").click(function(){
		var depotId = $('select[name="depotId"]').val();
		var month = $('input[name="month"]').val();
		var syn = $('input[name="syn"]').is(':checked');
		var selectTime = $("#selectTime").val();//指定同步数据日期
		
		if(month==null||month==""||month==undefined){
			$custom.alert.error("请输入年月");
			return false;
		}
		$custom.alert.warning("确定刷新本月报表?",function(){
			var urlp = serverAddr+'/finance/flashInventorSummary.asyn';
			$custom.request.ajax(urlp,{"depotId":depotId,"month":month,"syn":syn,"selectTime":selectTime},function(result){
				if(result.state==200&&result.data.code=='00'){
					$custom.alert.success("正在刷新,请稍后再查询");
					$mytable.fn.reload();
				}else{
					$custom.alert.error(result.data.message);
				}
			});
		})
		
	})
	
	$("#reload").click(function(){
		$("#labelTime").text("");
		$("#labelStatus").text("");
		var month = $('input[name="month"]').val();
		var brandIds = $('select[name="brandId"]').val();
		if(month==null||month==""||month==undefined){
			$custom.alert.error("请选择年月");
			return false;
		}
		$("#brandIds").val(brandIds);
		$mytable.fn.reload();
		 //生成列表信息
	    $('#datatable-buttons').mydatatables();
	});
  
  $("#exportReport").on("click",function(){
		 var depotId = $('select[name="depotId"]').val();
		 var month = $('input[name="month"]').val();
		 if(depotId==null||depotId==""||depotId==undefined||month==null||month==""||month==undefined){
			$custom.alert.error("请输入仓库和年月");
			return false;
		 }
		 var barcode = $('input[name="barcode"]').val();
		 var productName = $('input[name="productName"]').val();	 
		 $custom.alert.warning("确定导出选中对象？",function(){
	            var url = serverAddr+"/finance/exportFinance.asyn?depotId="+depotId+"&month="
	            		+month+"&barcode="+barcode+"&productName="+productName;
	            //window.open(url); 
	            $downLoad.downLoadByUrl(url);
	     });
	});
});

$("#createTask").on("click",function(){
	 var month = $('input[name="month"]').val();
	 if(month==null||month==""||month==undefined){
		$custom.alert.error("请输入年月");
		return false;
	 }
  	 //创建生成excel任务
  	 var createUrl = serverAddr+'/finance/createTask.asyn';; 
  	 $custom.request.ajax(createUrl,{"ownMonth":month},function(result){
	     if(result.state==200&&result.data.code=='00'){
			  $custom.alert.success("请在报表任务列表查看进度");
		  }else{
			  $custom.alert.error(result.data.message);
		  }
     });
});

</script>
