package multiDimensionalArray;

import java.util.Scanner;

public class DuplicateInColumns {

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
		findDuplicateEachColumn(twoD_arr, row, column);

	}

	private static void findDuplicateEachColumn(int[][] twoD_arr, int row, int column) {
		for (int j = 0; j < column; j++) {
			for (int i = 0; i < row; i++) {
				int temp = twoD_arr[i][j];
				for (int k = i + 1; k < row; k++) {
					if (twoD_arr[k][j] == temp) {
						twoD_arr[k][j] = 0;
					}
				}
			}
		}

		System.out.println("After replacing duplicates in each column by zero: ");
		for (int i = 0; i < twoD_arr.length; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(twoD_arr[i][j] + "    ");
			}
			System.out.println();
		}

	}
}