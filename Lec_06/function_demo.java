package Lec_06;

public class function_demo {
	public static void main(String[] args) {
//		add(1,2);
//		add3(1,2,3);
		int ans = sastaPow(10, 3);
		System.out.println(ans);

	}

	public static void fun() {
		System.out.println("AAAAA!!");
	}

	public static void add(int i, int j) {
		System.out.println(i + j);
	}

	public static void add3(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	public static int sastaPow(int x, int y) {
		System.out.println(x * y);
		int jojo =19; 
		return jojo + x * y;
	}
}
