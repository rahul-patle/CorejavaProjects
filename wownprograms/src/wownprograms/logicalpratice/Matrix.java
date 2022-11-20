package wownprograms.logicalpratice;

public class Matrix {

	public static void main(String[] args) {

		char matrix[][] = new char[][] {{'A','B','C'}, {'A','B','C'}, {'A','B','C' }};

		int row = matrix.length;
		int columns = matrix[0].length;
		char output[][] = new char[columns][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++)
				output[j][i] = matrix[i][j];
		}

		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < row; j++)
				System.out.print(output[i][j] + " ");
			System.out.println();
		}
	}

}
