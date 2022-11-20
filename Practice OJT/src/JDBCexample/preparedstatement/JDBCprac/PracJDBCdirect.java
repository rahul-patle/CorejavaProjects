package JDBCexample.preparedstatement.JDBCprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PracJDBCdirect {

	// fetch by using resultset without using user input.
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt","root","root");
	//	PreparedStatement statement = connection.prepareStatement("create table phone (pid int,pname varchar(20))");
	//PreparedStatement statement = connection.prepareStatement("insert into phone (pid,pname)values (4,'oppo')");
	//	statement.executeUpdate();
	//	System.out.println("table inserted");
		
		PreparedStatement statement = connection.prepareStatement("select * from phone");		
		ResultSet resultset =statement.executeQuery();
		while(resultset.next()) {
			int pid = resultset.getInt(1);
			String pname = resultset.getString(2); 
			System.out.println(pid +" "+ pname);
	
		}

	}
	
}
