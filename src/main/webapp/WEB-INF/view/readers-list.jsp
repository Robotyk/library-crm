<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Readers list</title>
</head>
<body>
<br>
<input type="button" value="Back to main page" onclick="location.href='/'">
<input type="button" value="Add new reader" onclick="location.href='/reader/new'">
<br><br><br>
<table>
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th>Email</th>
        <th>Books</th>
    </tr>
    <c:forEach items="${readers}" var="reader">
        <c:url var="borrowBook" value="/reader/borrow-book">
            <c:param name="reader-id" value="${reader.id}"/>
        </c:url>
        <c:url var="showBooks" value="/reader/show-books">
            <c:param name="reader-id" value="${reader.id}"/>
        </c:url>
        <c:url var="update" value="/reader/update">
            <c:param name="reader-id" value="${reader.id}"/>
        </c:url>
        <c:url var="delete" value="/reader/delete">
            <c:param name="reader-id" value="${reader.id}"/>
        </c:url>
        <tr>
            <td><c:out value="${reader.firstName}" /></td>
            <td><c:out value="${reader.lastName}" /></td>
            <td><c:out value="${reader.email}" /></td>
            <td><c:out value="${reader.booksAmount}" /></td>
            <td><a href="${borrowBook}">Borrow book</a></td>
            <td><a href="${showBooks}">Show books</a></td>
            <td><a href="${update}">Update</a></td>
            <td><a href="${delete}"
            onclick="if (!(confirm('Are you sure you want to delete this reader?'))) return false">
                Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
