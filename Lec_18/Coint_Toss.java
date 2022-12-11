package Lec_18;

public class Coint_Toss {
	public static void main(String[] args) {
		CoinT(3, "");
	}

	public static void CoinT(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CoinT(n - 1, path + "H");
		CoinT(n - 1, path + "T");
	}
}
