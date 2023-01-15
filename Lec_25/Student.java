package Lec_25;

public class Student {
	private String Name = "pappu"; // data parsing!!
	private int Age = 10; //
	public Student() {
		Name = "pappu";
//		Age = 99;
	
	}
	public Student(int Age) {
		this.Age = Age;
	}
	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	public void party(Student s1) {
		System.out.println(this.Name 
				+ " party with "+s1.Name);
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int A) throws Exception {
		if(A<0) {
			throw new RuntimeException("HATJA BHAI!!-ve nahi!");
//			unchecked exception!! automatically pass!!
//			throw new Exception("HATJA BHAI!!-ve nahi!");
			
//			return;
		}
		Age = A;
	}
}
