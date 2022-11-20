package JDBC;

import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.*;

public class ByUsingBufferreader {

public static void main(String[] args) throws Exception {
Connection connection = Connectionutilise.conectionutilise();
PreparedStatement preparedStatement;
	
	

	while (true) {
		BufferedReader bufferreader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1.insert");
		int choose =  Integer.parseInt(bufferreader.readLine());
		
		switch (choose) {
		case 1: 
		preparedStatement = connection.prepareStatement("insert into student (sid,name,sphone) values (?,?,?)");
	    System.out.println(" enter sid, name, sphone");
		int sid =	Integer.parseInt(bufferreader.readLine());
		String name =	bufferreader.readLine();
		int sphone =	Integer.parseInt(bufferreader.readLine());
			
		preparedStatement.setInt(1,sid);
		preparedStatement.setString(2,name);
		preparedStatement.setInt(3,sphone);
		preparedStatement.executeUpdate();
		System.out.println("record stored");
		
		}break;
		
	}
	
	
	
	}
}
