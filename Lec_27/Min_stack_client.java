package Lec_27;


public class Min_stack_client {
	public static void main(String[] args) {
		Min_Stack S = new Min_Stack();
//		0,3,7,60,5,50,10

		S.add(10);
		S.disp();
		System.out.println(S.min());
		S.add(50);
		S.add(5);
		S.add(60);
		S.add(7);
		S.disp();
		System.out.println(S.min());
		
		S.add(3);
		S.add(0);
		S.disp();
		System.out.println(S.min());
		System.out.println("==========");
//		0,3,7,60,5,50,10
		System.out.println(S.min() 
				+ " ++ "+S.pop()+" "
			+ "++ "+S.min() );
		S.disp();

		System.out.println(S.min() 
				+ " ++ "+S.pop()+" "
			+ "++ "+S.min() );
		S.disp();
		System.out.println(S.min() 
				+ " ++ "+S.pop()+" "
			+ "++ "+S.min() );
		S.disp();
		
	}
}
