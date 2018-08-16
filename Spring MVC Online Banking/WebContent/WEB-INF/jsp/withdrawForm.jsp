<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw Form</title>
</head>
<body>
<form action="result.jsp" method="get">
<div align="center">
<table>
<tr>
<td>Enter Account Number <input type="text" name="accountNumber" value="${requestScope.customer.accountNumber}" /><br></td>
</tr>
<tr>
<td>Enter Amount to Withdraw <input type="text" name="amount" value="${requestScope.customer.amount}" /><br></td> 
</tr>
<tr>
<td><input type="submit" value="Withdraw"></td>
</tr>
</table>
</div>
</form>
</body>
</html>