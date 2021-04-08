<%--
  Created by IntelliJ IDEA.
  User: ergunmu1
  Date: 08/04/2021
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Custom-Hello</title>
    <link type="text/css" rel="stylesheet" href="styles.css" />
</head>
<body>

<h1><c:out value="${ msg }" /></h1>

<!-- <c:if test="${ !empty nom }"><p><c:out value="Bonjour, vous vous appelez ${ nom }" /></p></c:if> -->

</body>
</html>
