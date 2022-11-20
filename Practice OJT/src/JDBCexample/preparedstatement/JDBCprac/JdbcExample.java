package JDBCexample.preparedstatement.JDBCprac;

// JDBC switch case example
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class JdbcExample {
	public static void main(String[] args) throws Exception {
		int eid, salary;
		String ename;
		ResultSet resultSet;

		Scanner scanner = new Scanner(System.in);
		
		Class.forName("com.mysql.jdbc.Driver");
	
		PreparedStatement statement;
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		while (true) {
			System.out.println(" execute 1.insert, 2.update , 3.delete, 4.selectall, 5.select 6. exit");
			System.out.println("enter Anykey");
			int anykey = scanner.nextInt();

			switch (anykey)

			{
			case 1:
				statement = connection.prepareStatement("insert into test.student (eid,ename,salary)values(?,?,?)");
				System.out.println("enter, eid, ename,salary");
				
				eid = scanner.nextInt();
				ename = scanner.next();
				salary = scanner.nextInt();
		
				
				statement.setInt(1,eid);
				statement.setString(2, ename);
				statement.setInt(3,salary);
				
				statement.executeUpdate();
				break;
			case 2:
				statement = connection.prepareStatement("update test.student set ename= ?,salary= ? where eid=?");
				System.out.println("enter new ename,new salary ,eid");
				
				eid = scanner.nextInt();
				ename = scanner.next();
				salary = scanner.nextInt();
			
				
				statement.setInt(1,eid);
				statement.setString(2, ename);
				statement.setInt(3,salary);
				
				statement.executeUpdate();
				break;
				
		case 3:
				statement=connection.prepareStatement("delete from test.student where eid=?");
			    
			    System.out.println("Enter eid :-  ");
				eid=scanner.nextInt();
								
				statement.setInt(1,eid);
			
				statement.executeUpdate();
				
				break;
		case 4:
			statement=connection.prepareStatement("select * from test.student");
			resultSet =statement.executeQuery();
		    
		    System.out.println("all data fetch");
		    while(resultSet.next())
		    System.out.println(resultSet.getInt("eid")+" "+(resultSet.getInt("salary"))+" "+(resultSet.getString("ename")));
			System.out.println();
			break;
		case 5:
			statement=connection.prepareStatement("select * from test.student where eid=?");
			System.out.println(" Enter eid:");
			eid=scanner.nextInt();
			statement.setInt(1,eid);
		
			resultSet =statement.executeQuery();
			   
		    resultSet.next();
		    System.out.println(resultSet.getInt("eid")+" "+(resultSet.getInt("salary"))+" "+(resultSet.getString("ename")));
			System.out.println();
			break;
		case 6: System.out.println("safely exit");
				System.exit(0);
		     	break;
		
		default: System.out.println("select 1 to 6 options");
			
			}
			System.out.println("operation complete");
		}

	}
}