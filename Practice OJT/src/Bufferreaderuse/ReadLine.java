package Bufferreaderuse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadLine {

public static void main(String[] args) throws IOException {
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
System.out.println("enter name");
String name = buffer.readLine();

System.out.println("enter rollno");
int rollno = Integer.parseInt(buffer.readLine());

System.out.println(name + ""+rollno);

// we are just reading line
	}
}
