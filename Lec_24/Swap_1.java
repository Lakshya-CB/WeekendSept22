package Lec_24;

public class Swap_1 {
	public static void main(String[] args) {

		Student s3 = new Student();
		s3.Name = "A";
		s3.Age = 10;

		Student s4 = new Student();
		s4.Name = "B";
		s4.Age = 20;

		System.out.println(s3.Name + s3.Age);
		System.out.println(s4.Name + s4.Age);
//		Test2(s3, s4);
		String myName = "bittu";
		int myAge = 25;
		Test3(s3, s4.Name, s4.Age, myAge, myName);
		System.out.println(s3.Name + s3.Age);
		System.out.println(s4.Name + s4.Age);
	}

	public static void Test3(Student s1, String Name, 
			int Age, int myAge, String myName) {
   	 s1.Name = "";
   	 s1.Age = 0;

   	 Name = "";
   	 Age = 0;

   	 myName = "";
   	 myAge = 0;
    }

	public static void Test2(Student s1, Student s2) {
		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}
}
