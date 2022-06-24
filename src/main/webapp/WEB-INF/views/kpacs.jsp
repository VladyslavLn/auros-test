<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>KPacs: </title>
</head>
<body>
<h1 class="table_dark">All KPac:</h1>
<table class="table_dark">
    <tr>
        <th>Id:</th>
        <th>Title:</th>
        <th>Description</th>
    </tr>
    <c:forEach items="${kPacData}" var="kPac">
        <tr>
            <th>${kPac.id}</th>
            <th>${kPac.title}</th>
            <th>${kPac.description}</th>
            <th>
                <form:form method="get" action="/kpacs/${kPac.id}">
                    <input type="submit" value="DELETE">
                </form:form>
            </th>
        </tr>
    </c:forEach>
</table>
<table class="table_dark">
    <form:form method="post" action="/kpacs" modelAttribute="kPac">
        <tr><h1 class="table_dark">Add KPac:</h1></tr>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Add</th>
        </tr>
        <tr>
            <td>
                <label>
                    <form:input path="title" id="title"/>
                </label>
            </td>
            <td>
                <label>
                    <form:input path="description" id="title"/>
                </label>
            </td>
            <td>
                <input type="submit" title="SUBMIT">
            </td>
        </tr>
    </form:form>
</table>
</body>
</html>