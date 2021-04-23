<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인하기</h1>
<form action="../MemberServlet" method="post" >
아이디: <input type="text" name="userid" value="100"><br>
비밀번호: <input type="password" name="userpw" value="SKING"><br>
이름 : <input type="text" name="username" value="heewon"><br>
고객/보호소 :<input type="number" name="usernumber" value="0"><br>
<input type="submit" value="회원가입하기">

</form>
</body>
</html>