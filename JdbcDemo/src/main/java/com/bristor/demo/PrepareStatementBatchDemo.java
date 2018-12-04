package com.bristor.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatementBatchDemo {

	public static void main(String[] args) {
		// 连接mysql
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://127.0.0.1:3306/TestDb?useUnicode=true&amp;characterEncoding=utf-8";
		final String user = "root";
		final String password = "123";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 1.加载驱动程序
			Class.forName(driver);
			// 2.建立链接
			conn = DriverManager.getConnection(url, user, password);
			// 3.创建preparedStatement
			String sql = "insert into class1 values(?,?)";
			ps = conn.prepareStatement(sql);
			for (int i = 14; i < 16; i++) {
				
				ps.setObject(1, i);
				ps.setObject(2, "rose"+String.valueOf(i));
				ps.addBatch();
			}
			// 4.执行sql
			int[] executeBatch = ps.executeBatch();
			// 5.处理结果集
			System.out.println("result:"+executeBatch.length);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6.关闭资源
			try {
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
