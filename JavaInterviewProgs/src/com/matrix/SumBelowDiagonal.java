package com.matrix;

public class SumBelowDiagonal {

	
	static int rows;
	static int columns;

	static int matrix[][];

	public static void main(String[] args) {

		initMatrix();
		findSum();
	}

	private static void findSum() {
		int sum=0;
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               
           	if (i!=j && i>j)  {
           		 System.out.print(matrix[i][j] + " ");
           		sum= sum+matrix[i][j];
				}
           
            }
            System.out.println();
        }
		 
		 System.out.println("sum  " +sum );
	
	}

	private static void initMatrix() {


		rows = 2;
		columns = 2;

		matrix = new int[rows][columns];
		int counter = 1;

		System.out.println("Enter the elements in matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				matrix[i][j] = counter++;
			}
		}
		
		 for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                   System.out.print(matrix[i][j] + "   ");
             }
             System.out.println();
         }
		 System.out.println();
	
		
	}
}
