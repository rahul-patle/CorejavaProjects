package JDBC;

import java.sql.*;
import java.util.Scanner;

public class bydowhile {

	public static void main(String[] args) {
try {	Connection connection = Connectionutilise.conectionutilise();
		Scanner scanner = new Scanner(System.in);
		
		PreparedStatement preparestatement;
		ResultSet resultset;
		
			do {
				System.out.println("enter the choice:- 1.insert ,2.update 3.delete 4.selectAll 5.select 6. exit");

				int choice = scanner.nextInt();
					
				
				switch (choice) {
				case 1:
					preparestatement = connection
							.prepareStatement("insert into student (sid, name ,sphone) values (?,?,?)");
					System.out.println("enter sid , name, sphone");
					int sid = scanner.nextInt();
					String name = scanner.next();
					int sphone = scanner.nextInt();

					preparestatement.setInt(1, sid);
					preparestatement.setString(2, name);
					preparestatement.setInt(3, sphone);
					preparestatement.executeUpdate();
					System.out.println("record stored");
					break;

				case 2:

					preparestatement = connection.prepareStatement(" update student set name=? where sid=?");
					System.out.println("enter name and sid ");
					name = scanner.next();
					sid = scanner.nextInt();

					preparestatement.setString(1, name);// <== number indicate query position
					preparestatement.setInt(2, sid);
					preparestatement.executeUpdate();

					System.out.println("record updated");
					break;
				case 3:
					preparestatement = connection.prepareStatement(" delete from student where sid=?");
					System.out.println("enter sid ");

					sid = scanner.nextInt();

					preparestatement.setInt(1, sid);
					preparestatement.executeUpdate();

					System.out.println("record deleted");

				case 4:
					preparestatement = connection.prepareStatement(" select * from student");
					resultset = preparestatement.executeQuery();

					while (resultset.next()) {
						System.out.println(resultset.getInt("sid") + " " + resultset.getString("name") + " "
								+ resultset.getInt("sphone"));
					}

					System.out.println("all record fetched");

					break;
				case 5:
					preparestatement = connection.prepareStatement(" select * from student where sid=?");
					sid = scanner.nextInt();

					preparestatement.setInt(1, sid);

					resultset = preparestatement.executeQuery();
					if (resultset.next()) {
						System.out.println(resultset.getInt("sid") + " " + resultset.getString("name") + " "
								+ resultset.getInt("sphone"));
					} else {
						System.out.println("no record found");
					}
					System.out.println("all record fetched");

					break;

				case 6:
					System.err.print("you exit safely");
					System.exit(0);
					break;

				}
			} while (true);

		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
}
