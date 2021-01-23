package multiDimensionalArray;

import java.util.Scanner;

public class MaxSummationRow {

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
		int sum_arr[] = new int[row];
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < column; j++) {
				sum += twoD_arr[i][j];
			}
			sum_arr[i] = sum;

		}
		int max_sum = sum_arr[0];
		int row_index = 0;
		for (int i = 1; i < sum_arr.length; i++) {
			if (sum_arr[i] > max_sum) {
				max_sum = sum_arr[i];
				row_index = i;
			}
		}

		System.out.println("row " + row_index + " has the largest summation value: " + max_sum);

	}

}
