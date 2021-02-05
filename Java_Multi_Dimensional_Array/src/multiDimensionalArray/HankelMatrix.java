package multiDimensionalArray;

import java.util.Scanner;

public class HankelMatrix {

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
			Boolean isHankel = skewDiagonalElements(twoD_arr, row, column);
			if (isHankel) {
				System.out.println("The square matrix is a Hankel Matrix");
			} else {
				System.out.println("The square matrix is not a Hankel Matrix");
			}
		}
	}

	private static Boolean skewDiagonalElements(int[][] twoD_arr, int row, int column) {
		int temp;
		for (int k = 0; k < row; k++) {
			int count = 0;
			int i = k;
			int j = 0;
			temp = twoD_arr[i][j];
			while (i >= 0) {
				if (count > 0) {
					if (temp != twoD_arr[i][j]) {
						return false;
					}
				}
				i--;
				j++;
				count++;

			}
		}
		for (int k = 1; k < row; k++) {
			int count = 0;
			int i = row - 1;
			int j = k;
			temp = twoD_arr[i][j];
			while (j < row) {
				if (count > 0) {
					if (temp != twoD_arr[i][j]) {
						return false;
					}
				}
				i--;
				j++;
				count++;
			}
		}
		return true;
	}
}
