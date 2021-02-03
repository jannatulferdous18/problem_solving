package multiDimensionalArray;

import java.util.Scanner;

public class MatrixToDiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number:");
		int row = sc.nextInt();
		System.out.println("Enter the coloumn number:");
		int column = sc.nextInt();
		int twoD_arr[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				twoD_arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("The matrix you entered: \n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(twoD_arr[i][j] + "    ");
			}
			System.out.println();
		}
		if (row != column) {
			System.out.println("Matrix must contain equal size of row and column to proceed");
		}

		else {
			int[][] convertedMatrix = changeBothTriangular(twoD_arr, row, column);
			System.out.println("The matrix converted to diagonal matrix: ");
			for (int i = 0; i < convertedMatrix.length; i++) {
				for (int j = 0; j < convertedMatrix.length; j++) {
					System.out.print(convertedMatrix[i][j] + "    ");
				}
				System.out.println();
			}
		}
	}

	private static int[][] changeBothTriangular(int[][] twoD_arr, int row, int column) {
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < i; j++) {
				twoD_arr[i][j] = 0;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < column; j++) {
				twoD_arr[i][j] = 0;

			}
		}
		return twoD_arr;
	}
}
