<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
<head>  
<base href="<%=basePath%>">  
  
<title>My JSP 'index.jsp' starting page</title>  
<meta http-equiv="pragma" content="no-cache">  
<meta http-equiv="cache-control" content="no-cache">  
<meta http-equiv="expires" content="0">  
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
<meta http-equiv="description" content="This is my page">  
<!-- 
    <link rel="stylesheet" type="text/css" href="styles.css"> 
    -->  
<!-- action uri 前面不能加/ 否则路径变成从根开始  -->  
<!-- <script type="text/javascript" src="js/jquery-easyui-1.4.4/jquery.min.js"></script> -->  
<script type="text/javascript"  
    src="js/jquery-easyui-1.4.4//jquery.min.js"></script>  
<script type="text/javascript">  
    $(document).ready(  
            function() {  
                $("#btnQuery").click(  
                        function() {  
                            var username = $("#username").val();  
                            var password = $("#password").val();  
                            var data = {  
                                "username" : username,  
                                "password" : password  
                            };  
                            // alert(JSON.stringify(data));  
                            $.ajax({  
                                type : "GET",  
                                url : "user/login",  
                                dataType : "json", //后台返回值类型  
                                data : data,  
                                beforeSubmit : function() {  
  
                                },  
                                success : function(data) {  
                                    alert(data.username + " " + data.password  
                                            + " " + data.address + " "  
                                            + data.tel);  
  
                                },  
                                error : function(data) {  
                                    alert("error");  
                                }  
                            });  
                        });  
                $("#btnAdd").click(  
                        function() {  
                            var username = $("#username").val();  
                            var password = $("#password").val();  
                            var address = $("#address").val();  
                            var tel = $("#tel").val();  
                            var data = {  
                                "username" : username,  
                                "password" : password,  
                                "address" : address,  
                                "tel" : tel  
                            };  
                              
                            $.ajax({  
                                type : "POST",  
                                url : "user/addUser",  
                                dataType : "json", //后台返回值类型  
                                data : data,  
                                beforeSubmit : function() {  
  
                                },  
                                success : function(data) {  
                                    if(data == 'success') {  
                                        alert("添加成功");  
                                    }else {  
                                        alert("添加失败");  
                                    }  
                                },  
                                error : function(data) {  
                                    alert("error");  
                                }  
                            });  
                        });  
                  
                  
                $("#btnDel").click(  
                        function() {  
                            var id = $("#id").val();  
                            $.ajax({  
                                type : "DELETE",  
                                url : "user/deleteUser/"+id,  
                                dataType : "json", //后台返回值类型  
                                beforeSubmit : function() {  
  
                                },  
                                success : function(data) {  
                                    if(data == 'success') {  
                                        alert("删除成功");  
                                    }else {  
                                        alert("删除失败");  
                                    }  
                                },  
                                error : function(data) {  
                                    alert("error");  
                                }  
                            });  
                        });  
            });  
</script>  
</head>  
  
<body>  
      
   <!-- 查询 -->  
    用户名：  
    <input type="text" id="username" value="xx">  
    <br> 密码：  
    <input type="password" id="password" value="1233">  
    <br>  
    <a href="javascript:void(0)" id="btnQuery">查询</a>  
      
    <br>  
    <!-- 添加 -->  
    用户名：  
    <input type="text" id="username" value="张三图">  
    <br> 密码：  
    <input type="password" id="password" value="1233">  
    <br> 地址：  
    <input type="text" id="address" value="安徽天长">  
    <br> 联系方式：  
    <input type="password" id="tel" value="1232333">  
    <br>  
    <input type="button" id="btnAdd" value="提交">  
  
    <br>  
    <!-- 删除 -->  
    <input type="text" id="id" value="51">  
    <input type="button" id="btnDel" value="删除">  
      
    <%--  
     <form:form action="user/login" method="post">  
                 用户名：<input type="text" name="username" value="xx"><br>  
                   密码：    <input type="password" name="password" value="1233"><br>  
                       用户名：<input type="text" name="address" value="ss"><br>  
                   密码：    <input type="password" name="tel" value="1232333"><br>  
        <input type="submit" value="提交">  
     </form:form>  
       
      --%>  
    <%--<form:form action="user/deleteUser/50" method="delete">  
        <input type="submit" value="提交">  
     </form:form>  
  --%>  
</body>  
</html>  