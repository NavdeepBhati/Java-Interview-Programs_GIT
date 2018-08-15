package com.matrix;

public class SUmOfBothDiagonal {
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
               
           	if (i==j )  {
           		 System.out.print(matrix[i][j] + " ");
           		sum= sum+matrix[i][j];
				}
           
            }
            System.out.println();
        }
		int k =rows-1;
		for (int i = 0; i < rows; i++) {
           
               
           		 System.out.print(matrix[i][k] + " ");
           		sum= sum+matrix[i][k];
           k--;
            }
            System.out.println();
      
		 System.out.println("sum  " +sum );
	}
	

	private static void initMatrix() {


		rows = 4;
		columns = 4;

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
