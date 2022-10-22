package Lec_08;

import java.util.Arrays;

public class Rotation {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int rot = 307;
	
		System.out.println(Arrays.toString(arr));
		solve(arr, rot);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void rotate_once(int[] arr) {
		int jeb = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = jeb;
	}
	public static void solve(int[] arr, int rot) {
		rot = rot%arr.length;
		for(int i=0;i<rot;i++) {
			rotate_once(arr);
		}
	}
}
