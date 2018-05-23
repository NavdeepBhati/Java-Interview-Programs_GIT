package com.palindrome;

public class PalindromeClass {

	static String str="rotator";
	public static void main(String[] args) {
		
		char[] ch= str.toCharArray();
		int j=ch.length;
		
		
		for (int i = 0; i < ch.length/2; i++) {
		
			System.out.println(ch[i]+"  "+ch[j-1]);
			if(ch[i]==ch[j-1]) {
				j--;
			}else {
				System.out.println("not palindrome");
				break;
				}
			System.out.println("palindrome");
		}
	}
	
}
