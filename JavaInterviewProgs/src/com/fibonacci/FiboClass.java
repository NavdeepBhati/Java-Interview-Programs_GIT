package com.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FiboClass {

	String a = "1 1 2 3 5 8 13";
	static int len = 15;

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		int a = 1, b, c = 0, d = 0;
		for (int i = 0; i < len; i++) {

			b = a;
			a = c;
			c = a + b;

			list.add(c);
		}
		System.out.println ("list  "+list);

		int number = 15;
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacci2(i) + " ");
		}
	}

	private static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci2(number - 1) + fibonacci2(number - 2);
	}

}
