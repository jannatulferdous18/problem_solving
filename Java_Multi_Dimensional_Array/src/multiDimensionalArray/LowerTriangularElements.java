package multiDimensionalArray;

import java.util.Scanner;

public class LowerTriangularElements {

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
			System.out.println("Matrix should be a Square Matrix to preoceed");
		} else {
			findLowerTriangularElements(twoD_arr, row, column);
		}
	}

	private static void findLowerTriangularElements(int[][] twoD_arr, int row, int column) {
		System.out.println("\nThe elements of lower triangular are:");
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(twoD_arr[i][j] + "    ");
			}
			System.out.println();
		}

	}
}
