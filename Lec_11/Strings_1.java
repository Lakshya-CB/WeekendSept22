package Lec_11;

public class Strings_1 {
	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(str);
		System.out.println(str.length());
//		str[2]
		char ch = str.charAt(2);
		System.out.println(ch);
		
		System.out.println(str.charAt(str.length()-1));
		System.out.println("===========");
//		System.out.println(str.substring(0,2));
		System.out.println("===========");
		for(int s = 0;s<str.length();s++) {
			for(int e = s+1;e<=str.length();e++) {
				System.out.println(str.substring(s,e));
			}
		}
	}
}
