package com.kiranacademy.JDBCexample;

import java.sql.*;

public class JDBCexample {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");

		Statement statement = connection.createStatement();

		statement.executeUpdate("create table stu(rno int,name varchar(20))");

		System.out.println("success");
	}
}
