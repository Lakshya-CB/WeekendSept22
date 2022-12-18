package Lec_20;

public class Seats_Comb {
	public static void main(String[] args) {
//		solve_seat(4, 0, 2, "");
		solve_Q(4, -1, 2, "");
	}

	public static void solve_seat(int total_seats, int curr, int QTP, String path) {
		if (QTP == 0) { // +ve bc
			System.out.println(path);
			return;
		}
		if (curr == total_seats) { // -ve BC
			return;
		}

		solve_seat(total_seats, curr + 1, QTP - 1, path + "q" + curr); // Yes, bathega
		solve_seat(total_seats, curr + 1, QTP, path);// No,nahi bathega
	}

	public static void solve_Q(int total_seats, int prev_seat, int QTP, String path) {
		if (QTP == 0) {
			System.out.println(path);
			return;
		}

		for (int curr = prev_seat + 1; curr < total_seats; curr++) {
//			curr index!!
			solve_Q(total_seats, curr, QTP - 1, path + "Q" + curr);
		}

	}
}
