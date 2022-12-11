package Lec_18;

public class SubSeq_02 {
	public static void main(String[] args) {
//		SubS("abc","");
		SubS2("ab", "");
	}

	public static void SubS(String str, String path) {
		if (str.isEmpty()) {
			System.out.println(path);
			return;
		}
		char ch = str.charAt(0); // mein esse call karunga!
		String remain = str.substring(1);
		SubS(remain, path + ch); // Include
		SubS(remain, path); // Exclude
	}

	public static void SubS2(String str, String path) {
		if (str.isEmpty()) {
			System.out.println(path+"~~~~");
			return;
		}
		char ch = str.charAt(0); // mein esse call karunga!
		String remain = str.substring(1);
		SubS2(remain, path + ch); // Include
		SubS2(remain, path + (int) ch); // Include
		SubS2(remain, path); // Exclude
	}
	
	public static String Options(char ch) {
		if(ch=='2') {
			return "abc";
		}else if(ch=='3') {
			return "def";
			
		}else if(ch=='4') {
			return "ghi";
			
		}else if(ch=='5') {
			return "jkl";
			
		}else if(ch=='6') {
			return "mno";
			
		}else if(ch=='7') {
			return "pqrs";
			
		}else if(ch=='8') {
			return "tuv";
		}else {
			return "wxyz";
		}
	}
	public static void LKC(String str, String path) {
//		str = "23"
		char ch= str.charAt(0); // ch = '2'
		String op = Options(ch); // op = "abc"
		String remain = str.substring(1);
		for(int i = 0;i< op.length();i++) {
			LKC(remain, path+op.charAt(i));
		}
		
	}
}
