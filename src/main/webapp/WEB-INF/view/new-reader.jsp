<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New reader</title>
</head>
<body>
<h2>adding new reader</h2>
<form:form action="save-reader" modelAttribute="reader" method="POST">
    <table>
        <tbody>
        <tr>
            <td><label>First name:</label></td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td><label>Last name:</label></td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td><label>Email:</label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save" /></td>
        </tr>
        </tbody>
    </table>
</form:form>
<br><br>
<p>
    <a href="${pageContext.request.contextPath}/">Cancel</a>
</p>
</body>
</html>
