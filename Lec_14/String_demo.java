package Lec_14;

public class String_demo {
	public static void main(String[] args) {
		String str1 = "Hello"; // Literal
		String str2 = "Hello";
		String str3 = "Hello";
		
		str2 = str2 + "loli";
		System.out.println(str1 == str2);

		String str00 = new String("Hello"); // new key
		String str01 = new String("Hello"); // new key
		System.out.println(str00 == str01);

//		Intern pool ya String pool

	}
}
