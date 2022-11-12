package Lec_12;

import java.util.ArrayList;

public class ArrayList_QPS_04 {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 10, 20, 30, 35, 35, 40, 50, 60, 120, 130 };
//		int[] arr2 = { 20, 32, 35, 35, 35, 50, 55, 64, 70 };
//		
//		System.out.println(Intersection(arr1, arr2));
		int[] arr1 = { 9, 9, 8, 7 };
		int[] arr2 = { 6, 5 };
		System.out.println(Add(arr1, arr2));

	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		int i1 = 0;
		int i2 = 0;
		ArrayList<Integer> AL = new ArrayList<>();
		while (i1 < arr1.length && i2 < arr2.length) {
			if (arr1[i1] == arr2[i2]) {
				AL.add(arr1[i1]);
				i1++;
				i2++;
			} else if (arr1[i1] < arr2[i2]) {
				i1++;
			} else {
				i2++;
			}
		}
		return AL;
	}

	public static ArrayList<Integer> Add(int[] arr1, int[] arr2) {
		int i1 = arr1.length - 1;
		int i2 = arr2.length - 1;
		int carry = 0;
		ArrayList<Integer> AL = new ArrayList<>();
		while (i1 >= 0 || i2 >= 0) {
			int sum = carry;
			if (i1 >= 0) {
				sum = sum + arr1[i1];
			}
			if (i2 >= 0) {
				sum = sum + arr2[i2];
			}
			int digit = sum % 10;
			AL.add(0, digit);
			carry = sum / 10;
			i1--;
			i2--;
		}
		if (carry != 0) {
			AL.add(0, carry);
		}
		return AL;
	}
}
