package Assignment.AssignmentJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt3","root","root");
		PreparedStatement prstatement= connection.prepareStatement("insert into mountain(ino,iname,salary) values (8,'bahadur#',653022)");
			prstatement.executeUpdate();
	        System.out.println("table inserted");
	}
	
}
