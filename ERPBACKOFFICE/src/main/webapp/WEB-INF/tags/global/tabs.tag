<%-- 
    Document   : tabs
    Created on : Jan 22, 2018, 6:20:01 PM
    Author     : Milap Patel
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%-- any content can be specified here e.g.: --%>
<div id="tt" data-options="tabWidth:120,fit:true" style="width:100%;height:100%">
    <div title="Dashboard" style="padding:10px">
    </div>
    <div title="Settings" style="padding:10px">
        <div class="easyui-layout"  data-options="fit:true"  style="height:100%;padding-top: 0px;">
            <div id="settingModuleMenus" data-options="region:'west',split:false" title="Backend Details" style="width:200px;">
                <div style="margin:20px;padding-bottom:10px;">
                    <a href="#" class="easyui-linkbutton" onclick="" data-options="iconCls:'erp-icon-datacube',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Main Business</a><br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-users',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Users</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-users',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Roles</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-account',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Attributes</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-users',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Clients</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-home',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Addresses</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-diary',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Banking</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-reports',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Taxes</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-delivery',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">Warehouses</a> <br/>
                    <a href="#" class="easyui-linkbutton" data-options="iconCls:'erp-icon-datacube',size:'large',iconAlign:'top'" style="width:120px;padding-bottom:10px;">MODULES</a> <br/>
                </div>
            </div>
            <div id="settingModuleContent" data-options="iconCls:'erp-icon-setting',region:'center',title:'Setting'">
            </div>
        </div>
    </div>
    <div title="Products" style="padding:10px">
        <div class="easyui-layout"  data-options="fit:true"  style="height:100%;padding-top: 0px;">
            <div data-options="region:'west',split:false" title="Backend Details" style="width:200px;">
            </div>
            <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
            </div>
        </div>
    </div>
</div>
<div id="mm">
    <div>Welcome</div>
    <div>Help Contents</div>
    <div data-options="iconCls:'icon-search'">Search</div>
    <div>Dynamic Help</div>
</div>

<script>
    $(function () {
        var p = $('#tt').tabs().tabs('tabs')[2];
//        var mb = p.panel('options').tab.find('a.tabs-inner');
//        mb.menubutton({
//            menu: '#mm',
//            iconCls: 'icon-help'
//        }).click(function () {
//            $('#tt').tabs('select', 2);
//        });
    });
</script>