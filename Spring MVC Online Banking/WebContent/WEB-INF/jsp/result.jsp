<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw Result</title>
</head>
<body>
<div align="center">
<h3>Withdraw Details</h3>
<jstl:if test="${sessionScope.Balance > 0.0}">
<h3>Your Available Balance is</h3>${sessionScope.Balance}
</jstl:if>

<jstl:if test="${sessionScope == 0.0}">
<h3>Sorry, you don't have enough balance in your account</h3><br>
</jstl:if>
</div>
</body>
</html>