package Lec_10;

public class Array_QPS {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 11, 12, 13 }, 
				{ 21, 22, 23 }, 
				{ 31, 32, 33 }, 
				{ 41, 42, 43 },
				{ 51, 52, 53 }};
//		Wavy(arr);
		anticlock(arr);

	}

	public static void Wavy(int[][] mat) {
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				int rtp = r;
				if (c % 2 == 1) {
					rtp = mat.length - 1 - r;
				}
				System.out.print(mat[rtp][c] + " ");
			}
			System.out.println();
		}
	}

	public static void anticlock(int[][] mat) {
		int rs = 0;
		int re = mat.length - 1;
		int cs = 0;
		int ce = mat[0].length - 1;
		int count = 0;
		int lim = mat.length * mat[0].length;
		
		while (rs<=re && cs<=ce) {
			for (int r = rs; r <= re&& count < lim; r++) {
				System.out.print(mat[r][cs] + " ");
				count++;
				
			}
			System.out.println();

			for (int c = cs + 1; c <= ce&& count < lim; c++) {
				System.out.print(mat[re][c] + " ");
				count++;
				
			}
			System.out.println();

			for (int r = re - 1; r >= rs&& count < lim; r--) {
				System.out.print(mat[r][ce] + " ");
				count++;
				
			}
			System.out.println();

			for (int c = ce - 1; c >= cs + 1&& count < lim; c--) {
				System.out.print(mat[rs][c] + " ");
				count++;
				
			}
			System.out.println();
			
			rs++;
			re--;
			cs++;
			ce--;
		}
	}
}
