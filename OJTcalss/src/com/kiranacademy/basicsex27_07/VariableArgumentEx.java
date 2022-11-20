

package com.kiranacademy.basicsex27_07;
//6//

/* variable argument is denoted by ... and while calling 
 * method with variable argument , we can pass any no of arguments
 * even no arguments also .
 *  */
public class VariableArgumentEx {
	
	static void add(int... a)
	{
	
		int sum=0;             //a [10][20][30]
							   // sum=60
		for(int element : a)
		{
			sum = sum + element;
		}
		
		System.out.println(sum);
		
	}
		
	public static void main(String[] args) {
		
		add();// class name is not required to call static method within class where it is declared
		add(10,20);
		add(10,20,30,40);
	
	}

}
