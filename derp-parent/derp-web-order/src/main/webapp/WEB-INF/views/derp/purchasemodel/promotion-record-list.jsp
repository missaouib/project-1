<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!-- Start content  -->
<jsp:include page="/WEB-INF/views/common.jsp" />
<div class="content">
    <div class="container-fluid mt80">
        <!-- end row -->
        <div class="row">
            <div class="col-12">
                <div class="card-box table-responsive">
                    <div class="col-12 row">
                        <div>
                            <ol class="breadcrumb">
                                <li><i class="block"></i> 当前位置：</li>
                                <li class="breadcrumb-item"><a href="#">采购模型管理</a></li>
                                <li class="breadcrumb-item "><a href="javascript:$load.a('/promotionRecord/toPage.html');">促销记录</a></li>
                            </ol>
                        </div>
                    </div>
                    <!--  过滤条件查询  start  -->
                    <div style="width: 100%;">
                        <form id="form1" >
                            <div class="form_box">
                                <div class="form_con">
                                    <div class="form_item h35">
                                        <span class="">公司 :</span>
                                        <select name="merchantId" class="input_msg" id="merchantId">
                                            <option value="">请选择</option>
                                            <c:forEach items="${merchantList }" var="merchant">
                                                <option value="${merchant.value }">${merchant.label }</option>
                                            </c:forEach>
                                        </select>
                                        <span class="msg_title">促销日期 :</span>
                                        <input type="text" class="input_msg form_datetime date-input" name="startDateStr">
                                        ——
                                        <input type="text" class="input_msg form_datetime date-input" name="endDateStr">
                                        <span class="msg_title">平台名称 :</span>
                                        <select class="input_msg" name="storePlatformCode" id="storePlatformCode">
                                        </select>
                                        <div class="fr">
                                            <button type="button" class="btn btn-find waves-effect waves-light btn_default" onclick='searchData();'>查询</button>
                                            <button type="reset" class="btn btn-light waves-effect waves-light reset btn_default">重置</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- 过滤条件查询  end  -->

                    <div class="row col-md-12 mt20">
                        <shiro:hasPermission name="promotionRecord_add">
                            <button type="button" class="btn btn-find waves-effect waves-light btn_default" id="add-buttons" onclick="$m12001.init(0, null);">新增</button>
                        </shiro:hasPermission>
                        <shiro:hasPermission name="promotionRecord_exportRecord">
                            <button type="button" class="btn btn_default" id="export-button" onclick="exportInfo();" disabled>导出</button>
                        </shiro:hasPermission>
                    </div>
                    <div class="row mt20">
                        <table id="datatable-buttons" class="table table-striped" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th>
                                    <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                        <input type="checkbox" name="keeperUserGroup-checkable" class="group-checkable" />
                                        <span></span>
                                    </label>
                                </th>
                                <th class="tc" style="width: 90px;">公司</th>
                                <th class="tc" style="width: 120px;">促销名称</th>
                                <th class="tc" style="width: 80px;">促销年份</th>
                                <th class="tc" style="width: 90px;">开始日期</th>
                                <th class="tc" style="width: 80px;">结束日期</th>
                                <th class="tc" style="width: 60px;">天数</th>
                                <th class="tc" style="width: 120px;">促销投入（万元）</th>
                                <th class="tc" style="width: 200px;">平台名称</th>
                                <th class="tc" style="width: 200px;">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            </tbody>
                        </table>
                    </div>
                </div>
                <jsp:include page="/WEB-INF/views/modals/12001.jsp" />
            </div>
        </div>

        <!-- End row -->
        <!-- end row -->
    </div> <!-- container -->
</div> <!-- content -->



