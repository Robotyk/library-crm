<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Readers list</title>
</head>
<body>
<br>
<input type="button" value="Add new reader" onclick="location.href='/reader/new'">
<br>
<table>
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${readers}" var="reader">
        <tr>
            <td><c:out value="${reader.firstName}" /></td>
            <td><c:out value="${reader.lastName}" /></td>
            <td><c:out value="${reader.email}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
