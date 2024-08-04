<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 성공</title>
<link href="../../resources/css/user/create_result.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file="../include/header.jsp" %>
	<%@ include file="../include/nav.jsp" %>
	<section>
		<div id="section_wrap">
			<div class="word">
				<h3>회원가입에 성공하였습니다. 로그인해주세요.</h3>
			</div>
			<div class="others">
				<a href="/user/login">로그인</a>			
			</div>
		</div>
	</section>
</body>
</html>