package Lec_22;

import java.util.ArrayList;

public class Tower_of_Henoii {
	static ArrayList<Integer> A = new ArrayList<>();
	static ArrayList<Integer> B = new ArrayList<>();
	static ArrayList<Integer> C = new ArrayList<>();

	public static void main(String[] args) {
		A = new ArrayList<>();
//		A.add(4);
		A.add(3);
		A.add(2);
		A.add(1);
		B = new ArrayList<>();
		C = new ArrayList<>();
		solve(A, C, B, 3);
	}

	public static void solve(ArrayList<Integer> src, ArrayList<Integer> dest, ArrayList<Integer> elper, int n) {
		if (n == 0) {
			return;
		}
		solve(src, elper, dest, n - 1);
//		Src se pakkar and dest mein daal de		
		int disk = src.remove(src.size() - 1);
		dest.add(disk);
		print(A, B, C);
//		Src se pakkar and dest mein daal de

		solve(elper, dest, src, n - 1);

	}

	public static void print(ArrayList<Integer> src, ArrayList<Integer> dest, ArrayList<Integer> elper) {
		System.out.println(src + "||" + dest + "||" + elper);
	}
	

}
class Solution {
    public double myPow(double x, int n) {
        if(n>0){
            return P(x,n);
        }else{
            return 1/P(x,n);
        }

    }
    public double P(double x, int n) {
        if(n==0){
            return 1;
        }
        double sp = P(x,n/2);
        if(n%2==0){
            return sp*sp;
        }else{
            return sp*sp*x;    
        }
    }
}
