package Lec_24;

public class Student {
	String Name;
	int Age;
	public void Intro() {
//		System.out.println(this);
		System.out.println("Hit "+this.Name +
				" with "+this.Age);
	}
	public void partyWith(String Name) {
		System.out.println(this.Name
				+" party with "+Name);
	}
}
