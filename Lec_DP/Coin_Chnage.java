package Lec_DP;

public class Coin_Chnage {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 6 };
		int Amount = 10;
	}

	public static int solve(int idx, int A, int[] coins) {
		if (A == 0) {
			return 1;
		}
		if (idx == coins.length) {
			return 0;
		}
		int sp1 = solve(idx, A - coins[idx], coins);
		int sp2 = solve(idx + 1, A, coins);
		return sp1 + sp2;
	}

	public static int solveTD(int idx, int A, int[] coins, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (idx == coins.length) {
			return 0;
		}
		if (dp[idx][A] != null) {
			return dp[idx][A];
		}
		int sp1 = solveTD(idx, A - coins[idx], coins, dp);
		int sp2 = solveTD(idx + 1, A, coins, dp);
		dp[idx][A] = sp1 + sp2;
		return sp1 + sp2;
	}

//	public static void main (String[] args) {
//    	Scanner scn = new Scanner(System.in);
//    	int n = scn.nextInt();
//    	int m = scn.nextInt();
//    	int[] arr = new int[m];
//    	for(int i=0;i<m;i++){
//        	arr[i]= scn.nextInt();
//    	}
//    	System.out.println(BU( arr,n));
//	}
	public static int BU(int[] coins, int Amount) {
		int[][] dp = new int[coins.length + 1][Amount+1];
		for (int idx = coins.length - 1; idx >= 0; idx--) {

			for (int A = 0; A <= Amount; A++) {
				if (A == 0) {
					dp[idx][A] = 1;
					continue;
				}

//				dp[idx][A]
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[idx][A - coins[idx]];
				}
				int sp2 = dp[idx + 1][A];
				dp[idx][A] = sp1 + sp2;
			}
		}
		return dp[0][Amount];
	}
	public static int BUSE(int[] coins, int Amount) {
		int[][] dp = new int[2][Amount+1];
		for (int idx = coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {
				if (A == 0) {
					dp[0][A] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[0][A - coins[idx]];
				}
				int sp2 = dp[1][A];
				dp[0][A] = sp1 + sp2;
			}
			dp[1] = dp[0];
			dp[0] = new int[Amount+1];
		}
		return dp[1][Amount];
	}
}

