package com.factorial;

public class FactorialClass {
static int a=5;
	
	public static void main(String[] args) {
		
	int result=	recursive(a);
	System.out.println(result);	
	
/*		int res=1;
		
		for (int i = 1; i <= a; i++) {

			res=res*i;
			System.out.println(res);
		}
		
		System.out.println(res);*/
	}

	private static int recursive(int a) {
		System.out.println("a=  "+a);

		if(a==0) {
			
			return 1;		
		}
		int x=a*recursive(a-1);
		System.out.println("x-->"+x);
		return x;
	}
	

	
}
