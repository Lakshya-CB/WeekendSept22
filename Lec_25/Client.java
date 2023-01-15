package Lec_25;

public class Client {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student("ooo",100);
		System.out.println(s1.getName()+" "+s1.getAge());
		Student s2 = new Student("guu",15);
		s1.party(s2);
		
		System.out.println(s1.getAge());
		s1.setAge(20);
		System.out.println(s1.getAge());
		System.out.println("AAAAND");
	}
}
