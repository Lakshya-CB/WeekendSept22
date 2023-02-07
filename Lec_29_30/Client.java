package Lec_29_30;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
//		LL.add(10);
//		LL.add(20);
//		LL.add(30);
//		LL.add(40);
//		LL.Disp();
//		LL.addAt(2, 25);

//		LL.Disp();
//		LL.Rev();
//		LL.Disp();
		for(int i=1;i<=11;i++) {
			LL.add(i*10);
		}
		LL.Disp();
		LL.KRev(3);

		LL.Disp();
	}
}
