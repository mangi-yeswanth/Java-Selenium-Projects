package pkg_studentmarks;

import java.util.Scanner;

//this is my custom exception 
class InvalidGrade extends Exception {
	public InvalidGrade(String message) {
		super(message);
	}
}

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberofStudents, grade;
		String name;
		try {
			System.out.print("Enter the number of students: ");
			numberofStudents = sc.nextInt();

			for (int i = 0; i <= numberofStudents; i++) {
				System.out.print("Enter student" + i + " name: ");
				name = sc.nextLine();
				sc.nextLine();
				try {
					System.out.print("Enter grade (0-100): ");
					grade = sc.nextInt();
					sc.nextLine();
					if (grade < 0 || grade > 100) {
						throw new InvalidGrade("Grade must be between 0 and 100.");
					}
					System.out.println("Student" + name + ", Grade "+ grade);
				} catch (InvalidGrade e) {
					System.out.println("Error " + e.getMessage());
				} catch (Exception e) {
					System.out.println("Invalid input. Please enter an integer for grade.");
				}
			}
		} finally {
			sc.close();
			System.out.println("finally is excuted");
		}
	}
}
