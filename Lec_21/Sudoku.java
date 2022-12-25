package Lec_21;

public class Sudoku {
	public static void main(String[] args) {
		char[][] mat = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		suvle(0, 0, mat);
	}

	public static void disp(char[][] mat) {
		for (char[] row : mat) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void suvle(int r, int c, char[][] mat) {

//		moving logic
		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			disp(mat);
			System.out.println("=============");
			return;
		}

		if (mat[r][c] != '.') {
			suvle(r, c + 1, mat);
		} else {
			for (int d = 1; d <= 9; d++) {
				if (isSafe(mat, r, c, d)) {
					mat[r][c] = (char) ('0' + d);
					suvle(r, c + 1, mat);
					mat[r][c] = '.';
				}
			}
		}

	}

	private static boolean isSafe(char[][] mat, int r, int c, int d) {
		// TODO Auto-generated method stub
		for (int row = 0; row < 9; row++) {
			if (mat[row][c] == '0' + d) {
				return false;
			}
		}
		for (int col = 0; col < 9; col++) {
			if (mat[r][col] == '0' + d) {
				return false;
			}
		}

		int boxr = r / 3;
		int boxc = c / 3;

		for (int rr = boxr * 3; rr < boxr * 3 + 3; rr++) {
			for (int cc = boxc * 3; cc < boxc * 3 + 3; cc++) {
				if (mat[rr][cc] == '0' + d) {
					return false;
				}

			}
		}
		return true;
	}
}
