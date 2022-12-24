package Lec_21;

public class Queen_Perm {
	public static void main(String[] args) {
		boolean[] seats = new boolean[3];
		Perm(2, seats, "");
	}

	public static void Perm(int QTP, boolean[] seats, String path) {
		if(QTP==0) {
			System.out.println(path);
			return;
			
		}
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == false) {
				seats[i] = true;
				Perm(QTP - 1, seats, path + "Q" + i);
				seats[i] = false;
			}
		}
	}
}
