<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html ng-app="store">
<head>
    <title>Welcome</title>
    <link href="<c:url value="/pages/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
    <script src="<c:url value="/pages/angular/angular.min.js" />"></script>
    <script src="<c:url value="/pages/module/app.js" />"></script>
Welcome!
<p>
    I am {{4 + 6}}
</p>
</body>
</html>
