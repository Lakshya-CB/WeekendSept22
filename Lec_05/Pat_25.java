package Lec_05;

public class Pat_25 {
	public static void main(String[] args) {
		int n = 5;

		int start_bye = 1;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		int ntp = 1;
		while (row <= n) {

			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			ntp = start_bye;
			int cst = 0;
			while (cst < nst) {
//				System.out.print(ntp+"\t");

				System.out.print(ntp + " ");
				cst++;
				if (cst <= nst / 2) {
					ntp++;
				} else {
					ntp--;
				}

			}

			nst = nst + 2;
			nsp--;
			row++;
			System.out.println();
		}
	}
}
