package com.bristor.demo;

public class ConnectionDifferent {

	public static void main(String[] args) {
		// 连接mysql
		final String driver1 = "com.mysql.jdbc.Driver";
		final String url1 = "jdbc:mysql://127.0.0.1:3306/TestDb?useUnicode=true&amp;characterEncoding=utf-8";
		final String user1 = "root";
		final String password1 = "123";
		//连接oracle
		final String driver2 = "oracle.jdbc.driver.OracleDriver";
		final String url2 = "jdbc:oracle:thin:@//127.0.0.1:1521/XA";
		final String user2 = "root";
		final String password2 = "123";
		//连接db2
		final String driver3 = "com.ibm.db2.jcc.DB2Driver";
		final String url3 = "jdbc:db2://127.0.0.1:50000/<database_name>";
		final String user3 = "root";
		final String password3 = "123";

	}

}
