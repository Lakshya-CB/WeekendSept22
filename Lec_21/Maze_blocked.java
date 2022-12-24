package Lec_21;

public class Maze_blocked {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		boolean[][] Visited = new boolean[maze.length][maze[0].length];
		solve(0, 0, "", Visited, maze);
	}

	public static void solve(int r, int c, String path, boolean[][] Visited, int[][] maze) {

		if (r < 0 || c < 0 || r == maze.length || c == maze[0].length 
				|| maze[r][c] == 1||Visited[r][c]) {
			return;
		}
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(path);
			return;
		}
		Visited[r][c] = true;

		solve(r - 1, c, path + "U", Visited, maze); // U
		solve(r + 1, c, path + "D", Visited, maze); // D
		solve(r, c + 1, path + "R", Visited, maze); // R
		solve(r, c - 1, path + "L", Visited, maze); // L

		Visited[r][c] = false;
	}
}
