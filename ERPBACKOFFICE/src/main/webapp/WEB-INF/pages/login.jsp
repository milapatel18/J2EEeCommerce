<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
    <head>
        <<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Embrobizz</title>
        <link rel="stylesheet" type="text/css" href="webresources/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="webresources/themes/icon.css">
        <link rel="stylesheet" type="text/css" href="webresources/themes/color.css">
        <link rel="stylesheet" type="text/css" href="webresources/themes/demo/demo.css">
        <script type="text/javascript" src="webresources/scripts/jquery/jquery-1.11.3.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.easyui.min.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.edatagrid.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.pivotgrid.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/jquery.portal.js"></script>
        <script type="text/javascript" src="webresources/scripts/jeasyui/datagrid-detailview.js"></script>
    </head>
    <body onload='document.loginForm.username.focus();'>

        <h1>Spring Security Login Form (Database + Hibernate Authentication)</h1>

        <div id="login-box">

            <h3>Login with Username and Password</h3>

            <c:if test="${not empty error}">
                <div class="error">${error}</div>
            </c:if>
            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>

            <form name='loginForm'
                  action="<c:url value='/j_spring_security_check' />" method='POST'>

                <table>
                    <tr>
                        <td>User:</td>
                        <td><input type='text' name='username'></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type='password' name='password' /></td>
                    </tr>
                    <tr>
                        <td colspan='2'><input name="submit" type="submit"
                                               value="submit" /></td>
                    </tr>
                </table>

                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}" />

            </form>
        </div>

    </body>
</html>