<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
    <link href="resources/css/bootstrap-slate.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>

<div class="container">
    <div class="row header">
        <h1>HOTEL</h1>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="row">


            <div class=" col-sm-4">
                <input type="text" class="form-control" placeholder="Enter login" form="login">
            </div>
            <div class=" col-sm-4">
                <input type="password" class="form-control" placeholder="Password" form="login">
            </div>
            <div class="bs-component" style="margin-bottom: 15px;">
                <div class=" btn-group-justified btn-group-sm col-sm-4">
                    <button type="submit" class="btn btn-default" form="login">Login</button>

                    <button type="submit" class="btn btn-default" form="sing_up">SING UP</button>
                </div>
            </div>
            <form action="Controller" method="POST" id="login">
                <input type="hidden" value="login" name="action"/>
            </form>
            <form action="Controller" method="POST" id="sing_up">
                <input type="hidden" value="registr" name="action"/>
            </form>
        </div>
    </div>

</div>
<div class="container">
    <c:forEach items="${users}" var="user">
        <div class="row">
            <div class="col-sm-2">
                <c:out value="${user.getUserId()}"/>
            </div>
            <div class="col-sm-2">
                <c:out value="${user.getLogin()}"/>
            </div>
            <div class="col-sm-2">
                <c:out value="${user.getPassword()}"/>
            </div>
            <div class="col-sm-2">
                <c:out value="${user.getName()}"/>
            </div>
        </div>
    </c:forEach>
</div>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
</body>
</html>