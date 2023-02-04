package Lec_29;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.Disp();
		LL.addAt(2, 25);

		LL.Disp();
	}
}
