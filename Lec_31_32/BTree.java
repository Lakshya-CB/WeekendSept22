package Lec_31_32;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub

			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	int p_idx = 0;

	public BTree(int[] pre) {
		p_idx = 0;
		root = create_Pre(pre);
	}

	private Node create_Pre(int[] pre) {
		if (p_idx >= pre.length || pre[p_idx] == -1) {
			p_idx++;
			return null;
		}
		Node nn = new Node(pre[p_idx]);
		p_idx++;
		nn.left = create_Pre(pre);
		nn.right = create_Pre(pre);
		return nn;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
//		BP : nn 
//		SP : nn.left and nn.right
		String str = "";
		if (nn.left != null) {
			str = nn.left.data + "";
		}
		str = str + " => " + nn.data + " <= ";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);

	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int sp1 = size(nn.left);
		int sp2 = size(nn.right);
		return sp1 + sp2 + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int goabal_dia = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int sp1 = Ht(nn.left);
		int sp2 = Ht(nn.right);
		int Dia = sp1 + sp2 + 2;
		goabal_dia = Math.max(goabal_dia, Dia);

		return Math.max(sp1, sp2) + 1;
	}

	public int Dia() {
		return Dia2(root).Dia	;
	}
	class HtDiaPair{
		int Ht = -1;
		int Dia = 0;
	}
	private HtDiaPair Dia2(Node nn) {
		if (nn == null) {
			return new HtDiaPair();
		}
		HtDiaPair Left = Dia2(nn.left);
		HtDiaPair Right = Dia2(nn.right);

		HtDiaPair ans = new HtDiaPair();
		int self_Dia = Left.Ht + Right.Ht + 2;
		

		ans.Dia =  Math.max(Right.Dia, Math.max(Left.Dia, self_Dia));
		ans.Ht = Math.max(Left.Ht, Right.Ht)+1;
		return ans;
				
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L_dia = Dia(nn.left);
		int R_dia = Dia(nn.right);

		int self_Dia = Ht(nn.left) + Ht(nn.right) + 2;

		return Math.max(R_dia, Math.max(L_dia, self_Dia));
	}

	public void Level() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			System.out.println(nn.data);
			if (nn.left != null) {
				Q.add(nn.left);
			}
			if (nn.right != null) {
				Q.add(nn.right);
			}
		}
	}

	public void createTreeLvl(int[] lvl) {
		int idx = 1;
		root = new Node(lvl[0]);
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (idx < lvl.length && !Q.isEmpty()) {
			Node nn = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}
	public BTree(int[] pre , int[] in) {
		root = createPreIn(pre, 0, pre.length-1, in, 0, in.length-1);
	}
	private Node createPreIn(int[] pre, int ps,int pe,
			int[] in, int is, int ie) {
		if(ps >pe) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int f = -1;
		int L_size = 0;
		for(int i=is;i<= ie; i++) {
			if(in[i] == nn.data) {
				f = i;
				break;
			}
			L_size++;
		}
		nn.left = createPreIn(pre, ps+1, ps +L_size, in, is, f-1);
		
		nn.right = createPreIn(pre, ps +L_size+1, pe, in, f+1, ie);
		
		return nn;
	}
	public void lvl1() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while(!Q.isEmpty()) {
			int curr_lvl_size = Q.size();
			for(int count = 1;count<= curr_lvl_size;count++) {
				Node nn = Q.poll();
				System.out.print (nn.data+ " ");
				if(nn.left!=null) {
					Q.add(nn.left);
				}
				if(nn.right!=null) {
					Q.add(nn.right);
				}
			}
			System.out.println();
		}
	}
	public void lvl3() {
		Queue<Node> curr_Q = new LinkedList<>();
		Queue<Node> next_Q = new LinkedList<>();
		
		curr_Q.add(root);
		
		while (!curr_Q.isEmpty()) {
			Node nn = curr_Q.poll();
			System.out.print(nn.data+" ");
			if (nn.left != null) {
				next_Q.add(nn.left);
			}
			if (nn.right != null) {
				next_Q.add(nn.right);
			}
			if(curr_Q.isEmpty()) {
				curr_Q = next_Q;
				next_Q = new LinkedList<>();
				System.out.println();
			}
		}
	}
	public boolean isBal() {
		return isBal(root);
	}
	private boolean isBal(Node nn) {
		if(nn==null) {
			return true;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right))<=1;
		return self && L && R;
		
	}
}
