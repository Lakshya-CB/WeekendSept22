package Lec_15;

public class Rec_Basics {
	public static void main(String[] args) {
//		PDI(4);
//		PI(1,4);
		PID(1,3);
	}

	public static void PI(int s, int e) {
//	BP : PI(s,e);
//	SP : PI(s+1,e);
		if (s > e) {
			return;
		}
		System.out.println(s);
		PI(s + 1, e);

	}

	public static void PI(int n) {
//		BP : PI(n)
//		SP : PI(n-1)
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {

//		BP : PDI(n)
//		SP : PDI(n-1)
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
		if(s>e) {
			return;
		}
		System.out.println(s);
		PID(s+1,e);
		System.out.println(s);
		
	}
}
