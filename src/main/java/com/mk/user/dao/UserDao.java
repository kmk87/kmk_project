package com.mk.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mk.user.vo.User;

import static com.mk.common.sql.JDBCTemplate.close;

public class UserDao {
	
	public int createUser(User u, Connection conn) {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "INSERT INTO `user`(`user_id`, `user_pw`, `user_nick`,`user_email`) VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, u.getUser_id());
			pstmt.setString(2, u.getUser_pw());
			pstmt.setString(3, u.getUser_nick());
			pstmt.setString(4, u.getUser_email());
			
			result = pstmt.executeUpdate();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
}
