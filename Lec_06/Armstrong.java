package Lec_06;

public class Armstrong {
	public static void main(String[] args) {
		int n = 1000;
		printArmTill(n);
	}

	public static void printArmTill(int n) {

		for (int i = 1; i <= n; i++) {
			if (isArm(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArm(int num) {
		int nod = numOfDig(num);
		int sum = 0;
		int back_up = num;
		while (num != 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, nod);

			num = num / 10;
		}
		if (sum == back_up) {
			return true;
		} else {
			return false;
		}
	}

	public static int numOfDig(int num) {
		int ans = 0;
		while (num != 0) {
			num = num / 10;
			ans++;
		}
		return ans;

	}
}
