<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="../../resources/css/user/create.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file="../include/header.jsp" %>
	<%@ include file="../include/nav.jsp" %>
	<section>
		<div id="section_wrap">
			<div class="word">
				<h3>회원가입</h3><br>
			</div>
			<div class="create">
				<form name="create" action="/user/createEnd" method="post">
					<input type="text" name="user_id" placeholder="아이디"><br>
					<input type="password" name="user_pw" placeholder="비밀번호"><br>
					<input type="password" name="user_pw_check" placeholder="비밀번호 확인"><br>
					<input type="text" name="user_nick" placeholder="닉네임"><br>
					<input type="email" name="user_email" placeholder="이메일"><br>
					<input type="button" value="회원가입" onclick="createUserForm();">
					<input type="reset" value="초기화">
				</form>
			</div>
			<div class="login">
				<a href="/user/login">로그인</a>
			</div>
		</div>
	</section>
	<script>
		function createUserForm(){
			const form = document.create;
			if(!form.user_id.value){
				alert("아이디를 입력하세요.");
				form.user_id.focus();
			} else if(!form.user_pw.value){
				alert("비밀번호를 입력하세요");
				form.user_pw.focus();
			} else if(!form.user_pw_check.value){
				alert("비밀번호 확인을 입력하세요.");
				form.user_pw_check_focus();
			} else if(form.user_pw.value != form.user_pw_check.value){
				alert("비밀번호가 일치하는지 확인하세요.");
				form.user_pw.focus();
			} else if(!form.user_nick.value){
				alert("닉네임을 입력하세요.");
				form.user_nick.focus();
			} else if(!form.user_email.value){
				alert("이미엘을 입력하세요.");
				form.user_email.focus();
			} else{
				form.submit();
			}
		}
	</script>
</body>
</html>