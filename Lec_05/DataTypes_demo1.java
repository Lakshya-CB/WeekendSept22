package Lec_05;

public class DataTypes_demo1 {
	public static void main(String[] args) {
		byte b = (byte) (13000);
		System.out.println(b);

		long l = 1000000;

		System.out.println(2.132);
		float f = (float) 2.132;
		double d = 2.132;

		char ch = 'R';
		System.out.println(ch);
		System.out.println((int) ch);

		System.out.println(ch + 2);

		boolean bb = false;
		System.out.println(bb);
		while (bb) {
			System.out.println("nacho");
		}
		
		System.out.println("Hello" + 10 + 20);
		System.out.println("Hello" + (10 + 20));

		System.out.println(10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + 10 + 20);

	}
}
