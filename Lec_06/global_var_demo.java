package Lec_06;

public class global_var_demo {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println(global_var_demo.val);
		fun(20);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(global_var_demo.val);
		val = val + 60;
		global_var_demo.val = val + 10;
		System.out.println(val);
		System.out.println(global_var_demo.val);
	}
}
