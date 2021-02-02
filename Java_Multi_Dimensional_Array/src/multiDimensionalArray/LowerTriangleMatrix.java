package multiDimensionalArray;

import java.util.Scanner;

public class LowerTriangleMatrix {

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
			Boolean isLowerTraingular = isLowerTriangular(twoD_arr, row, column);
			if (isLowerTraingular) {
				System.out.println("Matrix is a lower triangular matrix");
			} else {
				System.out.println("Matrix is not a lower triangular matrix");
			}
		}
	}

	private static Boolean isLowerTriangular(int[][] twoD_arr, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < column; j++) {
				if (twoD_arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

}
