package Lec_33_OOPs2;

import java.util.Stack;

public class LinkedList<T> {
	class Node {
		public Node(T data2) {
			// TODO Auto-generated constructor stub
			data = data2;
		}

		T data;
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

	public T getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		return head.data;
	}

	public T getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ??");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public T getAt(int idx) {
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

	public void add(T data) {
		addLast(data);
	}

	public void addLast(T data) {
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

	public void addFirst(T data) {
		Node nn = new Node(data);

		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, T data) {
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

	public T removeLast() {
		Node secondLast = getAtNode(size() - 2);
		Node last = secondLast.next;

		secondLast.next = null;

		return last.data;

	}

	public T removeFirst() {
		T ans = head.data;
		head = head.next;
		return ans;
	}

	public T removeAt(int idx) {
		Node prev = getAtNode(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;

		prev.next = after;
		return curr.data;
	}

	
}
