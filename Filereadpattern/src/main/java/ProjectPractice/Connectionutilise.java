package ProjectPractice;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class Connectionutilise {

	public static Connection conectionutilise() throws Exception {

		Properties properties = new Properties();
// loading conection.properties file(loose coupling doing here)
		properties.load(new FileInputStream("connectionfile.properties"));

		Class.forName(properties.getProperty("driver-class"));

//gives the driver class object connected to properties file
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("username"), properties.getProperty("password"));
// get connection gives the connection object which will give the
// createstatement and preparestatement method
		return connection;

	}

}
