package Lec_04;

public class Pat_12 {
	public static void main(String[] args) {
		int n = 9;
		int row = 1;
		int numsp = n - 1;
		int numst = 1;
		while (row <= n) {
			int csp = 0;
			while (csp < numsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 0;
			while (cst < numst) {
				if (cst % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				cst++;
			}

			row++;
			numsp--;
			numst = numst + 2;
			System.out.println();
		}
	}
}
