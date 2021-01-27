package multiDimensionalArray;

import java.util.Scanner;

public class UpperTriangleMatrix {

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
		int flag = 0;
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < i; j++) {
				if (twoD_arr[i][j] == 0) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
			}
		}
		if (flag == 1) {
			System.out.println("\nUpper Triangular Matrix");
		} else {
			System.out.println("\nNot Triangular Matrix");

		}
	}

}
