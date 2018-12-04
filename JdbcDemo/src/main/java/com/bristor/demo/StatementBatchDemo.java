package com.bristor.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementBatchDemo {

	public static void main(String[] args) {
		// 连接mysql
		final String driver = "com.mysql.jdbc.Driver";
		final String url = "jdbc:mysql://127.0.0.1:3306/TestDb?useUnicode=true&amp;characterEncoding=utf-8";
		final String user = "root";
		final String password = "123";
		Connection conn = null;
		Statement st = null;
		try {
			// 1.加载驱动程序
			Class.forName(driver);
			// 2.建立链接
			conn = DriverManager.getConnection(url, user, password);
			// 3.创建Statement
			st = conn.createStatement();
			// 4.执行sql
			String sql1="insert into class1 values(12,'ww')";
			String sql2="insert into class1 values(13,'ww1')";
			st.addBatch(sql1);
			st.addBatch(sql2);
			int[] executeBatch = st.executeBatch();
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
				if (st != null) {
					st.close();
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
