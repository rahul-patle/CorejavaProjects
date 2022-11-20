package Assignment.AssignmentJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment2 {
	int eno;
	String ename;
	int salary;
	String role;

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt2", "root", "root");
		PreparedStatement st = connection.prepareStatement("select * from ojt2.emp");
		PreparedStatement stmt1 = connection.prepareStatement("insert into ojt2.faculty values(?,?,?,?)");
		PreparedStatement stmt2 = connection.prepareStatement("insert into ojt2.students values(?,?,?,?)");
		PreparedStatement stmt3 = connection.prepareStatement("insert into ojt2.admin values(?,?,?,?)");
		ResultSet resultset = st.executeQuery();

		while (true) {
			
			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getInt(3) + " "
						+ resultset.getString(4));

				int eno = resultset.getInt("eno");
				String ename = resultset.getString("ename");
				int salary = resultset.getInt("salary");
				String role = resultset.getString("role");

				// faculty table

				if (role.contains("faculty")) {
					stmt1.setInt(1, eno);
					stmt1.setString(2, ename);
					stmt1.setInt(3, salary);
					stmt1.setString(4, role);
				
					System.out.println("data stored in faculty");
					stmt1.executeUpdate();
				}

				else if (role.contains("students")) {
					stmt2.setInt(1, eno);
					stmt2.setString(2, ename);
					stmt2.setInt(3, salary);
					stmt2.setString(4, role);
					System.out.println("data stored in students");
					stmt2.executeUpdate();
				} else {

					stmt3.setInt(1, eno);
					stmt3.setString(2, ename);
					stmt3.setInt(3, salary);
					stmt3.setString(4, role);
					stmt3.executeUpdate();
					System.out.println("data stored in admin");

				}
				
			}
			st.close();
			
		}
		
	}
}
