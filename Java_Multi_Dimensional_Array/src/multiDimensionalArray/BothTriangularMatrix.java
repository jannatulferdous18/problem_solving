package multiDimensionalArray;

import java.util.Scanner;

public class BothTriangularMatrix {

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
		int upperTriangular = 0;
		int lowerTriangular = 0;
		if (row != column) {
			System.out.println("Neither Upper nor Lower Triangular Matrix because it is not a Square Matrix.");
		}

		else {
			Boolean isLower = isLowerTriangular(twoD_arr, row, column);
			Boolean isUpper = isUpperTriangular(twoD_arr, row, column);
			if (isUpper && isLower) {
				System.out.println("Lower as well as Upper Triangular Matrix");
			} else if (isLower && !isUpper) {
				System.out.println("Lower Triangular Matrix");
			} else if (isUpper && !isLower) {
				System.out.println("Upper Triangular Matrix");
			} else {
				System.out.println("Neither Upper nor Lower Triangular Matrix");
			}

		}
	}

	private static Boolean isUpperTriangular(int[][] twoD_arr, int row, int column) {
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < i; j++) {
				if (twoD_arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
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
