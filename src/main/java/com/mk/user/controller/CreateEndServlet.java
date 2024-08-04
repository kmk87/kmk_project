package com.mk.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mk.user.service.UserService;
import com.mk.user.vo.User;


@WebServlet("/user/createEnd")
public class CreateEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CreateEndServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String nick = request.getParameter("user_nick");
		String email = request.getParameter("user_email");
		
		User u = new User();
		u.setUser_id(id);
		u.setUser_pw(pw);
		u.setUser_nick(nick);
		u.setUser_email(email);
		
		int result = new UserService().createUser(u);
		
		RequestDispatcher view = request.getRequestDispatcher("/views/user/create_fail.jsp");
		
		if(result > 0) {
			view = request.getRequestDispatcher("/views/user/create_success.jsp");
		}
		
		view.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
