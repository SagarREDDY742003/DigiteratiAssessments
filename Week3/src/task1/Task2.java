package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/* 
Task 2 : Write a java program to accept the students name and marks in subjects and find the total and average of the 
marks and sort the list accordingly. 
*/
class Student{
	String name;
	int[] marks;
	int total;
	double average;
	
	Student(String name, int[] marks){
		this.name = name;
		this.marks = marks;
		calculateTotalAndAverage();
	}

	private void calculateTotalAndAverage() {
		total = Arrays.stream(marks).sum();
		average = total/(double)marks.length;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + Arrays.toString(marks) + ", total=" + total + ", average="
				+ average + "]";
	}
 	
}

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students:");
		int noOfStudents = sc.nextInt();
		for (int i = 0; i < noOfStudents; i++) {
			
			System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = sc.next();
            
            System.out.print("Enter the number of subjects: ");
            int numberOfSubjects = sc.nextInt();
            int[] marks = new int[numberOfSubjects];
            
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            
            studentList.add(new Student(name, marks));
		}
		sc.close();
		studentList.sort((s,t)->Integer.compare(s.total, t.total));
		System.out.println(studentList);
	}

}
