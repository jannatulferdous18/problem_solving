package multiDimensionalArray;

import java.util.Scanner;

public class MagicSquare {

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
			System.out.println("As the matrix not square, so it can't be magic square");
		} else {
			Boolean magicSquare = isMagicSquare(twoD_arr, row, column);
			if (magicSquare) {
				System.out.println("Magic square");
			} else {
				System.out.println("Not a magic square");
			}
		}

	}

	private static Boolean isMagicSquare(int[][] twoD_arr, int row, int column) {
		// summation of principle diagonal
		int sumPrincipleDiagonal = 0;
		for (int i = 0; i < twoD_arr.length; i++) {
			sumPrincipleDiagonal += twoD_arr[i][i];
		}

		// summation of secondary diagonal
		int sumSecondaryDiagonal = 0;
		for (int i = 0; i < row; i++) {
			sumSecondaryDiagonal += twoD_arr[i][row - i - 1];
		}
		if (sumPrincipleDiagonal != sumSecondaryDiagonal) {
			return false;
		}
		// summation of each row
		int sum_row[] = new int[row];
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < column; j++) {
				sum += twoD_arr[i][j];
			}
			sum_row[i] = sum;
		}

		Boolean sumRow = hasSameSummationRow(sum_row);
		if (sumRow) {
			if (sum_row[0] != sumPrincipleDiagonal) {
				return false;
			}
		}

		// summation of each column
		int sum_column[] = new int[column];
		for (int i = 0; i < column; i++) {
			int sum = 0;
			for (int j = 0; j < row; j++) {
				sum += twoD_arr[j][i];
			}
			sum_column[i] = sum;
		}
		Boolean sumColumn = hasSameSummationColumn(sum_column);
		if (sumColumn) {
			if (sum_column[0] != sumPrincipleDiagonal) {
				return false;
			}
		}
		return true;
	}

	private static Boolean hasSameSummationColumn(int[] sum_column) {
		for (int i = 0; i < sum_column.length; i++) {
			for (int j = i; j < sum_column.length; j++) {
				if (sum_column[i] != sum_column[j]) {
					return false;
				}
			}
		}
		return true;
	}

	private static Boolean hasSameSummationRow(int[] sum_row) {
		for (int i = 0; i < sum_row.length; i++) {
			for (int j = i; j < sum_row.length; j++) {
				if (sum_row[i] != sum_row[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
