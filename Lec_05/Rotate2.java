package Lec_05;

public class Rotate2 {
	public static void main(String[] args) {
		int num = 12345;
		int k = 2;

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
// num = 12345, k = 2
		int div = (int) Math.pow(10, k);// 100
		int p1 = num / div; // 123 nod-k
		int p2 = num % div; // 45 k
		int mult = (int)Math.pow(10, nod-k);//1000
		System.out.println(p1 + " " + p2);

		System.out.println(p1  + mult*p2);
		
	}
}
