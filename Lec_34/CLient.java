package Lec_34;

public class CLient {
	public static void main(String[] pui) {
		for(String word : pui) {
			System.out.println(word);
		}
		System.out.println(Student.tots_student);
		Student s1 = new Student("a",1);
		System.out.println(Student.tots_student);
		Student s2 = new Student("a",1);
		System.out.println(Student.tots_student);
		Student s3 = new Student("a",1);
		System.out.println(Student.tots_student);
		
	}
}
