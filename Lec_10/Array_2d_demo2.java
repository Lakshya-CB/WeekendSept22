package Lec_10;

import java.util.Scanner;

public class Array_2d_demo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();

		int[][] mat = new int[row][col];

		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				mat[r][c] = scn.nextInt();
			}
		}
		System.out.println("==========");

		for (int[] row1 : mat) {
			for (int ali : row1) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}
}
