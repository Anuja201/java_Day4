package demo1;

import java.util.Scanner;

class Student{
	 int rollno;
	 String name;
	 double marks;
	 
	 public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	 }
	 
	 public void accept(Scanner sc) {
		 System.out.print("Enter the rollno: ");
	        this.rollno = sc.nextInt();
	        sc.nextLine();  
	        System.out.print("Enter the Name: ");
	        this.name = sc.nextLine();
	        System.out.print("Enter the Marks: ");
	        this.marks = sc.nextDouble();
	        sc.nextLine(); 
		 }
	 public void display() {
		 System.out.println("Rollno :"+rollno);
		 System.out.println("Name :"+name);
		 System.out.println("Marks :"+marks);

	 }
	 
	 
}
public class program02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] arr=new Student[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Student(i, null, i);
			arr[i].accept(sc);
		}
		//for loop
		for(int i=0;i<arr.length;i++) {
			arr[i].display();
			System.out.println("-----------------");
		}
		//for each
		for(Student s: arr) {
			s.display();
			System.out.println("-----------------");
		}
	}

}
