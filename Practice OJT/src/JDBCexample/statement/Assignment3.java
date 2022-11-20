package JDBCexample.statement;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt", "root", "root");

		while (true) {
			System.out.println("select for name contain 1.@, 2$,3.safely exit");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:

				Statement st = connection.createStatement();

				String designa = "@";
				
				if(designa.contains("@")) {

					st.executeUpdate("insert into ojt.student SELECT * FROM ojt2.student where name like '%@'");

					System.out.println("data stored successfully of @  ");
				}
				break;
			case 2:

				Statement st1 = connection.createStatement();
					designa = "$";

				if(designa.contains("$")) {
					
					st1.executeUpdate("insert into ojt.student SELECT * FROM ojt2.student where name like '%$'");

					System.out.println("data stored successfully of $  ");
				}
				break;
				
				
			case 3:
				System.out.println(" safely exit");
				System.exit(0);
			}

		}
	}
}
