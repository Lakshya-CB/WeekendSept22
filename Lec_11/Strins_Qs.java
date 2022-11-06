package Lec_11;

public class Strins_Qs {
	public static void main(String[] args) {
		String str = "the sky is blue";
//		allPalinSubString(str);
//		allPalinSubString(str);
		wordsRev(str);

	}

	public static void allSubstrings(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				System.out.println(str.substring(s, e));
			}
		}
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void allPalinSubString(String str) {
		for (int i = 0; i < str.length(); i++) {
			check(str, i, i);
			check(str, i, i + 1);

		}
	}

	public static void check(String str, int L, int R) {
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
				System.out.println(str.substring(L, R + 1));
			} else {
				return;
			}
			L--;
			R++;
		}
	}

	public static void wordsRev(String str) {
		while (true) {
			int found = str.lastIndexOf(' ');
			String word = str.substring(found + 1);
			System.out.println(word);
			if (found == -1) {
				break;
			}
			str = str.substring(0, found);

		}
	}

}
