package JDBC;

import java.sql.*;

public class byprestatement {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt3", "root", "root");

			PreparedStatement pst1 = connection.prepareStatement("select * from ojt3.employees");

			PreparedStatement anal = connection.prepareStatement(
					"create table if not exists analytics (eid int,ename varchar(20),ephone int,tablename varchar(20))");
			anal = connection.prepareStatement("insert into ojt3.analytics values  (?,?,?,?)");

			PreparedStatement admin = connection.prepareStatement(
					"create table if not exists admin (eid int,ename varchar(20),ephoneint,tablename varchar(20))");
			admin = connection.prepareStatement("insert into ojt3.admin values  (?,?,?,?)");

			PreparedStatement hrst = connection.prepareStatement(
					"create table if not exists hr (eid int,ename varchar(20),ephone int,tablename varchar(20))");

			hrst = connection.prepareStatement("insert into ojt3.hr values  (?,?,?,?)");

			ResultSet resultset;
			resultset = pst1.executeQuery();

			while (true) {
				while (resultset.next()) {
					System.out.println(resultset.getInt("eid") + " " + resultset.getString("ename") + " "
							+ resultset.getInt("ephone") + " " + resultset.getString("tablename"));

					int eid = resultset.getInt("eid");
					String ename = resultset.getString("ename");
					int ephone = resultset.getInt("ephone");
					String tablename = resultset.getString("tablename");

					// analytics table
					if (tablename.contains("analytics")) {

						anal.setInt(1, eid);
						anal.setString(2, ename);
						anal.setInt(3, ephone);
						anal.setString(4, tablename);
						anal.executeUpdate();
						System.out.println("analatics stored");

					}

					else if (tablename.contains("admin")) {

						admin.setInt(1, eid);
						admin.setString(2, ename);
						admin.setInt(3, ephone);
						admin.setString(4, tablename);
						admin.executeUpdate();
						System.out.println("admin stored");
					}

					else {
						hrst.setInt(1, eid);
						hrst.setString(2, ename);
						hrst.setInt(3, ephone);
						hrst.setString(4, tablename);

						System.out.println("hr stored");
					}
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
