package Lec_DP;

public class leetcode_746 {
//	https://leetcode.com/problems/min-cost-climbing-stairs/
	public static void main(String[] args) {

	}

	public int minCostClimbingStairs(int[] arr) {
		Integer[] dp = new Integer[arr.length];
		int sp1 = solve(0, arr, dp) + arr[0];

		// int sp2 = solve(1,arr,new Integer[arr.length])+arr[1];
		int sp2 = dp[1] + arr[1];
		return Math.min(sp1, sp2);
	}

	public static int solve(int curr, int[] arr, Integer[] dp) {
		if (dp[curr] != null) {
			return dp[curr];
		}
		int sp1 = 0;
		if (curr + 1 < arr.length) {
			sp1 = solve(curr + 1, arr, dp) + arr[curr + 1];
		}
		int sp2 = 0;
		if (curr + 2 < arr.length) {
			sp2 = solve(curr + 2, arr, dp) + arr[curr + 2];
		}
		dp[curr] = Math.min(sp1, sp2);
		return Math.min(sp1, sp2);
	}

	public static int solve(int curr, int[] arr) {
		int sp1 = 0;
		if (curr + 1 < arr.length) {
			sp1 = solve(curr + 1, arr) + arr[curr + 1];
		}
		int sp2 = 0;
		if (curr + 2 < arr.length) {
			sp2 = solve(curr + 2, arr) + arr[curr + 2];
		}
		return Math.min(sp1, sp2);
	}
	 public int minCostClimbingStairs(int[] arr) {
	        Integer[] dp = new Integer[arr.length];
	        for(int curr = arr.length-1;curr>=0;curr--){
	            // dp[curr]
	            int sp1 = 0;
	            if (curr + 1 < arr.length) {
	                sp1 = dp[curr + 1] + arr[curr + 1];
	            }
	            int sp2 = 0;
	            if (curr + 2 < arr.length) {
	                sp2 = dp[curr + 2] + arr[curr + 2];
	            }
	            dp[curr] = Math.min(sp1, sp2);

	        }
	        return Math.min(dp[0]+arr[0],dp[1]+arr[1]);
	    }
}
