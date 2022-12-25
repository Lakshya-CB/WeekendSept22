package Lec_21;

public class N_Queens_2D {
	public static void main(String[] args) {
		int QTP = 3;
		int size = 3;
		suvle(0, 0, size, size, QTP, "", new boolean[size][size]);
	}

	public static void print(boolean[][] mat) {
		for(boolean[] row : mat) {
			for(boolean b : row) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
	}

	public static void suvle(int r, int c, int total_r, int total_c, int QTP, String path, boolean[][] Visted) {
		if (QTP == 0) {
			System.out.println(path);
			print(Visted);

			System.out.println("====================");
			System.out.println("====================");
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

	public static boolean isSafe(boolean[][] visted, int r, int c) {
		// TODO Auto-generated method stub
		for(int row = r-1;row >=0;row--) {
			if(visted[row][c]) {
				return false;
			}
		}
		
		for(int col = c-1;col >=0;col--) {
			if(visted[r][col]) {
				return false;
			}
		}
		
		int r1 = r;
		int c1 = c;
		while(r1>=0 && c1>=0) {
			if(visted[r1][c1]) {
				return false;
			}
			r1--;
			c1--;
		}
		
		int r2 = r;
		int c2 = c;
		while(r2>=0 && c2< visted[0].length) {
			if(visted[r2][c2]) {
				return false;
			}
			r2--;
			c2++;
		}
		return true;
	}
}
