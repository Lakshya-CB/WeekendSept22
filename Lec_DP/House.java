package Lec_DP;

public class House {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
//	System.out.println(rob(nums, 0));
		System.out.println(rob_BU(nums));

	}

	static int rob(int[] nums, int idx) {
		if (idx >= nums.length) {
			return 0;
		}

		int sp1 = nums[idx] + rob(nums, idx + 2);
		int sp2 = rob(nums, idx + 1);

		return Math.max(sp1, sp2);
	}

	static int rob_TD(int[] nums, int idx, Integer[] dp) {
		if (idx >= nums.length) {
			return 0;
		}

		if (dp[idx] != null) {
			return dp[idx];
		}

		int sp1 = nums[idx] + rob_TD(nums, idx + 2, dp);
		int sp2 = rob_TD(nums, idx + 1, dp);

		dp[idx] = Math.max(sp1, sp2);

		return Math.max(sp1, sp2);
	}

	static int rob_BU(int[] nums) {
		int[] dp = new int[nums.length + 2];

		for (int i = nums.length - 1; i >= 0; i--) {
			int sp1 = nums[i] + dp[i + 2];
			int sp2 = dp[i + 1];

			dp[i] = Math.max(sp1, sp2);
		}

		return dp[0];
	}
}
