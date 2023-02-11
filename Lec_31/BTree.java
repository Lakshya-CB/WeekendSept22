package Lec_31;

public class BTree {
	class Node{
		int data;
		Node left;
		Node right;
	}
	Node root;
	public void print() {
		print(root);
	}
	private void print(Node nn) {
		if(nn==null) {
			return;
		}
//		BP : nn 
//		SP : nn.left and nn.right
		
		System.out.println(nn.data);
		print(nn.left);
		print(nn.right);
		
	}
	public int size() {
		return size(root);
	}
	private int size(Node nn) {
		if(nn==null) {
			return 0;
		}
		int sp1 = size(nn.left);
		int sp2 = size(nn.right);
		return sp1+sp2+1;
	}
	public int Ht() {
		return Ht(root);
	}
	int goabal_dia = 0;
	private int Ht(Node nn) {
		if(nn==null) {
			return -1;
		}
		int sp1 = Ht(nn.left);
		int sp2 = Ht(nn.right);
		int Dia = sp1+sp2+2;
		goabal_dia = Math.max(goabal_dia, Dia);
		return Math.max(sp1, sp2)+1;
	}
	public int Dia() {
		return Dia(root);
	}
	private int Dia(Node nn) {
		if(nn==null) {
			return 0;
		}
		int L_dia = Dia(nn.left);
		int R_dia = Dia(nn.right);
		
		int self_Dia = Ht(nn.left)+Ht(nn.right)+2;
		
		return Math.max(R_dia, Math.max(L_dia, self_Dia));
	}
	
}
