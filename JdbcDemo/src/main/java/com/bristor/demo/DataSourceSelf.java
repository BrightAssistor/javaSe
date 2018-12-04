package com.bristor.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class DataSourceSelf {

	public static void main(String[] args) {
		MyDataSource myDataSource = new MyDataSource();
		Connection conn =null;
		PreparedStatement ps = null;
		try {
			conn = myDataSource.getConnection();
			String sql = "insert into lobDemo values(2,?)";
			ps = conn.prepareStatement(sql);
			FileInputStream fis = new FileInputStream(new File("D:\\image1.jpg"));
			ps.setBinaryStream(1, fis);
			int executeUpdate = ps.executeUpdate();
			System.out.println("result:"+executeUpdate);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (conn != null) {
					boolean returnConn = myDataSource.returnConn(conn);
					System.out.println("放回连接："+returnConn);
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}

class MyDataSource implements DataSource {
	private static LinkedList<Connection> connQueue = new LinkedList<Connection>();
	//初始化五个连接
	static {
		for (int i = 0; i < 5; i++) {
			Connection connection = JdbcConnectionUtil.getConnection();
			connQueue.add(connection);

		}
	}
	
	/**
	 * 放回连接
	 * @param conn
	 * @return
	 */
	public boolean returnConn(Connection conn) {
		System.out.println("放回前连接数："+connQueue.size());
		boolean add = connQueue.add(conn);
		System.out.println("放回后连接数："+connQueue.size());
		return add;
	}
	/**
	 * 获取连接
	 */
	@Override
	public Connection getConnection() throws SQLException {
		if (connQueue.size() == 0) {
			connQueue.add(JdbcConnectionUtil.getConnection());
		}
		return connQueue.removeFirst();
	}
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}