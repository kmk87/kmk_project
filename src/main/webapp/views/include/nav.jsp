<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mk.user.vo.User" %>
<link href='../../resources/css/include/nav.css' rel="stylesheet" type="text/css">
<nav>
	<div id="nav_wrap">
		<%
			User user = (User)session.getAttribute("user");
			if(user == null){
		%>
		<div class="menu">
			<ul>
				<li>
					<a href="#">로그인</a>
				</li>
				<li>
					<a href="#">회원가입</a>
				</li>
			</ul>
		</div>
			
		
		<% }else{ %>
			<div class="menu">
				<ul>
					<li>
						<a href="#">게시글 등록</a>
					</li>
					<li>
						<a href="#">로그아웃</a>
					</li>
					<li>
						<a href="#">계정수정</a>
					</li>
				</ul>
			</div>
			
			
		<% } %>
		<div class="search">
			<form action="/board/list" name="search_board_form" method="get">
				<input type="text" name="board_title" placeholder="검색하고자하는 게시글의 제목을 입력하세요.">
				<input type="submit" value="검색">
			</form>
		</div>
	</div>
</nav>	 
