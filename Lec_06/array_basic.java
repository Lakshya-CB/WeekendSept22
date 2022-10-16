package Lec_06;

public class array_basic {
	public static void main(String[] args) {
		int[] arr = new int[10];

//		arr[0] =2;
//		
//		arr[9] = 20;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 2*(i+1);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
