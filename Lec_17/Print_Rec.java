package Lec_17;

public class Print_Rec {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
//		print(arr, 0);
		System.out.println(Max(arr, 0));
	}

	public static void print(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP (arr,idx)
//		SP(arr,idx+1)
		System.out.println(arr[idx]);
		print(arr, idx + 1);
	}

	public static void Revp(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP (arr,idx)
//		SP (arr,idx+1)
		Revp(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static int Max(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return arr[idx];
		}
//		if(idx==arr.length) {
//			return Integer.MIN_VALUE;
//		}
//		BP max(arr,idx);
//		SP max(arr,idx+1);
		int sp1 = Max(arr, idx + 1);
		return Math.max(arr[idx], sp1);
	}

	public static int FO(int[] arr, int idx, int ali) {
		if (idx == arr.length) {
			return -1;
		}
//		BP : (arr,idx,ali)
//		SP : (arr,idx+1,ali)
		int sp = FO(arr, idx + 1, ali);
		if (arr[idx] == ali) {
			return idx;
		} else {
			return sp;
		}
	}

	public static int LO(int[] arr, int idx, int ali) {
		if (idx == arr.length) {
			return -1;
		}
//		BP : (arr,idx,ali)
//		SP : (arr,idx+1,ali)
		int sp = LO(arr, idx + 1, ali);
		if (sp == -1 && arr[idx] == ali) {
			return idx;
		} else {
			return sp;
		}
	}

	public static int[] AllOcc(int[] arr, int idx, int ali, int takatak) {
		if (idx == arr.length) {
			return new int[takatak];
		}

		if (arr[idx] == ali) {
			int[] sp = AllOcc(arr, idx + 1, ali, takatak + 1);
			sp[takatak] = idx;
			return sp;
		} else {
			int[] sp = AllOcc(arr, idx + 1, ali, takatak);
			return sp;
		}
	}
}
