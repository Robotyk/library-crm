<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Reader form</title>
</head>
<body>
<h2>Save reader</h2>
<form:form action="save-reader" modelAttribute="reader" method="POST">
    <form:hidden path="id"/>
    <form:hidden path="booksAmount"/>
    <table>
        <tbody>
        <tr>
            <td><label>First name (*):</label></td>
            <td><form:input path="firstName"/></td>
            <td><form:errors path="firstName"/></td>
        </tr>
        <tr>
            <td><label>Last name (*):</label></td>
            <td><form:input path="lastName"/></td>
            <td><form:errors path="lastName"/></td>
        </tr>
        <tr>
            <td><label>Email:</label></td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save" />
                <input type="button" value="Cancel" onclick="location.href='/reader/list'"/></td>
        </tr>
        </tbody>
    </table>
</form:form>
</body>
</html>
