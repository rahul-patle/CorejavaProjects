package com.kiranacademy.Aug_8JDBC_EX;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SwitchCaseJDBCEx {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
			
		while(true)
		{
			System.out.println("1.insert 2.update 3. delete 4. select all 5. select specific 6.exit");
			
			System.out.println("Enter your choice :-  ");
			
			int choice = Integer.parseInt(bufferdReader.readLine());//<== it converts string to int
			

			Connection connection = ConnectionUtility.giveConnection();
			
			PreparedStatement prepareStatement;
			ResultSet resultset;
			
			int rno;
			String name;
			
			switch(choice)
			{
				case 1:
					
					prepareStatement=connection.prepareStatement("insert into students(rno,name) values(?,?)");
					
					System.out.println("Enter rno and name :- ");
					rno= Integer.parseInt(bufferdReader.readLine());
					name=bufferdReader.readLine();
					
					prepareStatement.setInt(1, rno);
					prepareStatement.setString(2, name);
					
					prepareStatement.executeUpdate();
					
					break;
					
				case 2:
					
					prepareStatement=connection.prepareStatement("update students set name=? where rno=?");
					System.out.println("Enter rno and new name :- ");
					
					rno= Integer.parseInt(bufferdReader.readLine());
					name=bufferdReader.readLine();
					
					prepareStatement.setString(1,name);
					prepareStatement.setInt(2,rno);
					
					prepareStatement.executeUpdate();
									
					break;
				
				case 3:
					
					prepareStatement=connection.prepareStatement("delete from students where rno=?");
					System.out.println("Enter rno :- ");
					
					rno= Integer.parseInt(bufferdReader.readLine());
						
					prepareStatement.setInt(1,rno);
					
					prepareStatement.executeUpdate();
									
					break;
					
					
				case 4:
		
					prepareStatement=connection.prepareStatement("select * from students");
										
					resultset=prepareStatement.executeQuery();// resultset ==> [] ResultSet object
					
					while(resultset.next())
					{
						System.out.println(resultset.getInt("rno") + " " + resultset.getString("name"));
					}
					
					break;
					
				case 5:
					
					prepareStatement=connection.prepareStatement("select * from students where rno=?");
					System.out.println("Enter rno :- ");
					
					rno= Integer.parseInt(bufferdReader.readLine());
					prepareStatement.setInt(1,rno);
					
					resultset=prepareStatement.executeQuery();// resultset ==> [] ResultSet object
					
					if(resultset.next())
						
						System.out.println(resultset.getInt("rno") + " " + resultset.getString("name"));
					
					else
					
						System.out.println("no such record found");
					
					break;
					
					
				case 6:
					
					System.exit(0);
					
				default:
					
					System.out.println("please enter 1/2/3 only");
				
			}// switch case ends
			
					
			System.out.println("Operation Successful");
			
			
		}// while loop ends
		
		
		
	}//main ends

}//class ends