<script type="text/javascript">
    //重置按钮
    $("button[type='reset']").click(function(){
        $(".goods_select2").each(function(){
            $(this).val("");
        });
        //重新加载select2
        $(".goods_select2").select2({
            language:"zh-CN",
            placeholder: '请选择',
            allowClear:true
        });
    });

    //加载电商平台
    $module.constant.getConstantListByNameURL.call($('select[name="storePlatformCode"]')[0],"storePlatformList",null);

    //日期格式
    $(".date-input").datetimepicker({
        language:  'zh-CN',
        format: "yyyy-mm-dd",
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2
    });

    //重新加载select2
    $(".goods_select2").select2({
        language:"zh-CN",
        placeholder: '请选择',
        allowClear:true
    });

    $(document).ready(function() {

        //初始化
        $mytable.fn.init();
        //配置表格参数
        $mytable.params={
            url:serverAddr + '/promotionRecord/listRecord.asyn?r='+Math.random(),
            columns:[{ //复选框单元格
                className: "td-checkbox",
                orderable: false,
                width: "30px",
                data: null,
                render: function (data, type, row, meta) {
                    return '<input type="checkbox" class="iCheck">';
                }
            },
                {data:'merchantName'},{data:'promotionName'},{data:'promotionYear'},{data:'startDate'},
                {data:'endDate'},{data:'dayNum'},{data:'promotionInvestment'},{data:'storePlatformName'},
                { //操作
                    orderable: false,
                    width: "100px",
                    data: null,
                    render: function (data, type, row, meta) {
                        return '<shiro:hasPermission name="promotionRecord_edit"><a href="javascript:edit('+row.id+')">编辑</a></shiro:hasPermission>'
                            +'  <shiro:hasPermission name="promotionRecord_deleteRecord"><a href="javascript:del('+row.id+')">删除</a></shiro:hasPermission>';
                    }
                },
            ],
            formid:'#form1'
        };
        //生成列表信息
        $('#datatable-buttons').mydatatables();

        /**
         * 全选
         */
        $("input[name='keeperUserGroup-checkable']").on("change", function(){
            if($(this).is(':checked')){
                $(":checkbox", '#datatable-buttons').prop("checked",$(this).prop("checked"));
                $('#datatable-buttons tbody tr').addClass('success');
                $("#export-button").attr("disabled",false);
                $("#export-button").addClass("btn-find waves-effect waves-light");
            }else{
                $(":checkbox", '#datatable-buttons').prop("checked",false);
                $('#datatable-buttons tbody tr').removeClass('success');
                $("#export-button").attr("disabled",true);
                $("#export-button").removeClass("btn-find waves-effect waves-light");
            }
        })
        $('#datatable-buttons').on("change", ":checkbox", function() {
            $(this).parents('tr').toggleClass('success');

            var ids=$mytable.fn.getCheckedRow();
            if(ids==null||ids==''||ids==undefined){
                $("#export-button").attr("disabled",true);
                $("#export-button").removeClass("btn-find waves-effect waves-light");
            } else {
                $("#export-button").attr("disabled",false);
                $("#export-button").addClass("btn-find waves-effect waves-light");
            }
        })
    });

    function searchData(){
        $mytable.fn.reload();
    }

    //编辑
    function edit(id){
        $m12001.init(1, id);
    }

    // 删除
    function del(id){
        $custom.alert.warning("你确认要删除吗？",function(){
            var url = serverAddr + "/promotionRecord/deleteRecord.asyn";
            var form = {"id":id};
            $custom.request.ajax(url, form, function(result){
                if(result.state == '200'){
                    $custom.alert.success("删除成功！");
                    setTimeout(function () {
                        $module.load.pageOrder('act=12001');
                    }, 100);
                }else{
                    $custom.alert.error("删除失败！");
                }
            });
        });
    }

    //导出
    function exportInfo(){
        var ids=$mytable.fn.getCheckedRow();
        if(ids==null||ids==''||ids==undefined){
            $custom.alert.warningText("至少选择一条记录！");
            return ;
        }
        window.open(serverAddr+"/promotionRecord/exportRecord.asyn?ids="+ids);
    }

</script>