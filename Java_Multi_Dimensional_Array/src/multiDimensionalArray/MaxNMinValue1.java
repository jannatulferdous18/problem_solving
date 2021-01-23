package multiDimensionalArray;

import java.util.Scanner;

public class MaxNMinValue1 {

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
		// one way to print the matrix
		System.out.println("Matrix you entered:");
		/*
		 * for (int[] x : twoD_arr) { for (int y : x) { System.out.print(y +
		 * "        "); } System.out.println(); }
		 */
		// second way to print the matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(twoD_arr[i][j] + "    ");
			}
			System.out.println();
		}

		int max = twoD_arr[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (twoD_arr[i][j] > max) {
					max = twoD_arr[i][j];
				}
			}
		}
		System.out.println("Maximum value is: " + max);

		int min = twoD_arr[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (twoD_arr[i][j] < min) {
					max = twoD_arr[i][j];
				}
			}
		}
		System.out.println("Minimum value is: " + min);
	}

}
