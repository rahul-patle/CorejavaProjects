package JDBCexample.preparedstatement.JDBCprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ByResultsetobject12A {

	// fetch by using resultset without using user input.

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt3", "root", "root");

		PreparedStatement statement1 = connection.prepareStatement("select * from ojt3.mountain");
	 PreparedStatement statement2 = connection.prepareStatement("insert into ojt3.impala values (?,?,?)");

		ResultSet resultset = statement1.executeQuery();

		while (resultset.next()) {

			int ino = resultset.getInt(1);
			String iname = resultset.getString(2);
			int salary = resultset.getInt(3);

			System.out.println(ino + " " + iname + " " + salary);

			resultset.getInt("ino");
			resultset.getString("iname");
			resultset.getInt("salary");

			if(iname.contains("#")||iname.contains("@")) {
				statement2.setInt(1, ino);
				statement2.setString(2,iname);
				statement2.setInt(3,salary);
				System.out.println("stored");

				statement2.executeUpdate();
				
			}
		}
	}
}
