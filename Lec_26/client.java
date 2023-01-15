package Lec_26;

public class client {
	public static void main(String[] args) {
//		case 1:
		P obj1 = new P();
		System.out.println(obj1.data);
		System.out.println(obj1.datap);

//		case 2:
		P obj2 = new C();
		System.out.println(obj2.datap);
		System.out.println("!" + obj2.data);
		System.out.println("!" + ((C) obj2).data);

		System.out.println("==========");
		obj2.fun();
		((C) obj2).fun();
		System.out.println("=============");
//		case 3: 
		C obj3 = new C();
		System.out.println(obj3.datap);
		System.out.println("!" + obj3.data);
		System.out.println("!" + ((P) obj3).data);

		System.out.println("==========");
		obj3.fun();
		((P) obj3).fun();
		System.out.println("=============");
//		case 4:
//		C obj4 = new P();

	}
}
