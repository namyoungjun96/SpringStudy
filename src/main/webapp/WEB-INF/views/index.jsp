<%@ page import="com.example.begin.dto.DBoxDTO" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <% DBoxDTO  dBoxDTO=(DBoxDTO)request.getAttribute("value");%>
    ID = <%= dBoxDTO.getUser_id()%><br>
    NAME = <%=dBoxDTO.getUser_name()%>
</body>
</html>

<!--<%= dBoxDTO.getUser_id()%> : <%=dBoxDTO.getUser_name()%>-->