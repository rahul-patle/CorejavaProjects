package com.kiranacademy.Aug_8JDBC_EX;

import java.sql.*;


public class TestJDBC {

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");// it will execute static block of Driver class . Inside static block object of Driver class is created
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		
		
		/* class StatementImpl implements Statement --- MYSQL
		 * class OracleStatementImpl implements Statement ---- Oracle
		 * */

		Statement statement=connection.createStatement();
	
		//statement.executeUpdate("create table students(rno int,name varchar(20))");
		
		//statement.executeUpdate("insert into students values(2,'sachin')");
		
		//statement.executeUpdate("update students set name='java' where rno=1");
		
		statement.executeUpdate("delete from students where rno=1");
		
		System.out.println("success");
		
	}
}
