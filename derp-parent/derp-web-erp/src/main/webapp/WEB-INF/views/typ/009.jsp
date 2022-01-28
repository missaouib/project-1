<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- App favicon -->
<link rel="shortcut icon" href='<c:url value="/resources/assets/images/favicon.ico"/>'>

<!-- Start content -->
<div class="content">
    <div class="container-fluid mt60">
        <!-- Start row -->
        <div class="row">
            <div class="card-box margin table-responsive" id="border">
                 <!--  title   start  -->
              <div class="col-12 ml10">
                 <div class="col-12 row">
                       <ol class="breadcrumb">
                       <li><i class="dripicons-location"></i> 当前位置：</li>
                        <li class="breadcrumb-item"><a href="#">供应商价目详情</a></li>
                    </ol>
                 </div>
                    <!--  title   end  -->
                    <!--  title   供应商详情  start -->
                <div class="ml10 page-title col-12 borderb">
                    <div class="ml10">供应商详情</div>
                </div>
                <div class="form-row mt20 ml15">
                    <div class="col-5">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">供应商编号 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>89890834234</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label  class="col-5 col-form-label" style="white-space:nowrap;"><span class="fr">供应商名称<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>健太</div>
                            </div>
                        </div>
                    </div>
                </div>   
                  <div class="form-row mt20 ml15">
                    <div class="col-5">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">供应商简称 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>32432022</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label  class="col-5 col-form-label" style="white-space:nowrap;"><span class="fr">结算方式<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                 <div>月结</div>
                            </div>
                        </div>
                    </div>
                </div>  
                 <!--  title   供应商详情  start -->
                 <!--   商品报价  start -->
                <div class="ml10 page-title col-12 borderb mt20">
                   <div class="ml10">货品详情</div>
                </div>
                <div class="form-row mt20 ml15">
                    <div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">货品条形码 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>4713575086398A</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label  class="col-5 col-form-label" style="white-space:nowrap;"><span class="fr">品牌<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr">规格<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>6片/盒</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">货品名称<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>4713575086398A</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row ml15">
                    <div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">原产国<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label  class="col-5 col-form-label" style="white-space:nowrap;"><span class="fr">工厂源码<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label  class="col-4 col-form-label" style="white-space:nowrap;"><span class="fr">保质天数<span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>1095天</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-9"></div>
                    <div class="col-3">
                    	<button type="button" class="btn btn-info waves-effect waves-light fr" >编辑</button>
                    </div>
                </div>
                 <!--   商品报价  end -->
                 <!-- 货品报价 start -->
                 <div class="ml10 page-title col-12 borderb mt20">
                   <div class="ml10">货品报价</div>
                </div>
                <div class="form-row mt20 ml15">
                	<div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">最大供货量 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>3000</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">报价来源 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>品牌经销</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row mt20 ml15">
                	<div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">最小起订量 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>30</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">备货天数 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>90天</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">报价生效日期 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>2018-1-1 至  2018-12-31</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row mt20 ml15">
                	<div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">报价模式 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>阶梯报价</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3">
                        <div class="row">
                            <label class="col-4 col-form-label " style="white-space:nowrap;"><span class="fr">报价币种 <span>：</span></span></label>
                            <div class="col-7 ml10 line">
                                <div>美元</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-row mt20 ml15">
                	<div class="col-12">
                		<div class="card-box">
                			<h4 class="header-title m-t-0">货品阶梯报价</h4>
                			<div class="table-responsive">
                				<table class="table table-bordered" cellspacing="0" width="100%">
			                        <thead>
			                        <tr>
			                            <th>剩余效期</th>
			                            <th>数量下限</th>
			                            <th>数量上限</th>
			                            <th>供货下限</th>
			                            <th>供货上限</th>
			                        </tr>
			                        </thead>
			                        <tbody>
			                        	<tr>
			                        		<td>低于1/3</td>
			                        		<td>0</td>
			                        		<td>500</td>
			                        		<td>5</td>
			                        		<td>5.2</td>
			                        	</tr>
			                        	<tr>
			                        		<td>低于1/3</td>
			                        		<td>501</td>
			                        		<td>1000</td>
			                        		<td>4.8</td>
			                        		<td>4.9</td>
			                        	</tr>
			                        </tbody>
			                    </table>
                			</div>
                		</div>
                    </div>
                </div>
                <div class="form-row mt20 ml15">
                	<div class="col-12">
                		<div class="card-box">
                			<h4 class="header-title m-t-0">货品固定报价</h4>
                			<div class="table-responsive">
                				<table class="table table-bordered" cellspacing="0" width="100%">
			                        <thead>
			                        <tr>
			                            <th>剩余效期</th>
			                            <th>供货价下限</th>
			                            <th>供货价上线</th>
			                        </tr>
			                        </thead>
			                        <tbody>
			                        	<tr>
			                        		<td>高于1/3</td>
			                        		<td>5</td>
			                        		<td>5.5</td>
			                        	</tr>
			                        	<tr>
			                        		<td>低于1/2</td>
			                        		<td>4.8</td>
			                        		<td>5.3</td>
			                        	</tr>
			                        </tbody>
			                    </table>
                			</div>
                		</div>
                    </div>
                </div>
                <div class="form-row mt20">
                      	<div class="form-inline m0auto">
                          		<div class=form-group>
                          			<button type="button" class="btn btn-info waves-effect waves-light fr" >保存</button>
                          			<button type="button" class="btn btn-light waves-effect waves-light ml15" >取消</button>
                          		</div>
                          	</div>
                      </div>
                 <!-- 货品报价 end -->
            <!-- end row -->
            </div>
            <!-- container -->
        </div>

    </div> <!-- content -->
