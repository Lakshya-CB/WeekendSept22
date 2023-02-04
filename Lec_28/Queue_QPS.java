package Lec_28;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();

		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		System.out.println(Q);
		System.out.println("========");
//		DispRev(Q, 0);
//		System.out.println(Q);
		int[] arr = {-20,10,-5,4,6,-9,-80,60,50};
		FirstNegW(arr, 3);
	}

	public static void DispRev(Queue<Integer> Q, int cnt) {
		if (cnt == Q.size()) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		DispRev(Q, cnt + 1);
		System.out.println(ali);
	}

	public static void Rev(Queue<Integer> Q) {
		if (Q.isEmpty()) {
			return;
		}
		int ali = Q.poll();
		Rev(Q);
//		System.out.println(ali);
		Q.add(ali);
	}

	public static void FirstNegW(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
		if (Q.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(arr[Q.peek()]);
		}
		for (int s = 1; s <= arr.length - k; s++) {
			if (!Q.isEmpty() && Q.peek() < s) {
				Q.poll();
			}
			int e = s + k - 1;
			if (arr[e] < 0) {
				Q.add(e);
			}
			
			if (Q.isEmpty()) {
				System.out.println(0);
			} else {
				System.out.println(arr[Q.peek()]);
			}
		}
	}
}
