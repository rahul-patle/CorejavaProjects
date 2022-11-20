package com.kiranacademy.Aug_8JDBC_EX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import com.mysql.jdbc.Driver;
// JDBC is an API (Application Programming Interface).
// API contains interfaces using which programmer writes program

public class Difference {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try 
		{
													// protocal				
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
					
PreparedStatement preparedStatement=connection.prepareStatement("insert into students(rno,name) values(?,?)");


for(int i=1;i<=3;i++)
    {
	
		System.out.println("Enter rno and name :-  ");
		int rno=scanner.nextInt();
		String name=scanner.next();
		
		preparedStatement.setInt(1, rno);
		preparedStatement.setString(2, name);
		
		preparedStatement.executeUpdate();
				
		System.out.println("Record added ");
	}					
			
		// Statement will send  query to database for compilation  
		// for each execution means it will compile query 
		// for 3 times here .
		// whereas PreparedStatement will send  query to database for compilation  ONLY ONE time .
			
		Statement statement=connection.createStatement();
	
			for(int i=1;i<=3;i++)
			{
				statement.executeUpdate("insert into students values(112,'java is easy')");;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("All is well");
		
		
		
	}// main ends

}

