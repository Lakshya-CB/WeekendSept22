package Lec_34;

public class Student implements Comparable<Student>{
	static int tots_student=-10;
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		Age = i;
		Name = string;
		Inc();

	}
	static void Inc() {
//		Age = 99;
//		Name = "asdfa";
		tots_student++;
	}
	@Override
	public String toString() {
		// TODO Auto-genageerated method stub
		return "{" + Name + "," + Age + "}";
	}

	int Age;
	String Name;
	public int compareTo(Student o) {
//		A-B
//		A.compareTo(B)
//		this = A
//		o = B		
//		this.Age - o.Age;
		
//		o.Age - this.Age;
		return this.Age - o.Age;
	}
}
