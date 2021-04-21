<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Адреса ресторанов</title>
</head>
<body>
<h2>MENU</h2>
<table>
    <tr>
        <th>id</th>
        <th>address</th>
        <th>phone</th>
    </tr>
    <c:forEach var="place" items="${placesList}">
        <tr>
            <td>${place.id}</td>
            <td>${place.address}</td>
            <td>${place.phone}</td>
            <td>
                <a href="/edit/${place.id}">edit</a>
                <a href="/delete/${place.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
