package Lec_DP;

public class Basic {
	public static void main(String[] args) {
		int n = 100000000;
//		System.out.println(fiboTD(n, new Integer[n + 1]));
		System.out.println(fiboBU(n));
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = fibo(n - 1);
		int sp2 = fibo(n - 2);
		return sp1 + sp2;

	}

	public static int fiboTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = fiboTD(n - 1, dp);
		int sp2 = fiboTD(n - 2, dp);
//		fibo(n) = sp1+sp2;
		dp[n] = sp1 + sp2;
		return sp1 + sp2;

	}

	public static int fiboBU(int num) {
		int[] dp = new int[num + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int n = 2; n <= num; n++) {
//			dp[n] = fibo(n)
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
//			fibo(n) = sp1+sp2;
			dp[n] = sp1 + sp2;

		}
		return dp[num];
	}
	public static int fiboBUSE(int num) {
//		int[] dp = new int[num + 1];
		int curr = 0;
		int prev2 = 0;
		int prev1 = 1;
		for (int n = 2; n <= num; n++) {
//			dp[n] = fibo(n)
			int sp1 = prev1;
			int sp2 = prev2;
//			fibo(n) = sp1+sp2;
			curr = sp1 + sp2;
			
			prev2 = prev1;
			prev1= curr;

		}
		return curr;
	}
}
