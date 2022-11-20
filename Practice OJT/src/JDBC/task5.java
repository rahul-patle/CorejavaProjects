package JDBC;

import java.sql.*;

public class task5 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt3", "root", "root");
		PreparedStatement preselect = connection.prepareStatement("select * from ojt3.fruits");
		PreparedStatement preparweak = connection.prepareStatement("insert into ojt3.weaktab values (?,?,?)");
		PreparedStatement prepargood = connection.prepareStatement("insert into ojt3.goodtab values (?,?,?)");
		ResultSet resultset = preselect.executeQuery(); // <== use to fetch the data froom resultset

		while (resultset.next()) {

			int fno = resultset.getInt("fno");
			String fname = resultset.getString("fname");
			String quality = resultset.getString("quality");

			if (quality.contains("good")) {

				try {
					PreparedStatement pre = connection
							.prepareStatement("create table goodtab( fno int,fname varchar(20),quality varchar(20))");
					pre.executeUpdate();
				} catch (Exception e) {
					System.out.println("table present already");
				}
				prepargood.setInt(1, fno);
				prepargood.setString(2, fname);
				prepargood.setString(3, quality);

				prepargood.executeUpdate();
				System.out.println("goodtab stored");

			} else {

				try {
					PreparedStatement preweak = connection
							.prepareStatement("create table weaktab( fno int,fname varchar(20),quality varchar(20))");
					preweak.executeUpdate();
				} catch (Exception e) {
					System.out.println("table present already");
				}
				preparweak.setInt(1, fno);
				preparweak.setString(2, fname);
				preparweak.setString(3, quality);

				preparweak.executeUpdate(); // <== needfull in else block

				System.out.println("weak stored");

			}

		}

	}
}
