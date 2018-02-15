function Setting() {

}

Setting.prototype = {
    constructor: Setting,
    loadMainContentOfModule: function (moduleID) {//settingModule
        $(".settingbuttons").removeClass("c6");
        $('.' + moduleID + 'ModuleButton').addClass("c6");
        $(".settingModulePanel").panel({closed: true});
        $('#' + moduleID + "ModuleContent").panel({closed: false});
        if ($('#' + moduleID + "ModuleContent").html() === "") {
            //$('#' + moduleID + "ModuleContent").html("Hello, You are Looking at : " + moduleID);
            ERP.prototype.loadMainContentForLayout(moduleID);
        }
    },
    createNewModuleForm: function (moduleID) {
        //alert("modulesCreateForm");
        $('#modulesCreateForm').window({
            fit: true,
            maximized: true,
            width: '100%',
            height: 400,
            modal: true,
            closed: false,
            inline: true
        });
        $('#modulesCreateForm').window('refresh', 'home/createform/module/' + moduleID);
    },
    createNewModules: function () {
        //alert($('#newModuleCreationform').attr("action"));
        $.ajax({
            type: "POST",
            url: $('#newModuleCreationform').attr("action"),
            data: $('#newModuleCreationform').serialize(),
            success: function (data) {
                //alert(data);
                $.messager.show({
                    title: 'Success',
                    msg: "New Module is Created"
                });
                $('#modulesCreateForm').window({closed: true});
            },
            error: function (xhr, status, error) {
                alert(xhr.responseText);
                $.messager.show({
                    title: 'Success',
                    msg: xhr.responseText
                });
            }
        });
    }
};

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


