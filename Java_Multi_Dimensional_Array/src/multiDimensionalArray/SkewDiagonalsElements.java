package multiDimensionalArray;

import java.util.Scanner;

/* Given square array -> {{1,2,3},{4,5,6},{7,8,9}}
 * R2L -> {{1},{2,4,}{3,5,7},{6,8},{9}}
 * L2R -> {{1},{4,2}{7,5,3},{8,6},{9}}
*/

public class SkewDiagonalsElements {

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
			printSkewElementsL2R(twoD_arr, row, column);
			printSkewElementsR2L(twoD_arr, row, column);
		}
	}

	private static void printSkewElementsR2L(int[][] twoD_arr, int row, int column) {
		System.out.println("The elements in skew diagonal from right to left: ");
		for (int k = 0; k < row; k++) {
			int i = 0;
			int j = k;
			while (j >= 0) {
				System.out.print(twoD_arr[i][j] + "    ");
				i++;
				j--;
			}
			System.out.println();
		}
		for (int k = 1; k < row; k++) {
			int i = k;
			int j = row - 1;
			while (j > 0 && i < row) {
				System.out.print(twoD_arr[i][j] + "    ");
				i++;
				j--;
			}
			System.out.println();
		}
	}

	private static void printSkewElementsL2R(int[][] twoD_arr, int row, int column) {
		System.out.println("The elements in skew diagonal from left to right: ");
		for (int k = 0; k < row; k++) {
			int i = k;
			int j = 0;
			while (i >= 0) {
				System.out.print(twoD_arr[i][j] + "    ");
				i--;
				j++;
			}
			System.out.println();
		}

		for (int k = 1; k < row; k++) {
			int i = row - 1;
			int j = k;
			while (j < row) {
				System.out.print(twoD_arr[i][j] + "    ");
				i--;
				j++;
			}
			System.out.println();
		}
	}

}
