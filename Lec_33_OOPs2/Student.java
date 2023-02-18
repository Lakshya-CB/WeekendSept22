package Lec_33_OOPs2;

public class Student  implements Comparable<Student>{
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		Age = i;
		Name = string;

	}

	@Override
	public String toString() {
		// TODO Auto-genageerated method stub
		return "{" + Name + "," + Age + "}";
	}

	int Age;
	String Name;
	@Override
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
