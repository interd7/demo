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
<div>
    <input type="text" id="message">
</div>
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
                alert(result["selectedResult"]);
                alert(result["selectedRows"]);
                $("#message").val(result["selectedResult"])


            },
            error:function (){
                alert("异常！")
            }
        });
    }
    function login2(){
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
            url:"../user/loginActionAJAXSomeJSON",
            // 这是JSON字符串
            data:JSON.stringify(myData),
            success:function (result){
                // result是JSON对象的集合
                alert(JSON.stringify(result[0]));
                alert(JSON.stringify(result[1]));
                $.each(result,function (index){
                    let selectedResult = result[index].selectedResult;
                    let selectedRows = result[index].selectedRows;
                    alert(selectedResult);
                    alert(selectedRows);
                })
            },
            error:function (){
                alert("异常！")
            }
        });
    }
    function login3(){
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
            url:"../user/loginActionAJAXSomeJSON",
            // 这是JSON字符串
            data:JSON.stringify(myData),
            success:function (result){
                // result是JSON对象的集合
                alert(JSON.stringify(result[0]));
                alert(JSON.stringify(result[1]));
                for (let index = 0;index < result.length; index++){
                    let selectedResult = result[index].selectedResult;
                    let selectedRows = result[index].selectedRows;
                    alert(selectedResult);
                    alert(selectedRows)
                }
            },
            error:function (){
                alert("异常！")
            }
        });
    }
</script>
</body>
</html>
