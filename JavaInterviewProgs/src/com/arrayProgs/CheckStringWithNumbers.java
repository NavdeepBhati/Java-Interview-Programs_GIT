package com.arrayProgs;

import java.util.regex.Pattern;

public class CheckStringWithNumbers {

	public static void main(String[] args) {
		
		String str="123";
		
		
		System.out.println(str.matches("[0-9]*"));
System.out.println(Pattern.matches("[0-9]*", str));
		
		
		
	}
	
}
