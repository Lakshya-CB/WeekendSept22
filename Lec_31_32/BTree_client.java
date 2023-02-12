package Lec_31_32;

public class BTree_client {
	public static void main(String[] args) {
//		int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,60,-1,-1};
//		BTree BT = new BTree(pre);
//		BT.print();
//		BT.Level();
//		System.out.println("=============");
//		int[] lvl = {10,20,30,40,50,-1,60,-1,-1,-1,-1,70};
//		BT.createTreeLvl(lvl);
//		BT.print();
		System.out.println("=============");
		int[] pre = {10,20,40,50,30,60};
		int[] in = {40,20,50,10,30,60};
		BTree BT = new BTree(pre,in);
		BT.print();
		System.out.println("=========");
		BT.lvl3();	
		
 	}
}
