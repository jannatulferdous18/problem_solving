package multiDimensionalArray;

import java.util.Scanner;

public class IdentityMatrix {

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
		Boolean isSquareMatrix = isSquareMatrix(row, column);
		Boolean principleDiagonalValue = checkPrincipleDiagonal(twoD_arr, row, column);
		Boolean isLowerTri = isLowerTriangular(twoD_arr, row, column);
		Boolean isUpperTri = isUpperTriangular(twoD_arr, row, column);
		Boolean isRestValuesZeros = checkRestElements(isLowerTri, isUpperTri);
		isIdentityMatrix(isSquareMatrix, principleDiagonalValue, isRestValuesZeros);
	}

	private static Boolean isSquareMatrix(int row, int column) {
		return (row == column ? true : false);
	}

	private static Boolean checkPrincipleDiagonal(int[][] twoD_arr, int row, int column) {
		int flag = 0;
		for (int i = 0; i < twoD_arr.length; i++) {
			if (twoD_arr[i][i] == 1) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}
		}
		return (flag == 1 ? true : false);
	}

	private static Boolean isUpperTriangular(int[][] twoD_arr, int row, int column) {
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < i; j++) {
				if (twoD_arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static Boolean isLowerTriangular(int[][] twoD_arr, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < column; j++) {
				if (twoD_arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static Boolean checkRestElements(Boolean isLowerTri, Boolean isUpperTri) {
		return ((isLowerTri && isUpperTri) ? true : false);
	}

	private static void isIdentityMatrix(Boolean isSquareMatrix, Boolean principleDiagonalValue,
			Boolean isRestValuesZeros) {
		if (isSquareMatrix && principleDiagonalValue && isRestValuesZeros) {
			System.out.println("This is a Identity Matrix");
		} else {
			System.out.println("Not a Identity Matrix");
		}
	}
}
