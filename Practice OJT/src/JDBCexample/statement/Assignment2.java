package JDBCexample.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt", "root", "root");
		while (true) {
			System.out.println("enter data in table 1.fac, 2stu,3.safely exit");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:

				Statement st = connection.createStatement();

				String designa = "fac";

				if (designa.contains("fac")) {

					st.executeUpdate("Insert INTO ojt.fac SELECT * FROM ojt2.members where designa like 'fac'");

					System.out.println("data stored successfully in fac");
				}
				break;
			case 2:

				Statement st1 = connection.createStatement();
				designa = "stu";

				if (designa.contains("stu")) {

					st1.executeUpdate("Insert INTO ojt.stu SELECT * FROM ojt2.members where designa like 'stu'");

					System.out.println("data stored successfully in stu");
				}
				break;
			case 3:
				System.out.println("safely exit");
				System.exit(0);
			}
		}
	}
}