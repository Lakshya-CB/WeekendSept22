package Lec_14;

public class String_dhoka_2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "";
		StringBuilder sb = new StringBuilder(str);
		
		int n = 100_000;
		for(int i=0;i<n;i++) {
//			str = str +n; // O(n)
			sb.append(n);
		}
		str = sb.toString();
		long end = System.currentTimeMillis();
		System.out.println((end-start));
		
	}
}
