<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<input type="button" value="Back to user's list" onclick="location.href='/reader/list'">
<br><br><br>
<table>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
    </tr>
    <c:forEach items="${unoccupiedBooks}" var="book">
        <c:url var="borrowBook" value="/reader/borrow">
            <c:param name="reader-id" value="${readerId}"/>
            <c:param name="book-id" value="${book.id}"/>
        </c:url>
        <tr>
            <td><c:out value="${book.title}" /></td>
            <td><c:out value="${book.author}" /></td>
            <td><c:out value="${book.genre}" /></td>
            <td><a href="${borrowBook}">Borrow book</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
