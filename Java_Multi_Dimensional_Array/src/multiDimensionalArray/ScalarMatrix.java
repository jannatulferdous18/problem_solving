package multiDimensionalArray;

import java.util.Scanner;

public class ScalarMatrix {

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
			System.out.println("Matrix must contain equal size of row and column");
		}

		else {
			Boolean isLower = isLowerTriangular(twoD_arr, row, column);
			Boolean isUpper = isUpperTriangular(twoD_arr, row, column);
			Boolean isSame = isSameValue(twoD_arr, row);
			if (isLower && isUpper && isSame) {
				System.out.println("This is a scaler matrix");
			} else {
				System.out.println("This is not a scaler matrix");
			}
		}
	}

	private static Boolean isSameValue(int[][] twoD_arr, int row) {
		int temp = twoD_arr[0][0];
		for (int i = 0; i < twoD_arr.length; i++) {
			if (temp != twoD_arr[i][i]) {
				return false;
			}
		}
		return true;
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
