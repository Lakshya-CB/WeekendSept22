package Lec_14;

public class String_dhoka {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "";
		int n = 100_000;
		for(int i=0;i<n;i++) {
//			str = str +n; // O(n)
//			n = n+1; //O(1)
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start));
		
	}
}
