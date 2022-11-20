package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCByScanner {

	public static void main(String[] args) throws Exception {
		Connection connection = Connectionutilise.conectionutilise();
	
		while (true) {
			System.out.println("enter the choice:- 1.insert ,2.update 3.delete 4.selectAll 5.select 6.select 3 sid ,7. exit");

			PreparedStatement preparestatement ;
			ResultSet resultset;
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				preparestatement = connection.prepareStatement("insert into student (sid, name ,sphone) values (?,?,?)");
                System.out.println("enter sid , name, sphone");
				int sid = scanner.nextInt();
				String name = scanner.next();
				int sphone = scanner.nextInt();

				preparestatement.setInt(1, sid);
				preparestatement.setString(2, name);
				preparestatement.setInt(3, sphone);
				
				preparestatement.executeUpdate();
				break;
			case 2:
				preparestatement = connection.prepareStatement("update student set name=? where sid= ?");
                System.out.println("enter :- name, sid");
                name = scanner.next();
                sid = scanner.nextInt();
                
                preparestatement.setString(1, name);
                preparestatement.setInt(2, sid);
				
				preparestatement.executeUpdate();
				break;
			case 3:
				preparestatement = connection.prepareStatement("delete from student where sid = ?");
				  System.out.println("enter :- sid");
	              
				sid = scanner.nextInt();
	             preparestatement.setInt(1, sid);
	            
				preparestatement.executeUpdate();
				break;
			case 4:
				preparestatement = connection.prepareStatement("select * from student");
				resultset = preparestatement.executeQuery() ;
				
				while(resultset.next()) {
				System.out.println(resultset.getInt(1)+ " "+ resultset.getString(2)+" "+resultset.getInt(3));
				}
				break;
			case 5:	
				preparestatement = connection.prepareStatement("select * from student where sid = ?");
				
				System.out.println("enter :- sid");
				sid = scanner.nextInt();
					
				preparestatement.setInt(1, sid);
				         
				resultset = preparestatement.executeQuery() ;
				if(resultset.next()){ 
				System.out.println(resultset.getInt(1)+ " "+ resultset.getString(2)+" "+resultset.getInt(3));
				}else {
					System.err.println("record not found");
				}
				break;
			
			case 6:	
				preparestatement = connection.prepareStatement
				("select * from student where sid in (?,?)");
				
				
				System.out.println("enter :- sid");
				int sid1 = scanner.nextInt();
				int sid2 = scanner.nextInt();
				
				preparestatement.setInt(1, sid1);
				preparestatement.setInt(2, sid2);	
				
				resultset = preparestatement.executeQuery() ;
			while (resultset.next()){ 
				System.out.println(resultset.getInt(1)+ " "+ resultset.getString(2)+" "+resultset.getInt(3));
				}
				break;
				case 7:
				System.err.println("system exit safely");
				
				System.exit(0);
				
			}// switch end
			System.out.println(" task completed");
		}// while loop end

	}//main end

}//class end
