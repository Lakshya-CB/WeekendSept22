package Lec_DP;

public class LIS {
	public static void main(String[] args) {

	}

	public static int LIS1(int idx, int prev, int[] arr) {
		if (idx == arr.length) {
			return 0;
		}
		int sp1 = 0;
		if (prev < arr[idx]) {
			sp1 = 1 + LIS1(idx + 1, arr[idx], arr);// include
		}
		int sp2 = LIS1(idx + 1, prev, arr);// exclude
		return Math.max(sp1, sp2);
	}

	public static int LIS(int idx, int prev, int[] arr) {
		if (idx == arr.length) {
			return 0;
		}
		int sp1 = 0;
		if (prev == -1 || arr[prev] < arr[idx]) {
			// sp1 = 1 + LIS(idx + 1, arr[idx], arr);// include
			sp1 = 1 + LIS(idx + 1, idx, arr);// include

		}
		// int sp2 = LIS(idx + 1, prev, arr);// exclude
		int sp2 = LIS(idx + 1, prev, arr);// exclude
		return Math.max(sp1, sp2);
	}

	public static int LIS(int idx, int prev, int[] arr, Integer[][] dp) {
		// LIS(idx, prev) = dp[idx][prev+1]
		if (idx == arr.length) {
			return 0;
		}
		if (dp[idx][prev + 1] != null) {
			return dp[idx][prev + 1];
		}
		int sp1 = 0;
		if (prev == -1 || arr[prev] < arr[idx]) {
			// sp1 = 1 + LIS(idx + 1, arr[idx], arr);// include
			sp1 = 1 + LIS(idx + 1, idx, arr, dp);// include
		}
		// int sp2 = LIS(idx + 1, prev, arr);// exclude
		int sp2 = LIS(idx + 1, prev, arr, dp);// exclude
		dp[idx][prev + 1] = Math.max(sp1, sp2);

		return Math.max(sp1, sp2);
	}

	public int lengthOfLIS(int[] arr) {
		ArrayList<Integer> AL = new ArrayList<>();
		for (int ali : arr) {
			if (AL.isEmpty() || ali > AL.get(AL.size() - 1)) {
				AL.add(ali);
			} else {
				int s = 0;
				int e = AL.size() - 1;
				int ans = -1;
				while (s <= e) {
					int mid = (s + e) / 2;
					if (AL.get(mid) >= ali) {
						ans = mid;
						e = mid - 1;
					} else {
						s = mid + 1;
					}
				}
				AL.set(ans, ali);
			}
		}
		return AL.size();
	}

	public static int BU(int[] arr) {
		int[][] dp = new int[arr.length + 1][arr.length + 1];
		for (int prev = arr.length - 1; prev >= -1; prev--) {
			for (int idx = arr.length - 1; idx >= 0; idx--) {
//				 dp[idx][prev+1]
				int sp1 = 0;
				if (prev == -1 || arr[prev] < arr[idx]) {
					sp1 = 1 + dp[idx + 1][idx];// include
				}

				int sp2 = 0;
				if (prev >= 0) {
					sp2 = dp[idx + 1][prev];// exclude
				}
				dp[idx][prev + 1] = Math.max(sp1, sp2);
			}
		}
		return dp[0][0];// (0,-1)
	}
}
