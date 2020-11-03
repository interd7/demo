<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/style.css" /> ">
    <script src="<c:url value="/static/js/jquery-3.5.1.min.js"/> "></script>
</head>
<body>
<form id="form1" onsubmit="return false" action="#" method="post">
    <p>用户名：<label>
        <input type="text" id="username" name="username" />
    </label></p>
    <p>密码：<label>
        <input type="password" id="password" name="password" />
    </label></p>
    <input type="button" value="登录" onclick="login()" />
</form>
<script>
    function login(){
        let username = $("#username").val();
        let password = $("#password").val();
        let myData = {
            "username":username,
            "password":password
        };
        $.ajax({
            type:"POST",
            contentType:"application/json",
            dataType:"json",
            url:"../user/loginActionAJAXJSON",
            data:JSON.stringify(myData),
            success:function (result){
                alert(result["selectResult"]);
                alert(result["selectedRows"]);
            },
            error:function (){
                alert("异常！")
            }
        });
    }
</script>
</body>
</html>
