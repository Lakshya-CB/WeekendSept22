package Lec_19;

public class Gen_paren {
	public static void main(String[] args) {
		solve(3, 3, "");
	}

	public static void solve(int Op, int Cl, String path) {
		if(Op> Cl) {
			return;
		}
		if (0 == Cl && Op == 0) {
			System.out.println(path);
			return;
		}
		if (Op >= 1) {
			solve(Op - 1, Cl, path + "("); // op
		}
		if (Cl >= 1) {
			solve(Op, Cl - 1, path + ")"); // cl
		}
	}
}
