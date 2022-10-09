package Lec_05;

public class Inverse {
	public static void main(String[] args) {
		int num = 23145;
		int pos = 1;
		int ans = 0;
		while (num != 0) {
			int digit = num % 10;
//			System.out.println(digit +" - " +pos);
			int mult = (int) Math.pow(10, digit - 1);
//			System.out.println(pos * mult);
			ans = ans + pos * mult;
			num = num / 10;
			pos++;
		}
		System.out.println(ans);

	}
}
