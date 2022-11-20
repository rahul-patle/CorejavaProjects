package com.kiranacademy.Aug_8JDBC_EX;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;
import java.sql.*;

public class PreparedStatementEx2 {

	public static void main(String[] args) throws Exception 
	{
		int choice;
		
		Scanner scanner = new Scanner(System.in);
		
		Connection connection = ConnectionUtility.giveConnection();
		
		// connection ==> [ createStatement() , prepareStatement() ] Connection object
			
		PreparedStatement prepareStatement=connection.prepareStatement("update students set name=? where rno=?");
	
				System.out.println("Enter roll number :-  ");
				int rno=scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Enter new name :-  ");
				String name=scanner.nextLine();
				
			    prepareStatement.setString(1,name);
			    prepareStatement.setInt(2, rno);
				
				prepareStatement.executeUpdate();
				
				System.out.println("record updated");
				
	
	 
	}//main
}
