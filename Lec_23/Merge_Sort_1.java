package Lec_23;

import java.util.Arrays;

public class Merge_Sort_1 {
	public static void main(String[] args) {
		int[] arr1 = { 11,12,13,40, 50  };
		int[] arr2 = { 10, 20, 30 };

//		System.out.println(Arrays.toString(merge(arr1, arr2)));
		int[] arr = {12,14,11,25,10,1};
		System.out.println(
				Arrays.toString(sort(arr,0,arr.length-1)
						));
		
		
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] big = new int[arr1.length + arr2.length];
		int i = 0;

		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				big[i] = arr1[idx1];
				i++;
				idx1++;
			} else {
				big[i] = arr2[idx2];
				i++;
				idx2++;
			}
		}
		
		while (idx1<arr1.length) {
			big[i] = arr1[idx1];
			i++;
			idx1++;
		}
		while (idx2<arr2.length) {
			big[i] = arr2[idx2];
			i++;
			idx2++;
		}
		return big;
	}
	
	public static int[] sort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s+e)/2;
		int[] sp1 = sort(arr, s, mid);
		int[] sp2 = sort(arr, mid+1, e);
		
		return merge(sp1, sp2);
	}
}
