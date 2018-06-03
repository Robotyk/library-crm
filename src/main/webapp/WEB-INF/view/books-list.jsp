<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books list</title>
</head>
<body>
<br>
<input type="button" value="Back to main page" onclick="location.href='/'">
<input type="button" value="Add new book" onclick="location.href='/book/new'">
<br>
<table>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
        <th>Reader</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.title}" /></td>
            <td><c:out value="${book.author}" /></td>
            <td><c:out value="${book.genre}" /></td>
            <td><c:out value="${book.reader.firstName} ${book.reader.lastName}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
