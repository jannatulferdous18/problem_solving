package multiDimensionalArray;

/*Check if each row of the board[][] array stores only unique values from the range [1, 9] or not.
Check if each column of the board[][] array stores unique values from the range [1, 9] or not.
Check if all possible 3 × 3 submatrices of the board[][] array stores unique values from the range [1, 9] or not.*/

public class Sudoku {
	public static Boolean checkSudoku(int[][] sudoko_matrix) {
		if (!hasValidNumber(sudoko_matrix)) {
			return false;

		} else {
			if (hasDuplicateInRow(sudoko_matrix) && hasDuplicateInColumn(sudoko_matrix)) {
				return true;
			}
		}
		return false;
	}

	private static Boolean hasDuplicateInRow(int[][] twoD_arr) {
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

	private static Boolean hasDuplicateInColumn(int[][] twoD_arr) {
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

	private static Boolean hasValidNumber(int[][] sudoko_matrix) {
		for (int i = 0; i < sudoko_matrix.length; i++) {
			for (int j = 0; j < sudoko_matrix.length; j++) {
				if (sudoko_matrix[i][j] <= 0 || sudoko_matrix[i][j] > 9) {
					return false;
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {

		int sudoko_matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < sudoko_matrix.length; i++) {
			for (int j = 0; j < sudoko_matrix.length; j++) {
				System.out.print(sudoko_matrix[i][j] + "   ");
			}
			System.out.println();
		}
		if (!checkSudoku(sudoko_matrix)) {
			System.out.println("Sudoku is not valid");
		} else {
			System.out.println("Sudoku is valid");
		}
	}
}