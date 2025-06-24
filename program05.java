package demo1;

import java.util.Scanner;
 
class Student3{
	int rollno;
	String name;
	double marks;

	public Student3() {
	}

	public Student3(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void acceptStudent(Scanner sc) {
		System.out.println("Enter the Rollno:");
		this.rollno=sc.nextInt();
		System.out.println("Enter the name:");
		this.name=sc.nextLine();
		System.out.println("Enter the Marks:");
		this.marks=sc.nextDouble();
		}

	public void displayStudent() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);
	}

}

public class program05 {

	public static void main(String[] args) {
		Student3[] arr = new Student3[5];
		arr[0] = new Student3(1, "Anil", 50);
		arr[1] = new Student3(2, "Mukesh", 55);
		arr[2] = new Student3(3, "Ramesh", 60);
		arr[3] = new Student3(4, "Suresh", 65);
		arr[4] = new Student3(5, "Ram", 70);

		for (int i = 0; i < arr.length; i++) {
			arr[i].displayStudent();
			System.out.println("----------------------");
		}

		System.out.println("Using for-each->");
		for (Student3 s : arr) {
			s.displayStudent();
			System.out.println("----------------------");
		}

	}

}