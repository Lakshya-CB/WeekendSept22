package Lec_12;

import java.util.ArrayList;

public class ArrayList_demo_03 {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(10);
		AL.add(20);
		AL.add(30);
		System.out.println(AL);
		for(int i=0;i<AL.size();i++) {
			System.out.println(AL.get(i));
		}
		
		for(int ali : AL) {
			System.out.println(ali);
		}
	}
}
