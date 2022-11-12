package Lec_12;

import java.util.ArrayList;

public class ArrayList_demo_02 {
	public static void main(String[] args) {
//		int[] arr = new int[5];
		
		ArrayList<Integer> AL = new ArrayList<>();
		System.out.println(AL.size());
		System.out.println(AL);
		
		AL.add(10);
		System.out.println(AL);
		
		AL.add(20);
		System.out.println(AL);
		
		AL.add(30);
		System.out.println(AL);
		
//		get
//		int temp = arr[i];
		int temp = AL.get(1);
		System.out.println(temp);

		AL.add(40);
		System.out.println(AL);
		
		System.out.println(AL.get(AL.size()-1));
		
//		arr[i] = 0; , set!! ith 
		
		AL.set(0, 999);
		System.out.println(AL);
//		add at iyh index
		
		AL.add(2, 5);
		System.out.println(AL);
		
		AL.add(0, -1);
		System.out.println(AL);

		AL.add(AL.size(), 909090);
		System.out.println(AL);
		
		int ali = AL.remove(2);
		System.out.println(ali);
		System.out.println(AL);
	}
}
