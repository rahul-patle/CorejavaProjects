package com.kiranacademy.Aug_8JDBC_EX;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;
import java.sql.*;

public class PreparedStatementEx1 {

	public static void main(String[] args) throws Exception 
	{
		int choice;
		
		Scanner scanner = new Scanner(System.in);
		
		Properties properties = new Properties();
		
		// [ getProperty()] Properties class object
		
		properties.load(new FileInputStream("connectioninfo.properties"));
		
		// [username=root password = root getProperty()] Properties class object
		
		Class.forName(properties.getProperty("driver-class-name"));
					
		Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),properties.getProperty("password"));
			
		PreparedStatement prepareStatement=connection.prepareStatement("insert into students(rno,name) values(?,?)");
	
	do{
				System.out.println("Enter roll number :-  ");
				int rno=scanner.nextInt();
				
				System.out.println("Enter name :-  ");
				String name=scanner.next();
				
			    prepareStatement.setInt(1, rno);
			    prepareStatement.setString(2, name);
				
				prepareStatement.executeUpdate();
				
				System.out.println("record inserted");
				
				System.out.println("Do you want to add more records ?  (1.yes 2.no)");
				choice=scanner.nextInt();
				
	  }while(choice==1);
	
	 // if we input 1 then value becomes true and while loop executed
	}//main
}
