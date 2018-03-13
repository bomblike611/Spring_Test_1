<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="./go.do">Go</a>
<a href="./test/t">Test</a>]
<a href="./member/memberLogin">Login</a>
<img src="./resources/images/Tulips.jpg">
<img src="./img/Penguins.jpg"> 
<!-- MemberController의 memberlogin 메서드 실행 -->
<!-- view page는 WEB-INF/views/member/memberLogin.jsp -->
</body>
</html>
