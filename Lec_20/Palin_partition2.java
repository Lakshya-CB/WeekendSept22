package Lec_20;

import java.util.ArrayList;
import java.util.List;

public class Palin_partition2 {
	public static void main(String[] args) {
		caat("abc", "", new ArrayList<String>());
	}

	public static void caat(String table, String bag, List<String> AL) {

		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL);
			System.out.println("==========");
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			String remain = table.substring(chakku);
//			System.out.println(piece+ " - "+remain);
			AL.add(piece); // prep
			caat(remain, bag + piece + "||", AL);
			AL.remove(AL.size()-1); // undo
			
//			@ Method 1 ==> treat AL like an immutable String		
//			List<String> sp= new ArrayList<>(AL);
//			sp.add(piece);
//			caat(remain, bag + piece + "||", sp);
		}
	}

	public static boolean isPlain(String piece) {
		int s = 0;
		int e = piece.length() - 1;
		while (s < e) {
			if (piece.charAt(s) != piece.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}