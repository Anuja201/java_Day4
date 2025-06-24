package demo1;

import java.util.Scanner;

class Student2{
	String rollno;
	String name;
	String marks;
	 
	public void accept(Scanner sc){
		 System.out.println("Enter roll no:");
        this.rollno = sc.next();
        System.out.println("Enter name:");
        this.name = sc.next();
        System.out.println("Enter marks:");
        this.marks = sc.next();
	}
	public void Display(){
    System.out.println("Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks);

	}
}


public class program04 {

	public static int menu(Scanner sc) {
		System.out.println("--------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Display Student");
		System.out.println("3. Find Student");
		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();
		System.out.println("--------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student2[] arr = new Student2[5];
		int index = 0;
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (index < 5) {
					arr[index] = new Student2();
					arr[index].accept(sc);
					index++;
				} else
					System.out.println("Course is full");
				break;
			case 2:
				for (Student2 s : arr)
					if (s != null)
						s.Display();
				    System.out.println("Student class is empty");
				break;
			case 3:
				 System.out.println("Enter the roll no to search:");
                 String rollno = sc.next();
                 boolean found = false;

                 for (Student2 s : arr) {
                     if (s != null && s.rollno.equals(rollno)) {
                         s.Display();
                         found = true;
                         break;
                     }
                 }

                 if (!found) {
                     System.out.println("Student not found.");
                 }
                 break;
			default:
				System.out.println("Wrong choice.. :(");
				break;
			}
		}

	}

}