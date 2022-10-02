package Lec_04;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int numst = 1;
		while (row <= n) {
//			numst++;
			int cst = 0;
			while(cst<numst) {
				System.out.print("* ");
				cst++;
			}
			
		// prep agli row ke liye!!
			numst++;
			row++;
			System.out.println();
		}
	}
}
