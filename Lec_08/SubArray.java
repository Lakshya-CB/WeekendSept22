package Lec_08;

public class SubArray {
	public static void main(String[] args) {
		int[] arr = { 10, -20, 30, 40 };
//		app2(arr);
		app3_b(arr);
		app3_a(arr);
	}

	public static void app1(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
				int sum = 0;
//				System.out.println(s + " - " + e);
				for (int i = s; i <= e; i++) {
					System.out.print(arr[i] + " ");
					sum = sum + arr[i];
				}
				System.out.println(" => " + sum);
			}
		}
	}

	public static void app2(int[] arr) {
		for (int s = 0; s < arr.length;s++) {
			int sum = 0;
			for (int e = s; e < arr.length; e++) {
				sum = sum + arr[e];
				System.out.println(s + " - " + e + " => " + sum);
			}
		}
	}
	
	public static void app3_b(int[] arr) {
		int max = 0;
		for (int s = 0; s < arr.length;) {
			int sum = 0;
			int e = s;
			for (; e < arr.length; e++) {
				sum = sum + arr[e];
				max = Math.max(max,sum);
				
//				System.out.println(s + " - " + e + " => " + sum);
				if(sum<0) {
					break;
				}
			}
			s= e+1;
		}

		System.out.println(max);
	}
	public static void app3_a(int[] arr) {
//		Kadance!!
//		Kadani!
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum<0) {
				sum = 0;
			}
			if(sum > max) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
