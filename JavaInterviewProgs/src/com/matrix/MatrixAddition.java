package com.matrix;

public class MatrixAddition {

	
	static int rows;
	static int columns;

	static int matrix1[][];
	static int matrix2[][];
	static int matrixRes[][];

	public static void main(String[] args) {

		initMatrix();
		findSum();
	}

	private static void findSum() {
		matrixRes = new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				matrixRes[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		 for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                   System.out.print(matrixRes[i][j] + "   ");
             }
             System.out.println();
         }
		 System.out.println();
	
		
	}

	private static void initMatrix() {

		rows = 3;
		columns = 3;

		matrix1 = new int[rows][columns];
		int counter = 1;

		System.out.println("Enter the elements in matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				matrix1[i][j] = counter++;
			}
		}
		
		matrix2 = new int[rows][columns];
	 counter = 1;

		System.out.println("Enter the elements in matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				matrix2[i][j] = counter++;
			}
		}
		
		 for (int i = 0; i < rows; i++) {
             for (int j = 0; j < columns; j++) {
                   System.out.print(matrix1[i][j] + "   ");
             }
             System.out.println();
         }
		 System.out.println();
	
		
	}
}
