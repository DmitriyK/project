<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html ng-app="store">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registration</title>

    <!-- Bootstrap -->
    <link href="<c:url value="/pages/bootstrap/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/pages/custom/css/signin.css" />" rel="stylesheet">
    <link rel="icon" href="/pages/custom/favicon.ico">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="container">

    <%--<c:if test="${not empty message}">
        <div style="color:red">
            Your fake login attempt was bursted, dare again !!<br />
        </div>
    </c:if>--%>

    <form:form action="registration" method='POST' class="form-signin" commandName="user">
        <h2 class="form-signin-heading">Registration form</h2>
        <label for="inputUsername" class="sr-only">Username</label>
        <input type="text" id="inputUsername" class="form-control" placeholder="Username" required autofocus
               name='username'>
        <form:errors path="username" class="alert alert-danger"/>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required
               name='password'>
        <form:errors path="password" class="alert alert-danger"/>
        <label for="inputEmail" class="sr-only">Email</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="Email" required
               name='email'>
        <form:errors path="email" class="alert alert-danger"/>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>

        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
    </form:form>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<c:url value="/pages/bootstrap/js/bootstrap.js" />"></script>
</body>
</html>
