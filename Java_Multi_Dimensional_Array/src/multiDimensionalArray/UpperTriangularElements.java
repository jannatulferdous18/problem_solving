package multiDimensionalArray;

import java.util.Scanner;

public class UpperTriangularElements {

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
			findUpTriangularElements(twoD_arr, row, column);
		}
	}

	private static void findUpTriangularElements(int[][] twoD_arr, int row, int column) {
		System.out.println("\nThe elements of upper triangular are:");
		for (int i = 0; i < row - 1; i++) {
			for (int j = i + 1; j < column; j++) {
				System.out.print(twoD_arr[i][j] + "    ");
			}
			System.out.println();
		}
	}

}
