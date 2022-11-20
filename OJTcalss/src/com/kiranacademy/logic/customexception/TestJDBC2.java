package com.kiranacademy.logic.customexception;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.kiranacademy.ExceptionHandling.Parallelprograming.ConnectionUtility;

import java.sql.ResultSetMetaData;
/* define a method which accepts id of database record and gives us object of corresponding class . 
 * 
   Object load(Class c , int idValue) 
   
   Object load(Student.class,1) , it would give us Student object having details of database record of rno 1.
*/

public class TestJDBC2<T> {
	// Hibernate API
	// Object load(Class c, int id)
	// Object load(Student.class,101)

	Object load(Class<T> c, int idValue) throws Exception {

		Connection connection = ConnectionUtility.getConnection();

		Statement statement = connection.createStatement();// 1 sachin 100000
															// ResultSet object

		Field[] fields = c.getFields();

		String idColumnName = "";

		for (Field field : fields) {
			System.out.println(field.getName());

			if (field.isAnnotationPresent(Id.class)) {
				idColumnName = field.getName();
				System.out.println("Id is " + field.getName());
			}
		}
		String tablename = c.getName().split("\\.")[1];

		System.out.println(tablename);

		String query = "select * from " + tablename + " where " + idColumnName + "=" + idValue;
		System.out.println(query);

		T o = (T) c.getConstructor().newInstance();// It will create object using default constructor
		System.out.println(o);

		ResultSet resultSet = statement.executeQuery(query);

		ResultSetMetaData rsmd = resultSet.getMetaData();

		if (resultSet.next()) {
			int noOfColumns = rsmd.getColumnCount();

			System.out.println(noOfColumns);

			for (int i = 1; i <= noOfColumns; i++) {
				System.out.print(resultSet.getString(i) + " ");

				String columnType = rsmd.getColumnTypeName(i);

				System.out.print(columnType + " ");

				String name = rsmd.getColumnName(i);
				StringBuffer sb = new StringBuffer(name);
				sb.setCharAt(0, (char) (name.charAt(0) - 32));
				name = sb.toString();

				if (columnType.equals("INT")) {
					Method method = o.getClass().getDeclaredMethod("set" + name, int.class);
					method.invoke(o, resultSet.getInt(i));
				}

				if (columnType.equals("VARCHAR")) {

					Method method = o.getClass().getDeclaredMethod("set" + name, String.class);
					method.invoke(o, resultSet.getString(i));
				}
			}

			// System.out.println(o);
		}

		else {
			throw new ObjectNotFoundException("record not found in database with id " + idValue);
		}

		return o;

	}

	public static void main(String[] args) throws Exception {

		TestJDBC2<Employee> obj1 = new TestJDBC2<Employee>();

		try {
			Employee s = (Employee) obj1.load(Employee.class, 1);
			;
			System.out.println(s);
		}

		catch (ObjectNotFoundException o) {
			System.out.println(o.msg);
		}

		System.out.println("===============================");

		TestJDBC2<Student> obj2 = new TestJDBC2<Student>();

		try {
			Student s = (Student) obj2.load(Student.class, 101);
			;
			System.out.println(s);
		} catch (ObjectNotFoundException o) {
			System.out.println(o.msg);
		}

	}
}
