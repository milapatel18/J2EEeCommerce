<%@taglib prefix="sec"
          uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="global" tagdir="/WEB-INF/tags/global/" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ERPCommerce</title>
        <link rel="stylesheet" type="text/css" href="webresources/themes/default/easyui.css"/>
        <link rel="stylesheet" type="text/css" href="webresources/themes/icon.css"/>
        <link rel="stylesheet" type="text/css" href="webresources/themes/color.css"/>
        <link rel="stylesheet" type="text/css" href="webresources/themes/demo/demo.css"/>
        <script type="text/javascript" src="webresources/scripts/jquery/jquery-1.11.3.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.edatagrid.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.pivotgrid.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.portal.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/datagrid-detailview.js"></script>
        <script type="text/javascript" src="webresources/scripts/erp/mainlayouts.js"></script>
    </head>
    <body>
        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'north'" style="height:60px;padding-top: 0px;">
                    <global:menu></global:menu>
                    </div>
                    <div data-options="region:'south',split:false" style="height:10px;">
                    </div>
                    <div data-options="region:'center',iconCls:'icon-ok'" style="height:100%;">
                    <global:tabs></global:tabs>
                    </div>
                </div>
        </sec:authorize>
    </body>
</html>