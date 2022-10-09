package Lec_05;

public class Rotate {
	public static void main(String[] args) {
		int num = 12345;
		int k = 300897;

		int nod = 0;
		int backup = num;
		while (num != 0) {
			num = num / 10;
			nod++;
		}
		k = k % nod;

		System.out.println(nod);
		num = backup;

		System.out.println("=========");
		for (int i = 0; i < k; i++) {
			int digit = num % 10;
			int remain = num / 10;
//			System.out.println(digit + " , " + remain);
			int pow = (int) Math.pow(10, nod - 1);
			num = digit * pow + remain;
			System.out.println(num);
		}
	}
}
