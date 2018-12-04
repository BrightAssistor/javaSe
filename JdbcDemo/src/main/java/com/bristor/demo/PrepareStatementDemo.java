package com.bristor.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatementDemo {

	public static void main(String[] args) {
		// 连接mysql
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://127.0.0.1:3306/TestDb?useUnicode=true&amp;characterEncoding=utf-8";
		final String user = "root";
		final String password = "123";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 1.加载驱动程序
			Class.forName(driver);
			// 2.建立链接
			conn = DriverManager.getConnection(url, user, password);
			// 3.创建preparedStatement
			String sql = "select * from class1 where name = ?";
			ps = conn.prepareStatement(sql);
			ps.setObject(1, "rose");
			// 4.执行sql
			rs = ps.executeQuery();
			// 5.处理结果集
			while (rs.next()) {
				System.out.println(rs.getObject(1));
				System.out.println(rs.getObject(2));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6.关闭资源
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}


}
