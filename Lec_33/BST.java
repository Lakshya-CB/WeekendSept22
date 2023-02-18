package Lec_33;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub

			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public BST(int[] lvl) {
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

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	public void lvl() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			int curr_lvl_size = Q.size();
			for (int count = 1; count <= curr_lvl_size; count++) {
				Node nn = Q.poll();
				System.out.print(nn.data + " ");
				if (nn.left != null) {
					Q.add(nn.left);
				}
				if (nn.right != null) {
					Q.add(nn.right);
				}
			}
			System.out.println();
		}
	}

	public boolean isBST() {
		return isBST2(root).isBST;
	}

	class bstPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	private boolean isBST(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean sp1 = isBST(nn.left);
		boolean sp2 = isBST(nn.right);

		boolean self = nn.data >= Max(nn.left) && nn.data < Min(nn.right);
		return sp1 && sp2 && self;
	}

	private bstPair isBST2(Node nn) {
		if (nn == null) {
			return new bstPair();
		}
		bstPair sp1 = isBST2(nn.left);
		bstPair sp2 = isBST2(nn.right);

		bstPair ans = new bstPair();
		ans.max = Math.max(Math.max(sp1.max, sp2.max), nn.data);

		ans.min = Math.min(Math.min(sp1.min, sp2.min), nn.data);
		boolean self = nn.data >= sp1.max && nn.data < sp2.min;
		ans.isBST = sp1.isBST && sp2.isBST && self;

		return ans;
	}

	private int Min(Node right) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void add (int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if(nn==null) {
			return new Node(ali);
		}
		if(ali<=nn.data) {
			nn.left = add(nn.left,ali);
		}else {
			nn.right = add(nn.right,ali);
		}
		return nn;
	}
	public void remove(int ali) {
		root = remove(root,ali);
	}

	private Node remove(Node nn, int ali) {
		if(ali < nn.data) {
			nn.left = remove(nn.left, ali);
		}else if(ali > nn.data) {
			nn.right = remove(nn.right, ali);	
		}else {
//			c1 => leaf node
			if(nn.left==null && nn.right==null) {
				return null;
			}
//			c2 => 1 child
			if(nn.left!=null && nn.right==null) {
				return nn.left;
			}
			if(nn.left==null && nn.right!=null) {
				return nn.right;
			}
//			c3 
			int max_L = Max(nn.left);
			nn.data = max_L;
			nn.left = remove(nn.left, max_L);
		}
		return nn;
	}
	
}
