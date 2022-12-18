package Lec_20;

import java.util.ArrayList;
import java.util.List;

public class Palin_partition_3 {
	public static void main(String[] args) {
		List<List<String>> Big_AL = new ArrayList<>();
		
		caat("nitin", "",new ArrayList<String>(),Big_AL);
		System.out.println(Big_AL);
	}

	public static void caat(String table, String bag, 
			List<String> AL,List<List<String>> Big_AL) {
		if (table.isEmpty()) {
//			System.out.println(AL);
			List<String> CC = new ArrayList<>(AL);
			Big_AL.add(CC);

		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPlain(piece)) {
				String remain = table.substring(chakku);
//			System.out.println(piece+ " - "+remain);
				AL.add(piece);
				caat(remain, bag + piece + "||",AL,Big_AL);
				AL.remove(AL.size()-1);
			}
		}
	}

	public static boolean isPlain(String piece) {
		int s=0;
		int e=piece.length()-1;
		while(s<e) {
			if(piece.charAt(s)!=piece.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		return true;
	}
}