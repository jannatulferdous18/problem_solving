package multiDimensionalArray;

import java.util.Scanner;

/* Square matrix contains elements from 1 to N
 * Size of row and column is equal to N -> Array[N][N]
 * No duplicates in any row
 * No duplicates in any column
 */

public class LatinSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int nrElements = sc.nextInt();
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
		Boolean hasEqualSizeRowColumn = checksizeRowColumn(row, column, nrElements);
		Boolean hasValidElements = isValidElements(twoD_arr, nrElements);
		Boolean hasDuplicateEachRows = findDuplicateEachRow(twoD_arr);
		Boolean hasDuplicateEachColumn = findDuplicateEachColumn(twoD_arr);
		Boolean isLatinSquare = isLatinSquare(hasEqualSizeRowColumn, hasValidElements, hasDuplicateEachRows,
				hasDuplicateEachColumn);
		if (isLatinSquare) {
			System.out.println("Given square matrix is a latin matrix");
		} else {
			System.out.println("Given square matrix is not a latin matrix");
		}
	}

	private static Boolean isLatinSquare(Boolean hasEqualSizeRowColumn, Boolean hasValidElements,
			Boolean hasDuplicateEachRows, Boolean hasDuplicateEachColumn) {
		return ((hasEqualSizeRowColumn && hasValidElements && hasDuplicateEachRows && hasDuplicateEachColumn) ? true
				: false);
	}

	private static Boolean checksizeRowColumn(int row, int column, int nrElements) {
		return ((row != nrElements || column != nrElements) ? false : true);
	}

	private static Boolean isValidElements(int[][] twoD_arr, int nrElements) {
		for (int i = 0; i < twoD_arr.length; i++) {
			for (int j = 0; j < twoD_arr.length; j++) {
				if (twoD_arr[i][j] > nrElements || twoD_arr[i][j] <= 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static Boolean findDuplicateEachRow(int[][] twoD_arr) {
		for (int i = 0; i < twoD_arr.length; i++) {
			for (int j = 0; j < twoD_arr.length; j++) {
				int temp = twoD_arr[i][j];
				for (int k = j + 1; k < twoD_arr.length; k++) {
					if (twoD_arr[i][k] == temp) {
						return false;
					}

				}
			}
		}
		return true;
	}

	private static Boolean findDuplicateEachColumn(int[][] twoD_arr) {
		for (int j = 0; j < twoD_arr.length; j++) {
			for (int i = 0; i < twoD_arr.length; i++) {
				int temp = twoD_arr[i][j];
				for (int k = i + 1; k < twoD_arr.length; k++) {
					if (twoD_arr[k][j] == temp) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
