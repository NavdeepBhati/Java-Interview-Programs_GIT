package com.useOfCollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectonsClass {

	
	public static void main(String[] args) {
		
		 
		 
		 List<String> list = new ArrayList<>();
		
		
		list.add("A");		
		list.add("B");		
		list.add("X");		
		list.add("C");		
		list.add("C");		
		list.add("D");		
		list.add("C");		
		List unmodifyList=Collections.unmodifiableList(list);
		frequency(list);
		
		String s1= new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
	}
	
	
	
	private static void frequency(List<String> list) {
		
		int freq=Collections.frequency(list, "C");
		System.out.println(freq);
		
		String minStr=Collections.min(list);
		System.out.println(minStr);
		
		String maxStr=Collections.max(list);
		System.out.println(maxStr);
		
		
		
		
		list.add("dsd");
	}
	
}
