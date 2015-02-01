<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="icon" href="/pages/custom/favicon.ico">
    <link href="<c:url value="/pages/bootstrap/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/pages/custom/css/signin.css" />" rel="stylesheet">
    <title>Login page</title>
</head>
<body>

<div class="container">

    <%--<c:if test="${not empty message}">
        <div style="color:red">
            Your fake login attempt was bursted, dare again !!<br />
        </div>
    </c:if>--%>

    <form action="<c:url value='/j_spring_security_check' />" method='POST' class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputUsername" class="sr-only">Username</label>
        <input type="text" id="inputUsername" class="form-control" placeholder="Username" required autofocus
               name='j_username'>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required
               name='j_password'>
        <input id="rememberMe" type="checkbox" name="_spring_security_remember_me">
        <label for="rememberMe">Remember me</label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>

        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <a href="registration">Registration</a>
    </form>
</div>

<script src="http://getbootstrap.com/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
