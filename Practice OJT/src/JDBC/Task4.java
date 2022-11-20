package JDBC;

import java.sql.*;

public class Task4 {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt3", "root", "root");

		PreparedStatement pst1 = connection.prepareStatement("select * from ojt3.employees");

		PreparedStatement anal = connection.prepareStatement("insert into ojt3.analytics values (?,?,?,?)");

		PreparedStatement admin = connection.prepareStatement("insert into ojt3.admin values (?,?,?,?)");

		PreparedStatement hr = connection.prepareStatement("insert into ojt3.hr values (?,?,?,?)");

		ResultSet resultset = pst1.executeQuery();

		while (resultset.next()) {
			System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getInt(3) + " "
					+ resultset.getString(4));

			int eid = resultset.getInt("eid");
			String ename = resultset.getString("ename");
			int ephone = resultset.getInt("ephone");
			String tablename = resultset.getString("tablename");

			// analytics table
			if (tablename.equalsIgnoreCase("analytics")) {
				try {
					PreparedStatement prestatement = connection.prepareStatement(
							"create table analytics (eid int,ename varchar(20),ephone int,tablename varchar(20))");

					prestatement.executeUpdate();
				} catch (Exception e) {
					System.out.println("table is already created");
				}
				anal.setInt(1, eid);
				anal.setString(2, ename);
				anal.setInt(3, ephone);
				anal.setString(4, tablename);

				System.out.println("analatics stored");
				anal.executeUpdate();
			} 
			else if (tablename.equalsIgnoreCase("admin")) {
				try {
					PreparedStatement preadmin = connection.prepareStatement(
							"create table admin (eid int,ename varchar(20),ephone int,tablename varchar(20))");
					preadmin.executeUpdate();
				} catch (Exception e) {
					System.out.println("table is already created");
				}
				admin.setInt(1, eid);
				admin.setString(2, ename);
				admin.setInt(3, ephone);
				admin.setString(4, tablename);

				System.out.println("admin stored");
				admin.executeUpdate();
			}

			else {
				try {
					PreparedStatement prestate = connection.prepareStatement(
							"create table hr (eid int,ename varchar(20),ephone int,tablename varchar(20))");
					prestate.executeUpdate();
				} catch (Exception e) {
					System.out.println("table is already created");
				}
				hr.setInt(1, eid);
				hr.setString(2, ename);
				hr.setInt(3, ephone);
				hr.setString(4, tablename);

				System.out.println("hr stored");
				hr.executeUpdate();
			}//else end

		}//loop end

	}//main end

}// class end
