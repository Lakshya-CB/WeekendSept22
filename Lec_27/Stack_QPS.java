package Lec_27;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.add(10);
		S.add(20);
		System.out.println(S);
		S.add(30);
		S.add(40);
		System.out.println("===============");
		System.out.println(S);
		RevDisp1(S);

//		RevDisp2(S);
		Rev(S);
		RevDisp1(S);
		System.out.println("============");
		int[] arr = {50,30,20,40,10,45,5,60,15,8};
//		NextGr8(arr);
		NextGr82(arr);

	}

	public static void RevDisp1(Stack<Integer> S) {
		Stack<Integer> EX = new Stack<>();
		while (!S.isEmpty()) {
			EX.add(S.pop());
		}
		System.out.print("[ ");
		while (!EX.isEmpty()) {
			int ali = EX.pop();
			System.out.print(ali + " ");
			S.add(ali);
		}
		System.out.println("]");
	}

	public static void RevDisp2(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
//		BP : n S
//		SP : n-1 
		int ali = S.pop();
		RevDisp2(S);
		System.out.println(ali);
		S.add(ali);
	}

	public static void Rev(Stack<Integer> S) {
		Stack<Integer> EX = new Stack<>();
		while (!S.isEmpty()) {
			EX.add(S.pop());
		}
		Copy(EX, S);

	}

	public static void Copy(Stack<Integer> A, Stack<Integer> B) {
		if (A.isEmpty()) {
			return;
		}
//		BP : n S
//		SP : n-1 
		int ali = A.pop();
		Copy(A, B);
		B.add(ali);
	}

	public static void NextGr8(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				System.out.println(S.pop() + " => " + B);
			}
			S.add(B);
		}
	}
	public static void NextGr82(int[] arr) {
		int[] ans = new int[arr.length];
		Arrays.fill(ans, -1);
		Stack<Integer> S = new Stack<>();
		for (int idx =0;idx<arr.length;idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				System.out.println(arr[A_idx] + " => " + B);
			}
			S.add(idx);
		}
		System.out.println(Arrays.toString(ans));
	}
}
