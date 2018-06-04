<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books ${readerId}</title>
</head>
<body>
<input type="button" value="Back to user's list" onclick="location.href='/reader/list'">
<table>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
    </tr>
    <c:forEach items="${readerBooks}" var="books">
    <tr>
        <td><c:out value="${books.title}" /></td>
        <td><c:out value="${books.author}" /></td>
        <td><c:out value="${books.genre}" /></td>
    </tr>
    </c:forEach>

</body>
</html>
