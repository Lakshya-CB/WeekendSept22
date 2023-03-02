package Lec_DP;

public class House_2 {
	class Solution {
		public int rob(int[] nums) {
			if (nums.length == 1) {
				return nums[0];
			}

			return rob_Tuccha(nums);
		}

		int rob_Tuccha(int[] nums) {

			int c1 = rob2_BU(nums, 0, nums.length - 2);
			int c2 = rob2_BU(nums, 1, nums.length - 1);
			return Math.max(c1, c2);
		}

		int rob2_BU(int[] nums, int s, int e) {

			int[] dp = new int[nums.length + 2];

			for (int i = e; i >= s; i--) {
				int sp1 = nums[i] + dp[i + 2];
				int sp2 = dp[i + 1];

				dp[i] = Math.max(sp1, sp2);
			}

			return dp[s];

		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2 };
//	System.out.println(rob2(arr, 0, arr.length - 1));
		System.out.println(rob2_TD(arr, 0, arr.length - 1, new Integer[arr.length + 1]));
	}

	static int rob2(int[] nums, int s, int e) {
		if (s >= e) {
			return 0;
		}

		int sp1 = nums[s] + rob2(nums, s + 2, e - 1);
		int sp2 = rob2(nums, s + 1, e);

		return Math.max(sp1, sp2);
	}

	static int rob2_TD(int[] nums, int s, int e, Integer[] dp) {
		if (s >= e) {
			return 0;
		}

		if (dp[s] != null) {
			return dp[s];
		}

		int sp1 = nums[s] + rob2_TD(nums, s + 2, e - 1, dp);
		int sp2 = rob2_TD(nums, s + 1, e, dp);

		dp[s] = Math.max(sp1, sp2);

		return Math.max(sp1, sp2);
	}
}
