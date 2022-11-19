package Lec_14;

public class SOE {
	public static void main(String[] args) {
		primes(25);
	}

	public static void primes(int n) {
		boolean[] isComp = new boolean[n + 1];
		isComp[0] = true;
		isComp[1] = true;

		for (int div = 2; div * div <= n; div++) {
			if (isComp[div] == false) {
				for (int table = div * div; table <= n; table = table + div) {
					isComp[table] = true;
				}
			}
		}
		for(int num = 2;num<=n;num++) {
			if(isComp[num]==false) {
				System.out.println(num);
			}
		}
	}
}
