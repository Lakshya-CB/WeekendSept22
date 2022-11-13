package Lec_13;

public class Poly {
	public static void main(String[] args) {
		System.out.println(solve(7, 3));
	}

	public static int solve(int x, int n) {
		int c = 1;
		int var = (int) Math.pow(x, n);
		int ans = 0;
		while (c <= n) {
			ans = ans + c * var;
//			System.out.println(c*var);
			c++;
			var = var / x;
		}
		return ans;

	}
}
