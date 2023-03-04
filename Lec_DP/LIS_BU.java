package Lec_DP;

import java.util.Arrays;

public class LIS_BU {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		BU(arr);
	}

		public static int BU(int[] arr) {
			int[][] dp = new int[arr.length + 1][arr.length + 1];
			for (int idx = arr.length - 1; idx >= 0; idx--) {
	
				for (int prev = arr.length - 1; prev >= -1; prev--) {
	//				 dp[idx][prev+1]
					int sp1 = 0;
					if (prev == -1 || arr[prev] < arr[idx]) {
						sp1 = 1 + dp[idx + 1][idx + 1];// include
					}
	
					int sp2 = 0;
	
					sp2 = dp[idx + 1][prev + 1];// exclude
	
					dp[idx][prev + 1] = Math.max(sp1, sp2);
				}
			}
	
			print(dp);
			return dp[0][0];// (0,-1)
		}

	public static void print(int[][] arrr) {
		for (int[] row : arrr) {
			System.out.println(Arrays.toString(row));
		}
	}
}
