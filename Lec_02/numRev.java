package Lec_02;

public class numRev {
	public static void main(String[] args) {
		int num = 12345;
		int ans = 0;
		while (num != 0) {
			int digit = num % 10;
			ans = ans * 10 + digit;
//			System.out.print(digit);
			num = num / 10;
		}
		System.out.println(ans);
	}
}
