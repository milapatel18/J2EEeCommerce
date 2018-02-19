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
                    title: 'ERROR',
                    msg: xhr.responseText
                });
            }
        });
    },
    updateModules: function () {
        //alert($('#newModuleCreationform').attr("action"));
        $.ajax({
            type: "POST",
            url: $('#modulesEditform').attr("action"),
            data: $('#modulesEditform').serialize(),
            success: function (data) {
                //alert(data);
                Setting.prototype.loadEditModules($('#modulesEditform').find('input[name="id"]').val());
                $.messager.show({
                    title: 'Success',
                    msg: "Module is Updated"
                });
            },
            error: function (xhr, status, error) {
                alert(xhr.responseText);
                $.messager.show({
                    title: 'ERROR',
                    msg: xhr.responseText
                });
            }
        });
    },
    deleteModuleSelected: function () {
        //alert($('#newModuleCreationform').attr("action"));
        if ($("#modulesTreeGrid").treegrid("getSelected") !== null) {
            //alert($("#modulesTreeGrid").treegrid("getSelected").id);
            $.messager.confirm('Deleting ' + $("#modulesTreeGrid").treegrid("getSelected").moduleName, 'Are you confirm to delete this?', function (r) {
                if (r) {
                    $.ajax({
                        type: "POST",
                        url: "domain/modules/delete/" + $("#modulesTreeGrid").treegrid("getSelected").id,
                        success: function (data) {
                            //alert(data);
                            $("#modulesTreeGrid").treegrid("reload");


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
            });
        }

    },
    loadEditModules: function (moduleId) {
        $.ajax({
            type: "POST",
            url: "domain/modules/edit/" + moduleId,
            success: function (data) {
                //alert(data);
                $('#modulesContentLayout').layout('collapse', 'north');
                $('#modulesContentLayout').layout('panel', 'center').html(data);


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


