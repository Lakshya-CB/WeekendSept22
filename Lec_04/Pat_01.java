package Lec_04;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 15;

		int numst = n;
		int row = 1;
		while (row <= n) {

			int cst = 0;
			while (cst < numst) {
//				if (row == 1 || row == n||cst==0||cst==numst-1) {

				if (row == cst + 1 || row + cst == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}

			row++;
			System.out.println();
		}
	}
}
