<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>Menu</title>
</head>
<body>

<h2>MENU</h2>
<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>price</th>
        <th>grams</th>
        <th>action</th>
    </tr>
    <c:forEach var="item" items="${itemsList}">
        <tr>
            <td>${item.id}</td>
            <td>${item.title}</td>
            <td>${item.price}</td>
            <td>${item.grams}</td>
            <td>
                <a href="/edit/${item.id}">edit</a>
                <a href="/delete/${item.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new film</a>

</body>
</html>
