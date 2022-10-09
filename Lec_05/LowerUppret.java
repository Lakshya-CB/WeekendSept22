package Lec_05;

import java.util.Scanner;

public class LowerUppret {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if (ch <= 'Z' && ch >= 'A') {
			System.out.println("YUPPER");
		} else if (ch <= 'z' && ch >= 'a') {
			System.out.println("YLowER");
		} else {
			System.out.println("kuchj ni");
		}
	}
}
