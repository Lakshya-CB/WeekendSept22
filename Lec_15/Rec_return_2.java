package Lec_15;

public class Rec_return_2 {
	public static void main(String[] args) {
//		System.out.println(fac(4));
		System.out.println(fibo(4));
	}

	public static int fac(int n) {
//		BP : fac(n)
//		SP : fac(n-1)
		if (n == 0) {
			return 1;
		}

		int sp = fac(n - 1);
		return n * sp;
	}

	public static int fibo(int n) {
//		BP : fibo(n)
//		SP : fibo(n-1) and Fibo(n-2)
		if (n <= 1) {
			return n;
		}
		int sp1 = fibo(n - 1);
		int sp2 = fibo(n - 2);

		return sp1 + sp2;

	}
}
