package Lec_29;

public class LinkedList {
	class Node {
		public Node(int data2) {
			// TODO Auto-generated constructor stub
			data = data2;
		}

		int data;
		Node next;
	}

	Node head;

	public void Disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println("END ");
	}

	public int size() {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("idx out of bounds");
		}
		if (idx == 0) {

			return getFirst();
		}
		if (idx == size() - 1) {
			return getLast();
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getAtNode(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("idx out of bounds");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void add(int data) {
		addLast(data);
	}

	public void addLast(int data) {
		Node nn = new Node(data);
		if (isEmpty()) {
			head = nn;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
	}

	public void addFirst(int data) {
		Node nn = new Node(data);

		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int data) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("idx out of bounds");
		}
		if (idx == 0) {
			addFirst(data);
			return;
		}
		if (idx == size() - 1) {
			addLast(data);
			return;
		}

		Node nn = new Node(data);
		Node prev = getAtNode(idx - 1);
		Node after = prev.next;

		prev.next = nn;
		nn.next = after;
	}

	public int removeLast() {
		Node secondLast = getAtNode(size() - 2);
		Node last = secondLast.next;

		secondLast.next = null;

		return last.data;

	}

	public int removeFirst() {
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeAt(int idx) {
		Node prev = getAtNode(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;

		prev.next = after;
		return curr.data;
	}

	public void Rev() {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node after = curr.next;
			//
			
			curr.next = prev;
			//
			prev = curr;
			curr = after;
		}
	}
}
