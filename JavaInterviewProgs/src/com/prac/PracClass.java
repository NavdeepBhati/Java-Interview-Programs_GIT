package com.prac;

import java.util.ArrayList;
import java.util.List;

public class PracClass {
	public static void main(String[] args) {

		// printPrime(10, 99);

		// printFibonaaci();

		
		for (int i = 1; i <= 10; i++) {
			System.out.print(fibonacci2(i) + " ");
		}
	}

	// 1 1 2 3 5 8 13
	private static void printFibonaaci() {

		int b, c, temp;
		c = 0;
		b = 1;

		for (int i = 0; i < 10; i++) {
			c = c + b;
			System.out.println(c);

			temp = c;
			c = b;
			b = temp;
		}

	}

	private static void printPrime(int start, int end) {

		List<Integer> primeList = new ArrayList<>();

		for (int i = start; i <= end; i++) {
			int counter = 0;
			int isprime = i;
			for (int j = 1; j <= Math.sqrt(i); j++) {

				if (isprime % j == 0) {
					counter++;

				}

			}

			if (counter == 1) {
				primeList.add(i);
			}

		}
		System.out.println(primeList);
	}

	private static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci2(number - 1) + fibonacci2(number - 2);

	}




}
