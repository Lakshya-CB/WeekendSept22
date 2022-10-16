package Lec_06;

public class swap_demo {
	static int jaadu = 99;
	public static void main(String[] args) {
		System.out.println(jaadu);
		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b);
		swap(a, b);
		System.out.println(a + " : " + b);
		
		System.out.println(jaadu);
	}

	public static void swap(int a, int b) {
		jaadu++;
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}

}
