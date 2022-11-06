package Lec_11;

public class String_demo3 {
	public static void main(String[] args) {
		String str = "ABCDEFCDGCDH";
		
		System.out.println(str.indexOf("CDEFCzDGC"));
		System.out.println(str.lastIndexOf("CD"));
		
		System.out.println(str.startsWith("ABCzDE"));
		System.out.println(str.endsWith("GCDH"));
		
		String str2 = "sac";
		
		System.out.println(str + str2);
	}
}
