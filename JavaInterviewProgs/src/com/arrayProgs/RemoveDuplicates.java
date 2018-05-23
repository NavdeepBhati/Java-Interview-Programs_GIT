package com.arrayProgs;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		
		int[] array= {1,2,5,5,5,2,7,5,7,9,3,9,10,10,10};
		
Arrays.sort(array);
System.out.println(Arrays.toString(array));
StringBuilder str= new StringBuilder();
int[] newArray=new int[array.length];
int counter=0;
for (int i = 0; i < array.length; i++) {
	int a= array[i];
	
			if ((i + 1) < array.length) {
				int b = array[i + 1];

				if (a != b) {
					newArray[counter] = a;
					counter++;

				}
			}
	
	
}
	str.append(array[(array.length-1)]);

		System.out.println(str);
		System.out.println(Arrays.toString(newArray));
	}
}
