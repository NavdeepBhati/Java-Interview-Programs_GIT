package com.arrayProgs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesClass {

	
	public static void main(String[] args) {
		
		String str="hello";
	System.out.println(reverseRecursively(str));
		 Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
	        
	        for (char c : str.toCharArray()) {
	            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
	        }
	        System.out.println(counts);
	        for (Entry<Character,Integer> entry : counts.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.println(entry.getKey() +"   "+entry.getValue()); 
	            }
	        }
	    }
	
	
	 public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
		 System.out.println(str);
	        if (str.length() < 2) {
	            return str;
	        }
	        
	        String x=reverseRecursively(str.substring(1)) + str.charAt(0);
	        System.out.println(x);
	        return x;

	    }
	}
	
	
	
/*	public static void main(String[] args) {
		
	StringBuilder str= new StringBuilder("aaabbnkcnihcienicjuuuuiiiiiddddwmlwjdowd");
	getFirstNonRepeatedChar(str.toString());
	
	char[] chr= str.toString().toCharArray();
	String st= str.toString();

	
	for (int i = 0; i < chr.length; i++) {
		char c = chr[i];
		
		String strc=String.valueOf(c);
		int lenb=st.length();
		st=	st.replace(strc, "");
		int lenA=st.length();
		
		System.out.println("Char=  "+ strc +" Count=  "+(lenb-lenA));
		
	}
	
	}
	

	public static char getFirstNonRepeatedChar(String str) {
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        
        for (Entry<Character,Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }
*/


