package multiDimensionalArray;

import java.util.Scanner;

public class MaxSummationDiagonal {

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
		int sum_principalDiagonal = 0;
		System.out.print("Main/ Principal/ Leading Diagonal: ");
		for (int i = 0; i < twoD_arr.length; i++) {
			int main_diagonal = twoD_arr[i][i];
			sum_principalDiagonal += main_diagonal;
			System.out.print(main_diagonal + " ");
		}
		System.out.println("\n Summation of main diagonal is " + sum_principalDiagonal);
		int sum_secondaryDiagonal = 0;
		System.out.print("Secondary/ Anti/ Counter Diagonal: ");
		for (int i = 0; i < row; i++) {
			int seconday_diagonal = twoD_arr[i][row - i - 1];
			sum_secondaryDiagonal += seconday_diagonal;
			System.out.print(seconday_diagonal + " ");
		}
		System.out.println("\n Summation of secondary diagonal is " + sum_secondaryDiagonal);

		findMaxSummation(sum_principalDiagonal, sum_secondaryDiagonal);
	}

	private static void findMaxSummation(int sum_principalDiagonal, int sum_secondaryDiagonal) {
		if (sum_principalDiagonal > sum_secondaryDiagonal) {
			System.out.println("Main diagonal has maximum summation which is " + sum_principalDiagonal);
		} else if (sum_principalDiagonal == sum_secondaryDiagonal) {
			System.out.println("Both diagonal have same summation of their elements");
		} else {
			System.out.println("Secondary diagonal has maximum summation which is " + sum_secondaryDiagonal);
		}

	}

}
