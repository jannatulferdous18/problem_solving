package multiDimensionalArray;

import java.util.Scanner;

public class ReplaceDuplicateWithMaxValue {
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
		int max = twoD_arr[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (twoD_arr[i][j] > max) {
					max = twoD_arr[i][j];
				}
			}
		}
		findDup(twoD_arr, max, row, column);
	}

	private static void findDup(int[][] twoD_arr, int max, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int n = twoD_arr[i][j];
				for (int k = 0; k < row; k++) {
					for (int l = 0; l < column; l++) {
						if ((k != i || l != j) && twoD_arr[k][l] == n) {
							twoD_arr[k][l] = max;
						}
					}
				}
			}
		}
		System.out.println("\nMatrix after replacing the dulpicate values with the maximum value:\n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(twoD_arr[i][j] + "    ");
			}
			System.out.println();
		}

	}
}