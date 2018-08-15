package com.prac;

public class PracString {

	public static void main(String[] args) {

		permutation("abc");

	}

	private static void permutation(String str) {

		char[] strchar = str.toCharArray();

		int fact = factorial(strchar.length);
		System.out.println(fact);
		
		for (int i = 0; i <fact; i++) {
			
			
			char c = strchar[i];
			
			
			
			
		}

	}

	private static int factorial(int i) {

		if (i == 1)
			return 1;

		else
			return i * factorial(i - 1);

	}

}
