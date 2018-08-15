package com.matrix;

import java.util.Arrays;

public class TransposeMatrix {

	
	
	public static void main(String[] args) {
		
		int rows=3;
		int columns= 3;
		int counter=1;
		
		   int matrix[][] = new int[rows][columns];
		   
           System.out.println("Enter the elements in matrix :");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                     
                	  matrix[i][j] =i+1;
                  }
           }	
           
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                     System.out.print(matrix[i][j] + " ");
               }
               System.out.println();
           }

           
           int temp = rows;
           rows=columns;
           columns=temp;
           
           
           System.out.println("rows  "+rows +" columns  "+columns);
           int trasnposeMatrix[][] = new int[rows][columns];
           
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                  
            	   trasnposeMatrix[i][j] = matrix[j][i];
               }
        }	
           
           
           System.out.println("Transpose Matrix");
           
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                     System.out.print(trasnposeMatrix[i][j] + " ");
               }
               System.out.println();
           }

        
	}
}
