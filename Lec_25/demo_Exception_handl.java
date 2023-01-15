package Lec_25;

public class demo_Exception_handl {
	public static void main(String[] args) {
		Student s = new Student("Chottu", 12);
		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} catch (Exception e) {
			System.out.println("milgaya exception!!");
			e.printStackTrace();
			return;
//			System.err.println("~~~" + e.getMessage());
		} finally {
			System.out.println("chal bhai merer");
		}
		System.out.println("LOLO");
		int I = 10;
		System.out.println(I + 2);
		System.out.println("band karde portal");
	}

}
