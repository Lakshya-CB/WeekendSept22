package Lec_19;

public class Maze_Path {
	public static void main(String[] args) {
		solve(0, 0, 2, 2, "");
	}

	public static void solve(int r, int c, int destr, int destc, String path) {
		if (r > destr || c > destc) {
			return;
		}
		if(r==destr && c==destc) {
			System.out.println(path);
			return;
		}

		solve(r, c + 1, destr, destc, path + "R");// Right
		solve(r + 1, c, destr, destc, path + "D");// Down

	}
}
