package com.matrix;

public class DIsplayFormat {
	static int rows;
	static int columns;

	static int matrix[][];

	public static void main(String[] args) {

		initMatrix();
		
	}
	
	private static void initMatrix() {


		rows = 3;
		columns = 3;

		matrix = new int[rows][columns];
		int counter = 1;

		System.out.println("Enter the elements in matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				matrix[i][j] = i+1;
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
