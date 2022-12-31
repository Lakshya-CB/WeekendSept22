package Lec_22;

public class Climb_Stairs {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 3, 4 };
//		suvle(0, "", 0, 4, coins);
		suvle_2(0, 0, "", 4, coins);
	}

//  wrt to bachha 
	public static void suvle(int curr, String path, int idx, int target, int[] coins) {
		if (curr == target) {
			System.out.println(path);
			return;
		}

//		-ve base case
		if (idx == coins.length || target < curr) {
			return;
		}
		suvle(curr + coins[idx], path + coins[idx], idx, target, coins);
		// Include
		suvle(curr, path, idx + 1, target, coins);
		// Exclude

	}

//	wrt to PT teacher!!
	public static void suvle_2(int curr, int prev_idx, String path, int target, int[] coins) {
		if (curr == target) {
			System.out.println(path);
			return;
		}
		if (curr > target) {
			return;
		}
		for (int i = prev_idx; i < coins.length; i++) {
//			selected the ith coin!!
			suvle_2(curr + coins[i], i, path + coins[i], target, coins);
		}

	}
}
