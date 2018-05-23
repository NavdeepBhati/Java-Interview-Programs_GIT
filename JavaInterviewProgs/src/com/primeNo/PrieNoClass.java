package com.primeNo;

import java.util.ArrayList;
import java.util.List;

public class PrieNoClass {

	String str="2 3 5 7 11 13 17 ";
	
	
	public static void main(String[] args) {
		int len=100;
		List<Integer> list= new ArrayList<>();

		for (int i = 7; i <len; i++) {
			
			int a=i%2;
			int b=i%3;
			int c=i%5;
			
			if((i*i-1)% 24==0) {
				list.add(i);
			}
			
		}
		
		System.out.println(list);

	}
	
	
}
