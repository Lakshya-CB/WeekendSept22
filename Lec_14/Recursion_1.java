package Lec_14;

public class Recursion_1 {
	public static void main(String[] args) {
		PD(4);
	}

	public static void PD(int n) {
//		BP : PD(n)
//		SP : PD(n-1);
		if(n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
}
