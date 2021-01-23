package multiDimensionalArray;

import java.util.Scanner;

public class MinimumValueEachColumn {

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
		for (int i = 0; i < column; i++) {
			int min = twoD_arr[0][i];
			for (int j = 1; j < row; j++) {
				if (twoD_arr[j][i] < min) {
					min = twoD_arr[j][i];
				}
			}
			System.out.println("Minimum value of column" + i + " is " + min);
		}
	}

}
