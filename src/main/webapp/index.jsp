<%@page isELIgnored="false" pageEncoding="utf-8" contentType="text/html;utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:forEach items="${requestScope.a}" var="admin">
    ${admin.password}
    ${admin.username}
</c:forEach>
</body>
</html>
