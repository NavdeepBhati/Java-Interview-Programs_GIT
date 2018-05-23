package com.arrayProgs;

public class LargestSmallestNo {

	
	public static void main(String[] args) {
		
		int[] array= {3,7,9,1,44,5,7,-3,3};
		
		int large=array[0];
		int small= array[0];
		for (int i : array) {
			
			if(i>large) {
				
				large=i;
			}
			if(i<small){
				
				small=i;
				
			}
			
		}
		System.out.println("large  "+large+"   small   "+small);

		
		
	}
	
}

