package com.mk.user.service;

import java.sql.Connection;

import com.mk.user.dao.UserDao;
import com.mk.user.vo.User;

import static com.mk.common.sql.JDBCTemplate.getConnection;
import static com.mk.common.sql.JDBCTemplate.close;

public class UserService {
	
	// 회원가입
	public int createUser(User u) {
		Connection conn = getConnection();
		int result = new UserDao().createUser(u,conn);
		close(conn);
		return result;
	}
}
