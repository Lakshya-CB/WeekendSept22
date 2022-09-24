package Lec_02;

public class HCF {
	public static void main(String[] args) {
		int a = 6;
		int b = 15;
		int divisor = a;
		int dividend = b;
		while (divisor!=0) {

			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
