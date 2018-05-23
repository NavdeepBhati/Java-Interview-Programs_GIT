package com.arrayProgs;

import java.util.BitSet;
import java.util.LinkedList;

public class MissingNoClass {

	static int[] array= {1,2,3,5,6,8,9,10};
	
	public static void main(String[] args) {
	int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
		}
		int actualsum=(10*(10+1))/2;
		int diff= actualsum-sum;
		System.out.println(diff);

	
	LinkedList<Integer> MyList= new LinkedList<>();
	
	
		MyList.add(1);
	    MyList.add(2);
	    MyList.add(3);
	    MyList.add(4);

	    
	   // System.out.println(MyList.get(3));
	
	BitSet b= new BitSet();
	}	
}


