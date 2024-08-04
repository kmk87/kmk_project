package com.mk.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mk.user.vo.User;


@WebServlet("/user/loginEnd")
public class LoginEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginEndServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		User u = new User();
		
		if(u != null) {
			HttpSession session = request.getSession(true); // 세션 처음 만들어서 true
			if(session.isNew() || session.getAttribute("user") == null) {
				session.setAttribute("user",  u);
				session.setMaxInactiveInterval(60*30);
			}
			// 메인페이지 요청
			response.sendRedirect("/");
		} else {
			// 로그인 실패 페이지로 이동
			RequestDispatcher view = request.getRequestDispatcher("/views/user/login_fail.jsp");
			view.forward(request,response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
