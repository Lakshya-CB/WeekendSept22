package Lec_24;

public class Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(s1.Age);
		System.out.println(s1.Name);
		
		s1.Name = "bablu";
		s1.Age = 13;
		
		Student s2 = new Student();
		s2.Name = "munna";
		s2.Age = 50;
		
	}
}
