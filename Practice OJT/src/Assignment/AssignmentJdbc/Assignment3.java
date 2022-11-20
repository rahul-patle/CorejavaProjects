package Assignment.AssignmentJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment3 {
	

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt", "root", "root");
		PreparedStatement st = connection.prepareStatement("select * from ojt.student");
		PreparedStatement stmt1 = connection.prepareStatement("insert into ojt.student2 values(?,?,?)");
		ResultSet resultset = st.executeQuery();

		while (true) {

			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getInt(3));

				int sid = resultset.getInt("sid");
				String name = resultset.getString("name");
				int sphone = resultset.getInt("sphone");

				// faculty table

				if (name.contains("$") || name.contains("@")) {
					stmt1.setInt(1, sid);
					stmt1.setString(2, name);
					stmt1.setInt(3, sphone);
					System.out.println("data stored in student2");
					stmt1.executeUpdate();
				}

			}
			st.close();
		}

	}
}
