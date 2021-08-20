<%@ page import="com.example.begin.dto.DBoxDTO" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <% DBoxDTO dBoxDTO=(DBoxDTO)request.getAttribute("value");%>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>NAME</td>
        </tr>
        <tr>
            <td><%=dBoxDTO.getUser_id()%></td>
            <td><%=dBoxDTO.getUser_name()%></td>
        </tr>
    </table>
</body>
</html>

<!--<%= dBoxDTO.getUser_id()%> : <%=dBoxDTO.getUser_name()%>-->