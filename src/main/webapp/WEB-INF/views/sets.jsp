<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>KPacsSet</title>
</head>
<body>
    <h1 class="table_dark">All KPacSets:</h1>
    <table class="table_dark">
        <tr>
            <th>Id:</th>
            <th>Title:</th>
        </tr>
        <c:forEach items="${kPacSetData}" var="kPacSet">
            <tr>
                <th><a href="/set/${kPacSet.id}">${kPacSet.id}</a></th>
                <th>${kPacSet.title}</th>
                <th>
                    <form:form method="get" action="/sets/${kPacSet.id}">
                        <input type="submit" value="DELETE">
                    </form:form>
                </th>
            </tr>
        </c:forEach>
    </table>
    <table class="table_dark">
        <form:form method="post" action="/sets" modelAttribute="kPacSet">
        <tr><h1 class="table_dark">Add KPacSet:</h1></tr>
        <tr>
            <th>Title</th>
            <th>List of KPac</th>
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
                    <form:select path="kpacList" items="${kPacData}" itemValue="id" itemLabel="title" multiple="true"/>
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