<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <c:if test="${empty item.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty item.title}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty item.title}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty item.title}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">

    <c:if test="${!empty item.title}">
        <input type="hidden" name="id" value="${item.id}">
    </c:if>

    <label for="title">Title</label>
    <input type="text" name="title" id="title">

    <label for="price">Price</label>
    <input type="text" name="price" id="price">

    <label for="grams">Grams</label>
    <input type="text" name="grams" id="grams">

    <c:if test="${empty item.title}">
        <input type="submit" value="Add new film">
    </c:if>
    <c:if test="${!empty item.title}">
        <input type="submit" value="Edit film">
    </c:if>

</form>
</body>
</html>
