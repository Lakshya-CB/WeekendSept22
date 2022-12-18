package Lec_20;

public class Palin_partition {
	public static void main(String[] args) {
		caat("kuchbhidaldo", "");
	}

	public static void caat(String table, String bag) {
		if (table.isEmpty()) {
			System.out.println(bag);

		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPlain(piece)) {
				String remain = table.substring(chakku);
//			System.out.println(piece+ " - "+remain);
				caat(remain, bag + piece + "||");
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