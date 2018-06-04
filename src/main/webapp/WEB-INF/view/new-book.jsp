<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New book</title>
</head>
<body>
<h2>adding new reader</h2>
<form:form action="save-book" modelAttribute="book" method="POST">
    <table>
        <tbody>
        <tr>
            <td><label>Title (*):</label></td>
            <td><form:input path="title"/></td>
            <td><form:errors path="title"/></td>
        </tr>
        <tr>
            <td><label>Author (*):</label></td>
            <td><form:input path="author"/></td>
            <td><form:errors path="author"/></td>
        </tr>
        <tr>
            <td><label>Genre (*):</label></td>
            <td><form:input path="genre"/></td>
            <td><form:errors path="genre"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save" />
                <input type="button" value="Cancel" onclick="location.href='/book/list'"/></td>
        </tr>
        </tbody>
    </table>
</form:form>
</body>
</html>
