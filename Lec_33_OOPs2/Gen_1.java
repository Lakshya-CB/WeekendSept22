package Lec_33_OOPs2;

import java.util.Comparator;

public class Gen_1 {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("A", 10);
		arr[1] = new Student("B", 11);
		arr[2] = new Student("C", 1);
		arr[3] = new Student("D", 120);
		arr[4] = new Student("E", 5);

		print(arr);
//		sort(arr);
		sort(arr,new naaameCom());
		print(arr);

	}

////	Generic fun!!
//	public static void print(Object[]arr) {
//		for(Object obj : arr ) {
//			System.out.print(obj + " ");
//		}
//		System.out.println();
//	}
	public static <Y> Y print(Y[] arr) {

		for (Y obj : arr) {
//			obj.
			System.out.print(obj + " ");
		}
		System.out.println();
		return arr[0];
	}

	public static <T extends Comparable<T>> void sort(T[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int i = 0; i <= arr.length - 2; i++) {
//				arr[i].
				if (arr[i].compareTo(arr[i + 1]) > 0) {
//				if (arr[i].Age - arr[i + 1].Age > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	static class naaameCom implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
//			o1-o2
			
			return o1.Name.compareTo(o2.Name);
		}

	}

	public static <T> void sort(T[] arr, Comparator<T> comp) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int i = 0; i <= arr.length - 2; i++) {

//				A-B
				if (comp.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
