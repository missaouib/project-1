<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- Start content -->
<jsp:include page="/WEB-INF/views/common.jsp" />
<div class="content">
    <div class="container-fluid mt80">
        <!-- end row -->
        <div class="row">
            <div class="col-12">
                <div class="card-box">
                    <div class="col-12 row">
                        <div>
                            <ol class="breadcrumb">
                                <li><i class="block"></i> 当前位置：</li>
                                <li class="breadcrumb-item"><a href="#">采购档案</a></li>
                                <li class="breadcrumb-item"><a href="javascript:dh_list();">采购订单跟踪报表</a></li>
                            </ol>
                        </div>
                    </div>
                    <!--  过滤条件查询  start  -->
                    <form id="form1" >
                        <div class="form_box">
                            <div class="form_con">
                                <div class="form_item h35">
                                    <span class="msg_title">采购订单编号 :</span>
                                    <input class="input_msg" type="text" name="orderCode" required="" >
                                    <span class="msg_title">事业部 :</span>
                                    <select class="input_msg" name="buId" id="buId">
                                    </select>
                                    <div class="fr">
                                        <button type="button" class="btn btn-find waves-effect waves-light btn_default" onclick='searchData();' >查询</button>
                                        <button type="reset" class="btn btn-light waves-effect waves-light btn_default">重置</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </form>
                    <div class="mt20 table-responsive">
                        <table id="datatable-buttons" class="table table-striped" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th>
                                    <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                        <input type="checkbox" name="keeperUserGroup-checkable" class="group-checkable" />
                                        <span></span>
                                    </label>
                                </th>
                                <th>采购订单编号</th>
                                <th>事业部</th>
                                <th>PO号</th>
                                <th>采购数量</th>
                                <th>入仓数量</th>
                                <th>差异数量</th>
                                <th>在途数量</th>
                                <th>预计到港时间</th>
                                <th>最后入仓时间</th>
                            </tr>
                            </thead>
                            <tbody>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <!-- End row -->
        <!-- end row -->
    </div> <!-- container -->
</div> <!-- content -->

<script type="text/javascript">

    $(document).ready(function() {

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
        
      //事业部
        $module.businessUnit.getSelectBeanByMerchantDepotRel.call($("select[name='buId']")[0],null, null,null);

        //初始化
        $mytable.fn.init();
        //配置表格参数
        $mytable.params={
            url:serverAddr+'/difference/listFollowing.asyn?r='+Math.random(),
            columns:[{ //复选框单元格
                className: "td-checkbox",
                orderable: false,
                width: "30px",
                data: null,
                render: function (data, type, row, meta) {
                    return '<input type="checkbox" class="iCheck">';
                }
            },
            {data:'orderCode'},{data:'buName'},{data:'poNo'},{data:'purchaseNum'},{data:'warehouseNum'},{data:'differenceNum'},{data:'onPassageNum'},{data:'arriveDate'},{data:'warehouseDate'}
            ],
            formid:'#form1'
        };
        //生成列表信息
        $('#datatable-buttons').mydatatables();
    });

    function searchData(){
        $mytable.fn.reload();
    }

    /**
     * 全选
     */
    $("input[name='keeperUserGroup-checkable']").on("change", function(){
        if($(this).is(':checked')){
            $(":checkbox", '#datatable-buttons').prop("checked",$(this).prop("checked"));
            $('#datatable-buttons tbody tr').addClass('success');
        }else{
            $(":checkbox", '#datatable-buttons').prop("checked",false);
            $('#datatable-buttons tbody tr').removeClass('success');
        }
    })
    $('#datatable-buttons').on("change", ":checkbox", function() {
        $(this).parents('tr').toggleClass('success');
    })

    function dh_list(){
        $module.load.pageOrder("act=3007");
    }
    // 点击展开功能
    $(".unfold").click(function () {
        $(".form_con").toggleClass('hauto');
        if($(this).text() == '展开功能'){
            $(this).text('收起功能');
        }else{
            $(this).text('展开功能');
        }
    });
    $(function () {
        $("#datatable-buttons_wrapper").removeClass('container-fluid');
    })
</script>