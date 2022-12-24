package Lec_21;

public class N_Queens_2D {
	public static void main(String[] args) {
		suvle(0, 0, 2, 2, 2, "");
	}

	public static void suvle(int r, int c, int total_r, int total_c, int QTP, String path, boolean[][] Visted) {
		if (QTP == 0) {
			System.out.println(path);
			return;
		}

//		moving logic!!
		if (c == total_c) {
			r++;
			c = 0;
		}

//		-ve BC
		if (r == total_r) {
			return;
		}
		if (isSafe(Visted, r, c)) {
			Visted[r][c] = true;
			suvle(r, c + 1, total_r, total_c, QTP - 1, path + "Q{" + r + "," + c + "}", Visted); // include
			Visted[r][c] = false;
		}
		suvle(r, c + 1, total_r, total_c, QTP, path, Visted); // exclude

	}
}
