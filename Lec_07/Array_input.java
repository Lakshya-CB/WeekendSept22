package Lec_07;

import java.util.Scanner;

public class Array_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		
		for(int alo : arr) {
			System.out.print(alo+ " ");
		}
		
	}
}
