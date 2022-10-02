package Lec_04;

public class Pat_21 {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int row = 1;
		int nsp = 2 * n - 3;
		while (row <= n) {
			int cst1 = 0;
			while (cst1 < nst) {
				System.out.print("* ");
				cst1++;
			}

			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst2 = 0;
			if (row == n) {
				cst2 = 1;
			}
			while (cst2 < nst) {
				System.out.print("* ");
				cst2++;
			}
			nsp = nsp - 2;
			row++;
			nst++;
			System.out.println();
		}
	}
}
