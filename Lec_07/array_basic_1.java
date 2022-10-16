package Lec_07;

public class array_basic_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(Max(arr));
//		System.out.println(Find(arr, 20));
//		RevPrint(arr);
		print(arr);

		int[] rev_arr = Rev(arr);
//		print(rev_arr);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int alo : arr) {
			System.out.print(alo + " ");
		}
		System.out.println();
	}

	public static int Max(int[] arr) {
//		int jeb = Integer.MIN_VALUE;
		int jeb = arr[0];
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int Find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}

		System.out.println("nachoo");
		return -1;
	}

	public static void RevPrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] Rev(int[] arr) {
		int[] ans = new int[arr.length];
		int i = 0;
		int j = arr.length - 1;
		while (j >= 0) {
			ans[i] = arr[j];
			i++;
			j--;
		}

		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = ans[idx];
		}
		return ans;
	}

	public static void Rev2(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
}
