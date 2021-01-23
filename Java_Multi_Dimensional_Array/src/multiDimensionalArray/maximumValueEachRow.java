package multiDimensionalArray;

import java.util.Scanner;

public class maximumValueEachRow {
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
		for (int i = 0; i < row; i++) {
			int max = twoD_arr[i][0];
			for (int j = 1; j < column; j++) {
				if (twoD_arr[i][j] > max) {
					max = twoD_arr[i][j];
				}
			}
			System.out.println("Maximum value of row" + i + " is " + max);
		}
	}
}