<script type="text/javascript">
	$(function(){
		//保存按钮
		$("#save-buttons").click(function(){
			var url = "/merchandise/saveMerchandise.asyn";
			var form = $("#add-form").serializeArray();
			$custom.request.ajax(url, form, function(result){
				if(result.state == '200'){
					$custom.alert.success("添加成功！");
					setTimeout(function () {
						$load.a("/merchandise/toPage.html");
					}, 1000);
				}else{
					$custom.alert.error("添加失败！");
				}
			});
		});
		
		//取消按钮
		$("#cancel-buttons").click(function(){
			$load.a("/merchandise/toPage.html");
		});
		
	});
	
	//table
	$(document).ready(function() {
	    // $custom.alert.input();
	     //初始化
	     $mytable.fn.init();
	     //配置表格参数
	     $mytable.params={
	         url:'/merchandise/listMerchandise.asyn?r='+Math.random(),
	         columns:[{ //复选框单元格
	             className: "td-checkbox",
	             orderable: false,
	             width: "30px",
	             data: null,
	             render: function (data, type, row, meta) {
	                 return '<input type="checkbox" class="iCheck">';
	             }
	         },{  //序号
	             data : null,  
	             bSortable : false,  
	             className : "text-right",  
	             width : "30px",  
	             render : function(data, type, row, meta) {  
	                 // 显示行号  
	                 var startIndex = meta.settings._iDisplayStart;  
	                 return startIndex + meta.row + 1;  
	                     }  
	         },
	         {data:'code'},{data:'name'},{data:'unit'},{data:'filingPrice'},{data:'factoryCode'},{data:'barcode'},
	         { //操作
	             orderable: false,
	             width: "130px",
	             data: null,
	             render: function (data, type, row, meta) {
	             	var edit = "";
	             	if(row.source !='1'){
	             		edit = '<a href="javascript:edit('+row.id+')">编辑</a>'
	             	}
	                 return edit + '  <a href="javascript:details('+row.id+')">详情</a>';
	             }
	         },
	         ],
	         formid:'#form1'
	     };
	     //生成列表信息
	     $('#datatable-buttons').mydatatables();

	 } );

	 function searchData(){
	     $mytable.fn.reload();
	 }

	 //新增
	 $("#add-buttons").click(function(){
	 	$load.a("/merchandise/toAddPage.html");
	 });

	 //详情
	 function details(id){
	 	$load.a("/merchandise/toDetailsPage.html?id="+id);
	 }
	 
	 //编辑
	 function edit(id){
	 	$load.a("/merchandise/toEditPage.html?id="+id);
	 }

	 /**
	  * 全选
	  */
	 $('#datatable-buttons').on("change", ":checkbox", function() {
	     // 列表复选框
	     if ($(this).is("[name='keeperUserGroup-checkable']")) {
	         // 全选
	         $(":checkbox", '#datatable-buttons').prop("checked",$(this).prop("checked"));
	     }else{
	         // 一般复选
	         var checkbox = $("tbody :checkbox", '#datatable-buttons');
	         $(":checkbox[name='cb-check-all']", '#datatable-buttons').prop('checked', checkbox.length == checkbox.filter(':checked').length);
	     }
	 });
</script>
