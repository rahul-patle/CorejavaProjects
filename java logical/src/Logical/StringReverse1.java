package com.ankush.Logical;

public class StringReverse1 {

	public static void main(String[] args) {

		String s = "ABK";

		StringBuffer sb = new StringBuffer();

		for (int i = s.length() - 1; i >= 0; i--) {
			System.err.println(i);//2,1,0 itterate in reverse manner
			sb.append(s.charAt(i));
			//append is used for add something
		}
		System.out.println(sb);
	}
}
