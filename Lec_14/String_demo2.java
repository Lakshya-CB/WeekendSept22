package Lec_14;

public class String_demo2 {
	public static void main(String[] args) {
		String str = "aajaadi de!!";
		String lll = str.substring(0,3);
		System.out.println(lll);
//		lll.intern();
		String ll2 = "aaj";
		System.out.println(lll==ll2);
		
	}
}
