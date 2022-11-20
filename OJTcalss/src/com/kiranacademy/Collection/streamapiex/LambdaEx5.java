package com.kiranacademy.Collection.streamapiex;

public class LambdaEx5  
{
  public static void main(String[] args) {
	
	 char a = new String("JBK").charAt(1);
	 System.out.println(a);
	 
	 
	 new Thread(()->System.out.println("Java is easy")).start();
}
}
