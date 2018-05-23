package com.arrayProgs;

import java.util.Arrays;

public class KthSmallestLargestNumber {

	public static void main(String[] args) {

		int[] numArray = { 6, 7, 7, 9, 4, 3, 1, 66, 3, 4, 5, 6, 8, 95, 3, 0 ,8,9};
		int k = 4;
		int resSmall = smallestK(numArray, k);
		System.out.println(resSmall);

		int resLarge = LargestK(numArray, k);
		System.out.println(resLarge);
	}

	private static int LargestK(int[] numArray, int k) {

		Arrays.sort(numArray);
		System.out.println(Arrays.toString(numArray));
		int counter = 0;
		int res = 0;
		for (int i = numArray.length - 1; i > 0; i--) {

			int a = numArray[i];
			int b = numArray[i - 1];

			if (a != b) {
				counter++;
				if (k == counter) {
					res = a;
					break;
				}
			}

		}
		return res;

	}

	private static int smallestK(int[] numArray, int k) {
		Arrays.sort(numArray);
		System.out.println(Arrays.toString(numArray));
		int counter = 0;
		int res = 0;
		for (int i = 0; i < numArray.length; i++) {

			int a = numArray[i];

			if ((i + 1) < numArray.length) {
				int b = numArray[i + 1];

				if (a != b) {
					counter++;
					if (k == counter) {
						res = a;
					break;
					}
				}
			}
		}
		return res;
	}

}
