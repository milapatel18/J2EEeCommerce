<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="modulesContentLayout" class="easyui-layout" data-option="fit:true">
    <div data-options="region:'north',title:'SEARCH MODULES',split:true" style="height:80%;padding: 20px">
        <%@include file="search.jsp" %>
        <%@include file="list.jsp" %>
    </div>
    <div data-options="region:'center',title:'EDIT MODULES'" style="padding:5px;height:2px;">
    </div>
</div>

<script>
    $("#modulesContentLayout").layout({fit: true});
</script>