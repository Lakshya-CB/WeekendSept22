package Lec_08;

import java.util.Arrays;

public class Rotation_2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
//		System.out.println(-12%5);
//		System.out.println(12%5);
//		
		int rot = -307;
	
		System.out.println(Arrays.toString(arr));
		solve(arr, rot);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void rev(int[] arr,int s, int e) {
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;e--;
		}
	}
	public static void solve(int[] arr, int rot) {
		rot = rot%arr.length;
		if(rot<0) {
			rot = rot +arr.length;
		}
//		Step 1: purii 
		rev(arr, 0, arr.length-1);
		
//		Step 2: Body!! the part to rotate
		rev(arr, 0, rot-1);
		
//		Step 3:
		rev(arr, rot, arr.length-1);
		
	}
}
