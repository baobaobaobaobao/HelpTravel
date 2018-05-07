var message = null;

var urlinit = "http://localhost:8080/HelpTravel/login/";
//点击登录按钮调用方法
function login() {
    //登录账号密码验证
    var username = $("#username").val();
    var password = $("#password").val();
    //先定好格式传送数据格式
    message = {
        'username': $("#username").val(),
        'password': $("#password").val()
    };
    if (username == "" || password == "") {
        alert("请输入账号和密码");
    } else {
        //调用
        var url = "http://localhost:8080/HelpTravel/login/testUser";
        com.meajax(url, message,
        function(data) {
            delLogmsg(data);
        });
    }
}

//处理登录后返回的数据
function delLogmsg(result) {
    //alert(JSON.stringify(result));
    sessionStorage.setItem("users", JSON.stringify(result.users)); //将登陆信息放入session中
    if (result.flag == 1) {

        window.location.href = '/HelpTravel/login/main';
    } else {
        //登入失败
        alert("登录失败");
        //alert(result.msg);
    }
}

function registerUser() {

    //先定好格式传送数据格式
    message = {
        'registerusername': $("#registerUsername").val(),
        'registerpassword': $("#registerpassword").val()
    };
    if (!judge(message)) {
        alert("请输入账号和密码");
    } else {
        //调用
        var url = urlinit + "registerUser";
        com.meajax(url, message,
        function(data) {
            if (data == 1) {
                alert("注册成功");
                window.location.href = '/HelpTravel/login/index';
            }
        });
    }

}

/*
 * 功能：判断传入的对象里面每个值是否为空。
 * 传入参数为对象 ，里面键值对形式。
 *  message = {'registerusername':registerUsername, 'registerpassword':registerpassword};
 *返回为提示有空值信息空值或者true
 */
function judge(NumOrString) {
    var flag = new Boolean();
    flag = true;
    for (var key in NumOrString) {
        if (NumOrString[key]) {} else {
            flag = false;
        }
    }

    if (!flag) {
        alert("有空值");
    } else {

        return true;
    }
}