package Lec_19;

public class Climb_stairs {
	public static void main(String[] args) {
		CStairs(0, 5, "");
	}
	public static void CStairs(int curr, int dest, String path) {
		if(curr==dest) {// +ve positive BC
			System.out.println(path);
			return;
		}
		if(curr>dest) { //-ve negitive BC
			return;
		}
		CStairs(curr+1, dest, path+1);//1 ki jump
		CStairs(curr+2, dest, path+2);//2 ki jump
		CStairs(curr+3, dest, path+3);//3 ki jump
		
	}
}
