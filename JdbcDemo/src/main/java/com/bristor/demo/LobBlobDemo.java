package com.bristor.demo;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.log.Log;

public class LobBlobDemo {

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
			String sql = "insert into lobDemo values(2,?)";
			ps = conn.prepareStatement(sql);
			
			//第一种
			FileInputStream fis = new FileInputStream(new File("D:\\image1.jpg"));
			ps.setBinaryStream(1, fis);
			
			//第二种
//			FileInputStream fis = new FileInputStream(new File("D:\\image1.jpg"));
//			ps.setBlob(1, fis);
			
			//第三种
//			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("hello world".getBytes());
//			ps.setBlob(1, byteArrayInputStream);
			
			//第四种
//			ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
//			InputStream resourceAsStream = contextClassLoader.getResourceAsStream("D:\\image1.jpg");
//			ps.setBlob(1, resourceAsStream);
			
			
			// 4.执行sql
			int executeUpdate = ps.executeUpdate();
			// 5.处理结果集
			System.out.println("result:"+executeUpdate);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
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
