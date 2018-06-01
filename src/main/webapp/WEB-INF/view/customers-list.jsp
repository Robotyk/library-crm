<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customers list</title>
</head>
<body>
<table>
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td><c:out value="${customer.firstName}" /></td>
            <td><c:out value="${customer.lastName}" /></td>
            <td><c:out value="${customer.email}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
