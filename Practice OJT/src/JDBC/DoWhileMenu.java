package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DoWhileMenu {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt3", "root", "root");

		Statement st = con.createStatement();
		PreparedStatement pst;
		ResultSet rs;
		Scanner sc = new Scanner(System.in);

		try {
			do{
				System.out.println("Please select the option you want to do");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. Display");
				System.out.println("5. Search");
				System.out.println("6. Searching Perticular Rows");
				System.out.println("7. Exit");
				System.out.println();

				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					System.out.println("Enter id:");
					int id = sc.nextInt();
					System.out.println("Enter name:");
					String name = sc.next();
					sc.nextLine();

					System.out.println("Enter role:");
					String role = sc.next();
					sc.nextLine();

					System.out.println("Enter salary:");
					Double salary = sc.nextDouble();
					String query = "insert into dbj values(" + id + ",'" + name + "','" + role + "'," + salary
							+ ")";
					st.executeUpdate(query);
					System.out.println("1  row inserted");
					System.out.println();
					break;

				case 2:
					System.out.println("Enter id to be updated");
					int id0 = sc.nextInt();
					// sc.nextLine();
					System.out.println("Enter name to be updated");
					String name1 = sc.nextLine();

					System.out.println("Enter role to be updated");
					String role1 = sc.nextLine();
					// sc.next();
					String query2 = " update dbj set name='" + name1 + "', role='" + role1 + "'where id=" + id0;
					st.executeUpdate(query2);
					System.out.println("1 row updated");
					System.out.println();
					break;

				case 3:
					System.out.println("Enter id to be deleted");
					int id1 = sc.nextInt();
					String query3 = "delete from employee where id= " + id1;
					st.executeUpdate(query3);
					System.out.println("1 row deleted");
					System.out.println();
					break;

				case 4:

					String query4 = "select * from employee";
					System.out.println("id  name     role     salary");
					System.out.println("==========================");
					rs=st.executeQuery(query4);
					while (rs.next()) {
						System.out.println(
								rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
					}
					break;

				case 5:
					System.out.println("Enter the id to search the record:");
					int id2 = sc.nextInt();
					String query5 = "Select * from dbj where id=" + id2;
					rs = st.executeQuery(query5);
					System.out.println("id  name    role     salary");
					while (rs.next()) {
						System.out.println(
								rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
					}
					System.out.println();
					System.out.println("do you want to continue (Yes/No)...");
					System.out.println();
					break;

				case 6:
					String query6 = "Select * from dbj where id in(?,?)";
					pst = con.prepareStatement(query6);
					System.out.println("Enter 2 id's to search");
					int id11= sc.nextInt();
					int id22= sc.nextInt();
					pst.setInt(1, id11);
					pst.setInt(2, id22);
					
					rs = pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
					}
					System.out.println();
					break;

				case 7:
					System.out.println("Thank You");
					System.exit(0);

				} // switch ends

			}while(true);
		} catch (Exception e) {
			// System.out.println("StackTraceElement");
			e.printStackTrace();

			System.out.println("I will execute....");

		}

	}
}
