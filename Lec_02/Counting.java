package Lec_02;

import java.util.Scanner;

public class Counting {
	
	public static void main(String[] args) {
		int sum =0;
		Scanner scn = new Scanner(System.in);
		int n = 5;//scn.nextInt();
		int i =1;
		while(i<=n) {
			System.out.println(i);
			sum = sum +i;
			i++;
		}
		System.out.println("sum , " + sum);
	}
}
