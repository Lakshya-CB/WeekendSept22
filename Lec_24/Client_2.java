package Lec_24;

public class Client_2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "A";
		s1.Age = 10;
		s1.Intro();

		Student s2 = new Student();
		s2.Name = "B";
		s2.Age = 20;
		s2.Intro();


		s1.partyWith(s2.Name);
	}
}
