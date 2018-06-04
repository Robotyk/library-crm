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
<br><br>
<table>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
        <th>Reader</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <c:url var="update" value="/book/update-book">
            <c:param name="book-id" value="${book.id}"/>
        </c:url>
        <c:url var="delete" value="/book/delete-book">
            <c:param name="book-id" value="${book.id}"/>
        </c:url>
        <tr>
            <td><c:out value="${book.title}" /></td>
            <td><c:out value="${book.author}" /></td>
            <td><c:out value="${book.genre}" /></td>
            <td><c:out value="${book.reader.firstName} ${book.reader.lastName}" /></td>
            <td><a href="${update}" >Update book</a></td>
            <td><a href="${delete}" onclick="if (!(confirm('Are you sure you want to delete this book?'))) return false">
                Delete book</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
