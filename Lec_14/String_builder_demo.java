package Lec_14;

public class String_builder_demo {
	public static void main(String[] args) {
		String str = "aamul";
		System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.substring(1,2));
//		change the ith char to '~';
		
		sb.setCharAt(1, '`');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		
		sb.append("okasfasjnr");
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		sb.insert(1,"asdad");
		System.out.println(sb);
		
		String ans = sb.toString();
		System.out.println(ans);
	}
}
