package com.kiranacademy.LoadmethodHibernate.customexception;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.kiranacademy.Aug_8JDBC_EX.ConnectionUtility;

/* interface is used for abstraction purpose
 * abstraction means exposing required things only and hiding implementation.
 *  */
public class TestJDBC {
	// Programmer
	// Hibernate API
	// load(int eid)
	// Object load(Class c, Serilizable s)
	// Object load(Student.class,101)

	static Employee load(int eid) throws Exception {
		int a = 0;
		Employee employee = null;

		Connection connection = ConnectionUtility.getConnection();

		Statement statement = connection.createStatement();// 1 sachin 100000
															// ResultSet object

		ResultSet resultSet = statement.executeQuery("select * from employee where eid=" + eid);

		if (resultSet.next()) {

			employee = new Employee(resultSet.getInt("eid"), resultSet.getString("ename"), resultSet.getInt("salary"));
		} else {
			throw new ObjectNotFoundException(eid + " is NOT present in database table ");
		}

		return employee;// [msg=101 is not present in database table] ObjectNotFoundException class
						// object
	}

	static void show(String s) {

		if (s != null)
			System.out.println(s.length());
		else
			throw new NullPointerException("Please pass String class object");
	}

	public static void main(String[] args) {

		try {
			Employee employee = load(101); // employee ==> [eid=1 ename=sachin salary=100000] Employee class object

			System.out.println(employee);

			System.out.println(load(2));
		} catch (ObjectNotFoundException e) {
			System.out.println(e.msg);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("All is well");
//			
//		try
//		{
//			show(null);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
	}
}
