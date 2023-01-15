package Lec_26;

public class CLient_Dynamic_stack {
	public static void main(String[] args) {
		Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		S.add(70);
		S.add(80);
		S.add(90);

		S.add(100);
		S.disp();
		System.out.println(S);
		
		Object obj1 = new Stack();
		Object obj2 = new Dynamic_Stack();
		ArrayList<String> AL = new ArrayList<>();
		
		System.out.println(AL);
		
	}
}
