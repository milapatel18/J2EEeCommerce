<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
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
    </head>
    <body onload='document.loginForm.username.focus();'>

        <h1>ERP Commerce : DHRUVIL ENTERPRISE</h1>

        <div id="login-box">

            <h3>Login with Username and Password</h3>

            <c:if test="${not empty error}">
                <div class="error">${error}</div>
            </c:if>
            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>


        </div>

        <div id="winlogin" class="easyui-window"
             title="Login" fit="false" minimizable="false" maximizable="false" closable="false" resizable="true"
             style="height:180px;width: 350px;">
            <%@include file="../view/ui/companyuserlogin.jsp" %>
        </div>

        <style>
            .left{
                padding-left: 0px;
            }
            .textbox{
                height: 20px;
                padding-left: 5px;
            }
        </style>
    </body>
</html>