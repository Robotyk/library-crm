<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${reader.firstName} ${reader.lastName}'s books</title>
</head>
<body>
<br>
<h2>${reader.firstName} ${reader.lastName}'s books</h2>
<br><br>
<table>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Genre</th>
    </tr>
    <c:forEach items="${readerBooks}" var="books">
        <c:url var="returnBook" value="/reader/return-book">
            <c:param name="reader-id" value="${reader.id}"/>
            <c:param name="book-id" value="${books.id}"/>
        </c:url>
    <tr>
        <td><c:out value="${books.title}" /></td>
        <td><c:out value="${books.author}" /></td>
        <td><c:out value="${books.genre}" /></td>
        <td><a href="${returnBook}">Return book</a></td>
    </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Back to user's list"
       onclick="location.href='/reader/list'">
</body>
</html>
