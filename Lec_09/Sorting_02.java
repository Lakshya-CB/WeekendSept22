package Lec_09;

import java.util.Arrays;

public class Sorting_02 {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
//		System.out.println(Arrays.toString(arr));
//		bubble(arr);
//		System.out.println(Arrays.toString(arr));
//		Selection(arr);
//		int[] arr = { 10, 20, 30, 40, 25 };
		System.out.println(Arrays.toString(arr));
		insert(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int i = 0; i <= arr.length - 2; i++) {
//		bubble mein i and i+1;
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));

		}
	}

	public static void Selection(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			int e = arr.length - count;
			int max = 0;
			for (int i = 0; i <= e; i++) {
				if (arr[max] < arr[i]) {
					max = i;
				}
			}
//		max and e
			int temp = arr[max];
			arr[max] = arr[e];
			arr[e] = temp;
			System.out.println(Arrays.toString(arr));
		}

	}

	public static void insert(int[] arr) {
		for (int ali_to_ins = 1; ali_to_ins < arr.length; ali_to_ins++) {

			int l = ali_to_ins - 1;
			while (l >= 0 && arr[l] > arr[l + 1]) {
//			while (arr[l] > arr[l + 1] && l >= 0 ) {
						
				int temp = arr[l];
				arr[l] = arr[l + 1];
				arr[l + 1] = temp;

				l--;
			}
		}
	}
}
