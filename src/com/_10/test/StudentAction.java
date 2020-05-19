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
//		addStudent(new Student("���;�","1912402050911",20,"��"));
//		System.out.println(get("1912402050911").toString());
		
	}
	//���ѧ��
	public static void addStudent (Student g) throws Exception{
	Connection con=DBUTil.getConnection() ; //�����õ����ݿ������.
	String sql="insert into student"+" (ID, name, sex, age) "+"values ("+"?, ?, ?, ?)";
	PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sql);
	psmt.setString(1,g.getsId() ) ;
	psmt.setString(2,g.getName() ) ;
	psmt.setString(3,g.getSex()) ;
	psmt.setInt(4,g.getAge() ) ;
	psmt.execute () ;
	con.close () ;
 }
	
	//ɾ��ѧ��
	public static void delStudent (String s) throws SQLException{
	Connection con=DBUTil . getConnection() ; //�����õ����ݿ������
	String sql="" +
	"delete from student "+
	"where id=?";//������?��ʾ�� �൱��ռλ��;
	//Ԥ����sq1���
	PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sql) ;
	//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
	psmt. setString(1,s) ;
	//ִ��SQL���
	psmt . execute () ;
    }
	 public static void updateStudnet (Student s) throws SQLException{
		Connection con=DBUTil . getConnection() ;//�����õ����ݿ������
		String sql=""+
		"update student "+
		"set name=?, sex=?, age=? "+
		"where id=?"; 
		//Ԥ����sql���
		PreparedStatement psmt = (PreparedStatement) con . prepareStatement (sql) ;
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		psmt. setString(1,s. getName () ) ;
		psmt. setString(2,s.getSex() ) ;
		psmt. setInt (3,s.getAge() ) ;
		psmt . setString(4,s.getsId()) ;
		//ִ��SQL���
		psmt . execute() ;
		}
	 //����ID��ȡѧ��
	 public static Student get (String id) throws SQLException{
	 Student g=null;
	 Connection con=DBUTil . getConnection() ;//�����õ����ݿ������
	 String sql="" +
	 "select * from student "+
	 "where id=?"; //������?��ʾ���൱��ռλ��;
	 //Ԥ����sq1���
	 PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sql) ;
	 //�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
	 psmt. setString(1, id) ;
	 //ִ��SQL���
	 /*psmt.execute() ;*/
	 //execute ()������ִ�и������ݿ����(�����������޸ġ�ɾ��) ; executeQuery()��ִ�в�ѯ
	 ResultSet rs = psmt . executeQuery() ; //����һ�������
	 //���������
	 while (rs.next()) {
	 g=new Student () ;
	 g. setsId(rs .getString("ID") ) ;
	 g. setName (rs. getString ("name") ) ;
	 g.setAge (rs.getInt("age")); 
	 g. setSex (rs.getString ("sex")) ;
	 //rs. getDate ("birthday")��õ���java.sql. Date���͡�ע��: java. sql .Date��
	 return g;
	 }
	return g;
	 }
	 //��ѯ����(������������Ϣȥ��ѯ)
	 public static List<Student> get (String name, String sex) throws SQLException{
	 List<Student> result=new ArrayList<Student> () ;
	 Connection con=DBUTil . getConnection() ;//�����õ����ݿ������
	 StringBuffer sb=new StringBuffer () ;
	 sb. append("select * from student ") ;
	 sb. append ("where name like ? and sex like ?") ;
	 //Ԥ����sq1���
	 PreparedStatement psmt = (PreparedStatement) con. prepareStatement (sb. toString()) ;
	 //�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
	 psmt. setString(1,"��"+name+"��") ;
	 psmt . setString(2,""+sex+"q") ;
	 System. out.println (sb. toString() ) ;
	 //ִ��SQL���
	 /*psmt.execute() ;*///execute()������ִ�и������ݿ����(�����������޸ġ�ɾ��) ;execut
	 ResultSet rs = psmt . executeQuery() ; //����һ�������
	 Student g=null;
	 //���������.
	 while(rs.next()) {
	 g=new Student () ;
	 g. setsId(rs.getString("ID") ) ;
	 g. setName (rs. getString ("name") ) ;
	 g. setAge (rs.getInt ("age")) ;
	 g. setSex (rs. getString("sex")) ;
	 result.add(g) ; //�������װ��������
	 return result;
	 }
	return result;
	 }



}
