package demo1;

import java.util.Scanner;

class Student1{
	String name;
	String course;
	
	Scanner sc= new Scanner(System.in);

	public Student1(String name, String course) {
		this.name = name;
		this.course = course;
	}
	
	public void process(String name,String course) {
		

	}
	public void display() {
		System.out.println("Name :"+name+"\nCourse :"+course);
	}
}

public class program03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// Ragged Array
		Student1[][] studentList = new Student1[2][];
		// cs course
		studentList[0] = new Student1[6];
        // AI-DS course
		studentList[1] = new Student1[3];
		
		studentList[0][0] =new Student1("purva","CS");
		studentList[0][1] =new Student1("puja","CS");
		studentList[0][2] =new Student1("neha","CS");
		studentList[0][3] =new Student1("shreya","CS");
		studentList[0][4] =new Student1("naaz","CS");
		studentList[0][5] =new Student1("esha","CS");
		studentList[1][0] =new Student1("anuja","AIDS");
		studentList[1][1] =new Student1("vaishu","AIDS");
		studentList[1][2] =new Student1("aparna","AIDS");

		


		for(int i=0;i<studentList.length;i++) {
			for(int j=0;j<studentList[i].length;j++) {
				studentList[i][j].display();
			}
			System.out.println();
		}
		sc.close();
	}

}
