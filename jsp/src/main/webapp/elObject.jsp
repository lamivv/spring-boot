<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elObject.jsp</title>
</head>
<body>
	<%
	// page -> request -> session -> application => 모두없으면 null
	request.setAttribute("userName", "김땅콩귀여워");
	session.setAttribute("userName", "김치즈깜찍해");

	request.setAttribute("list", Arrays.asList("월요일", "화요일", "수요일"));
	%>
	username: ${userName}
	<br> session username: ${sessionScope.userName}
	<br> parameter: ${param.age }
	<%=request.getParameter("age")%><br> parameter: ${params.age }
	<%=request.getParameterValues("age")%><br> header:
	${header["user-agent"] }
	<br> header2:
	<%=request.getHeader("User-Agent")%><br> ip addr:
	${pageContext.request.remoteAddr }
	<%=request.getRemoteAddr()%><br>

	<ul>
		<c:forEach items="${list }" var="week">
			<li>${week }</li>
		</c:forEach>
	</ul>
</body>
</html>