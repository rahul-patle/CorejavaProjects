package Logical;

public class CheckRepeat {

	public static boolean isRepeat(String s) {
		boolean b = false;

//		  char[] a = s.toCharArray();
//		  
//		  for (int i = 0; i < a.length; i++) 
//		  { for (int j = i + 1; j < a.length; j++) 
//		  {
//		  
//		  if (a[i] == a[j]) { System.out.println(a[j]); 
//		  b = true; 
//		  } 
//		  }
//		  } 
//		  return b;
//		 
//		 If in a String more than two character is repeated then it will return two same characters

		for (int index = 0; index < s.length(); index++) {

			char ch = s.charAt(index); // 0=> J
			System.out.println("ch " + ch);
			int firstIndex = s.indexOf(ch); // 0 
			System.out.println("firstIndex " + firstIndex);
			int lastIndex = s.lastIndexOf(ch);// 0 
			System.out.println("lastIndex " + lastIndex);

			if (firstIndex != lastIndex) {
				System.err.println(ch);
				System.out.println("Repeated firstIndex " + firstIndex);
				System.out.println("Repeated lastIndex " + lastIndex);
				b = true;
				// break;
			}

			// If we will add break then it will only check the first char which is
			// repeatedin String.
			// But if we remove break it will print both the characters (A,V) but values
			// will printed double because whole String is iterating. } if
			if (firstIndex == lastIndex) {
				System.err.println(ch);
				System.out.println("Non-Repeated firstIndex " + firstIndex);
				System.out.println("Non-Repeated lastIndex " + lastIndex);
				b = true;
			}
		}
		return b;

	}

	public static void main(String[] args) {

		isRepeat("AZKAZKMWQMZ");
	}
}
