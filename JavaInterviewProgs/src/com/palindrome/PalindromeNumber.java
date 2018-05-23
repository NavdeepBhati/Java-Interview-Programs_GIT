package com.palindrome;

public class PalindromeNumber {

	static int pal= 1234554321;
	
	
	public static void main(String[] args) {
		
	
		
	
		  int r,sum=0,temp;    

		
		
		 int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){   
			  
		   r=n%10;  //getting remainder  
		   
		   sum=(sum*10)+r;    
		   
		   n=n/10;    
		  }  
		  
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	int[] array=new  int[Integer.toString(pal).length()];
		int j= array.length;
		
		for (int i = 0; i < array.length/2; i++) {
			
			System.out.println(array[i]+"=="+array[j-1]);
			if(array[i]==array[j-1]) {
				continue;
			}
			else
				System.out.println("not palindrome");
				break;
		}
		System.out.println("palindrome");
	}*/
	}
	
	
}
