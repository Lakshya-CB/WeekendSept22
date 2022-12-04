package Lec_Extra_Arrays_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Calcukate_the_sum {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		
		int mood = 1000000000+7;
		
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		int Q = scn.nextInt();


		while (Q > 0) {
			Q--;
			
			int X = scn.nextInt();

			int[] next_arr = new int[arr.length];
//			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < arr.length; i++) {
				int idx = i - X;
				if (idx < 0) {
					idx = idx + arr.length;
				}
				next_arr[i] = (arr[i] + arr[idx])%mood;
			}
			
//			System.out.println(Arrays.toString(next_arr));
//			System.out.println("============");
			arr = next_arr;
		}
		
		int sum =0;
		for(int alo : arr) {
			sum = (sum +alo)%mood;
		}
		System.out.println(sum);
	}
}
