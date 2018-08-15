package com.palindrome;

public class PalindromeClass {

	static String str = "mahwam";

	public static void main(String[] args) {
		char[] ch = str.toCharArray();
		
		
		if (isPalindromeUsingRecursion(ch,0,str.length()-1)) {
			
			System.out.println("Is palindrome");
			
		}else
			System.out.println("not plaindrome");
		
		//palindromeLoop();
	}

	public static boolean isPalindromeUsingRecursion(char[] ch , int i, int j) {
		
		if (i==(ch.length/2)) {
			
			return true;
		}
		
		
		System.out.println(ch[i] + "  " + ch[j]);
		if (ch[i] == ch[j]) {
			j--;
			i++;
			return	isPalindromeUsingRecursion(ch,i,j);
		} else {
			return false;
		}
		
	
		
		
	}
	
	/*public static boolean isPalindromeUsingRecursion(String inputString) {
		if (inputString.length() == 0 || inputString.length() == 1) {
			return true;
		}
		if (inputString.charAt(0) == inputString.charAt(inputString.length() - 1)) {
			
			System.out.println(inputString.substring(1, inputString.length() - 1));
			return isPalindromeUsingRecursion(inputString.substring(1, inputString.length() - 1));
		}

		return false;
	}*/

	private static void palindromeLoop() {
		char[] ch = str.toCharArray();
		int j = ch.length;

		for (int i = 0; i < ch.length / 2; i++) {

			System.out.println(ch[i] + "  " + ch[j - 1]);
			if (ch[i] == ch[j - 1]) {
				j--;
			} else {
				System.out.println("not palindrome");
				break;
			}
			System.out.println("palindrome");
		}
	}

}
