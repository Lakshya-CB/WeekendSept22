package Lec_25;

public class Stack {
	private int[] arr;
	private int tos;
	Stack(int cap){
		arr = new int[cap];
		tos = -1;
	}
	Stack(){
		this(5);
	}
	public void add(int ali) {
		push(ali);
	}
	public void push(int ali) {
		if(isFull()) {
			throw new RuntimeException("pfull hein");
		}
		tos++;
		arr[tos]= ali;
	}
	public int size() {
		return tos+1;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("kya deekh rha hein?!");
		}
		return arr[tos];
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("kya delete kar rha hein?!");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public boolean isFull() {
		return size()== arr.length;
	}
	public void disp() {
		int idx = tos;
		System.out.print("Top =>[ ");
		while(idx>=0) {
			System.out.print(arr[idx]+" ");
			idx--;
		}
		System.out.println("]");
	}
}
