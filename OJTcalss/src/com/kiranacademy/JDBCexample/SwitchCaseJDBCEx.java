package com.kiranacademy.JDBCexample;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

 

public class SwitchCaseJDBCEx {

	public static void main(String[] args) throws Exception {
		
		int eid,salary;
		String ename;
		ResultSet resultSet;
		
		
		Scanner scanner = new Scanner(System.in);
		Class.forName ("com.mysql.jdbc.Driver");
		PreparedStatement preparedStatement;
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt", "root", "root");
		
		while(true)
		{
			System.out.println("1.insert 2.update 3.delete 4.selectAll 5.select 6.exit");
			
			System.out.println("Enter your choice :-  ");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1:
					    preparedStatement=connection.prepareStatement("insert into employee(eid,ename,salary) values(?,?,?)");
					    
					    System.out.println("Enter eid,ename and salary :-  ");
					    
						eid=scanner.nextInt();
						ename=scanner.next();
						salary=scanner.nextInt();
						
						preparedStatement.setString(2,ename);
						preparedStatement.setInt(1,eid);
						preparedStatement.setInt(3,salary);
					
						preparedStatement.executeUpdate();
				     
					    break;
					    
				case 2:
						preparedStatement=connection.prepareStatement("update employee set ename=? , salary=? where eid=?");
					    
					    System.out.println("Enter eid,new ename and new salary :-  ");
						eid=scanner.nextInt();
						
						salary=scanner.nextInt();
						ename=scanner.next();
// we can provide input of names randomly; "but"					
// important note:1,2 and 3 represents  the position of the column in query;
// so it must be same as query						
						preparedStatement.setString(1,ename);
						preparedStatement.setInt(2,salary);
						preparedStatement.setInt(3,eid);
					
						preparedStatement.executeUpdate();
						
						break;
						
				case 3:
						preparedStatement=connection.prepareStatement("delete from employee where eid=?");
					    
					    System.out.println("Enter eid :-  ");
						eid=scanner.nextInt();
										
						preparedStatement.setInt(1,eid);
					
						preparedStatement.executeUpdate();
						
						break;
						
				case 4:
						preparedStatement=connection.prepareStatement("select * from employee");
						resultSet=preparedStatement.executeQuery();
						
						while(resultSet.next())
						{
							System.out.print(resultSet.getInt("eid") + " " + resultSet.getString("ename") + " " + resultSet.getInt("salary"));
							System.out.println();
						}
						
						break;
						
				case 5:
					
						preparedStatement=connection.prepareStatement("select * from employee where eid=?");
						System.out.println("Enter eid :- ");
						eid=scanner.nextInt();
						preparedStatement.setInt(1,eid);			
						resultSet=preparedStatement.executeQuery();
						
						resultSet.next();
						
						System.out.print(resultSet.getInt("eid") + " " + resultSet.getString("ename") + " " + resultSet.getInt("salary"));
						System.out.println();
							
						break;
						
				default:
						System.out.println("Enter choice 1-6 only");
						break;
						
				case 6:
					System.out.println("thank you ended");
						System.exit(0);
					
			}// switch case ends
			
			
			System.out.println("done.next operation:-  ");
			
		}// while loop ends
		
	}// main ends

}
