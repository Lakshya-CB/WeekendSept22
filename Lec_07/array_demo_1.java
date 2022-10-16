package Lec_07;

public class array_demo_1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println(arr);
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 2 * i + 2;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		for(int ali: arr) {
			ali = 20;
		}
		
//		enhanced loop and for each loop!!
		for(int ali: arr) {
//			ali = 20;
			System.out.print(ali + " ");
		}
	}
}
