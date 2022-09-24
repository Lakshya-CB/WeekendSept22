package Lec_02;

public class Fibo {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;

		int a = 0;
		int b = 1;
		while (i <= n) {
			int c = a + b;
//			System.out.println(c);

			a = b;
			b = c;
			i++;
		}
		System.out.println(a);
	}
}
