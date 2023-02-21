package Lec_34;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_QPS {
	public static void main(String[] args) {
//		int[][] arr = { { 10, 20, 30 }, { 15, 35 }, { 5, 7, 12, 25 }, { 17, 22, 40 } };
//		MergeK_Sorted(arr);
		int[] arr = { 1,3,2,4,0,-7,8,6,1 };
//		K_largest(arr, 3);
		Median(arr);
	}

	public static void K_largest(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() > k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}

	static class pair implements Comparable<pair> {
		public pair(int i, int i2, int j) {
			ali = i;
			arr_idx = i2;
			ali_idx = j;
		}

		int ali;
		int ali_idx;
		int arr_idx;

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.ali - o.ali; // A-B // Integer

//			return o.ali-this.ali ; // B-A

		}
	}

	public static void MergeK_Sorted(int[][] mat) {
		PriorityQueue<pair> PQ = new PriorityQueue<pair>();

		for (int i = 0; i < mat.length; i++) {
			PQ.add(new pair(mat[i][0], i, 0));
		}
		System.out.println(PQ);
		while (!PQ.isEmpty()) {
			pair curr = PQ.poll();
			System.out.println(curr.ali);
			curr.ali_idx++;
			if (curr.ali_idx < mat[curr.arr_idx].length) {
				curr.ali = mat[curr.arr_idx][curr.ali_idx];
				PQ.add(curr);
			}
		}
	}

	public static void Median(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();

		for (int ali : arr) {
			if (Left.isEmpty() || ali <= Left.peek()) {
				Left.add(ali);
			} else {
				Right.add(ali);
			}
//			////////////////////
			
			if(Left.size()-Right.size() >1) {
				Right.add(Left.poll());
			}
			
			if(Right.size()-Left.size() >1) {
				Left.add(Right.poll());
			}
			
			
//			////////////////
			
			
			if(Left.size()==Right.size()) {
				System.out.println((Left.peek()+Right.peek())/2.0);
			}else if(Left.size()== Right.size()+1) {
				System.out.println(Left.peek());
			}else if(Right.size()== Left.size()+1) {
				System.out.println(Right.peek());	
			}
		}

	}

}
