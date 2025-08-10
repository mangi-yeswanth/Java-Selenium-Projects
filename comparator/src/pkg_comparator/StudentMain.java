package pkg_comparator;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("Garry", 21));
		list.add(new Student("Binny", 26));
		list.add(new Student("Fenny", 22));

		// FirstApproach
		// SortByAge
		System.out.println("Before sorting: The age of the Students");
		for (Student sage : list) {
			System.out.println(sage.getAge());
		}

		class AgeComparator implements Comparator<Student> {

			public int compare(Student s1, Student s2) {

				return Integer.compare(s1.getAge(), s2.getAge());

			}

		}
		
		System.out.println("After sorting: The age of the Students");
		Collections.sort(list, new AgeComparator());
		for (Student sage : list) {
			System.out.println(sage);
		}
		class NameComparator implements Comparator<Student>{

			public int compare(Student s1,Student s2) {

				return s1.getName().compareTo(s2.getName());

			}

		}
		// SortByName
		System.out.println("Before sorting: The name of the Students");
		for (Student name : list) {
			System.out.println(name.getName());
		}
		System.out.println("After sorting: The name of the Students");
		Collections.sort(list, new NameComparator());
		for(Student name:list) {
			System.out.println(name);
		}
	}
}
