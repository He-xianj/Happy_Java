package com._10.test;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DBUTil {
	private static final String URL="jdbc:mysql://cdb-8n7tqsvb.gz.tencentcdb.com:10010/student_dome";
	private static final String NAME="root";
	private static final String PASSWORD="wzh123456";
	private static Connection conn=null ;
	static{//¾²Ì¬´úÂë¿é
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection(URL,NAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e. printStackTrace () ;
		}
	}
	public static Connection getConnection() {
		return conn;
	}
	public static void main (String[] args) throws SQLException {
		Statement stmt= (Statement) conn. createStatement ();
		ResultSet rs=stmt . executeQuery ("select * from student") ;
		while (rs.next()) {
			System. out. println (rs.getString("name")+" "+rs.getString("ID")+" "+rs.getString("sex")+" "+rs.getString("age"));
		}
		System. out.println("111111") ;
		conn.close() ;
	}
}
