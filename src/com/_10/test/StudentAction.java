package com._10.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StudentAction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		delStudent ("520");
		System.out.println(get("1912402050911").toString());
//		addStudent(new Student("何贤君","1912402050911",20,"男"));
//		System.out.println(get("1912402050911").toString());
		
	}
	//添加学生
	public static void addStudent (Student g) throws Exception{
	Connection con=DBUTil.getConnection() ; //首先拿到数据库的连接.
	String sql="insert into student"+" (ID, name, sex, age) "+"values ("+"?, ?, ?, ?)";
	PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sql);
	psmt.setString(1,g.getsId() ) ;
	psmt.setString(2,g.getName() ) ;
	psmt.setString(3,g.getSex()) ;
	psmt.setInt(4,g.getAge() ) ;
	psmt.execute () ;
	con.close () ;
 }
	
	//删除学生
	public static void delStudent (String s) throws SQLException{
	Connection con=DBUTil . getConnection() ; //首先拿到数据库的连接
	String sql="" +
	"delete from student "+
	"where id=?";//参数用?表示， 相当于占位符;
	//预编译sq1语句
	PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sql) ;
	//先对应SQL语句，给SQL语句传递参数
	psmt. setString(1,s) ;
	//执行SQL语句
	psmt . execute () ;
    }
	 public static void updateStudnet (Student s) throws SQLException{
		Connection con=DBUTil . getConnection() ;//首先拿到数据库的连接
		String sql=""+
		"update student "+
		"set name=?, sex=?, age=? "+
		"where id=?"; 
		//预编译sql语句
		PreparedStatement psmt = (PreparedStatement) con . prepareStatement (sql) ;
		//先对应SQL语句，给SQL语句传递参数
		psmt. setString(1,s. getName () ) ;
		psmt. setString(2,s.getSex() ) ;
		psmt. setInt (3,s.getAge() ) ;
		psmt . setString(4,s.getsId()) ;
		//执行SQL语句
		psmt . execute() ;
		}
	 //根据ID获取学生
	 public static Student get (String id) throws SQLException{
	 Student g=null;
	 Connection con=DBUTil . getConnection() ;//首先拿到数据库的连接
	 String sql="" +
	 "select * from student "+
	 "where id=?"; //参数用?表示，相当于占位符;
	 //预编译sq1语句
	 PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sql) ;
	 //先对应SQL语句，给SQL语句传递参数
	 psmt. setString(1, id) ;
	 //执行SQL语句
	 /*psmt.execute() ;*/
	 //execute ()方法是执行更改数据库操作(包括新增、修改、删除) ; executeQuery()是执行查询
	 ResultSet rs = psmt . executeQuery() ; //返回一个结果集
	 //遍历结果集
	 while (rs.next()) {
	 g=new Student () ;
	 g. setsId(rs .getString("ID") ) ;
	 g. setName (rs. getString ("name") ) ;
	 g.setAge (rs.getInt("age")); 
	 g. setSex (rs.getString ("sex")) ;
	 //rs. getDate ("birthday")获得的是java.sql. Date类型。注意: java. sql .Date类
	 return g;
	 }
	return g;
	 }
	 //查询单个(根据姓名等信息去查询)
	 public static List<Student> get (String name, String sex) throws SQLException{
	 List<Student> result=new ArrayList<Student> () ;
	 Connection con=DBUTil . getConnection() ;//首先拿到数据库的连接
	 StringBuffer sb=new StringBuffer () ;
	 sb. append("select * from student ") ;
	 sb. append ("where name like ? and sex like ?") ;
	 //预编译sq1语句
	 PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sb. toString()) ;
	 //先对应SQL语句，给SQL语句传递参数
	 psmt. setString(1,"号"+name+"号") ;
	 psmt . setString(2,""+sex+"q") ;
	 System. out.println (sb. toString() ) ;
	 //执行SQL语句
	 /*psmt.execute() ;*///execute()方法是执行更改数据库操作(包括新增、修改、删除) ;execut
	 ResultSet rs = psmt . executeQuery() ; //返回一个结果集
	 Student g=null;
	 //遍历结果集.
	 while(rs.next()) {
	 g=new Student () ;
	 g. setsId(rs.getString("ID") ) ;
	 g. setName (rs. getString ("name") ) ;
	 g. setAge (rs.getInt ("age")) ;
	 g. setSex (rs. getString("sex")) ;
	 result.add(g) ; //将结果封装到对象中
	 return result;
	 }
	return result;
	 }



}
