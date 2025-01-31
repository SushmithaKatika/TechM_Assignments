package full_stack;
import java.util.Arrays;
import java.util.Scanner;
public class Student {
String name;
int[] marks;
int totalMarks;
double avgOfMarks;


public Student(String name,int[] marks) {
this.name=name;
this.marks=marks;
totalAndAverage();
}

public void getStudentDetails() {
	
}
private void totalAndAverage() {
	totalMarks=Arrays.stream(marks).sum();
	avgOfMarks=totalMarks/marks.length;
}
public static void main(String[] arg) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number of students");
	int n=scan.nextInt();
	Student[] std=new Student[n];
	for(int i=0;i<n;i++) {
		System.out.println("enter student name");
		String name=scan.next();
		System.out.println("enter number of subjects");
		int subjectCount=scan.nextInt();
		int[] marks=new int[subjectCount];
		System.out.println("enter "+subjectCount+"subjects marks");
		for(int j=0;j<subjectCount;j++) {
			marks[j]=scan.nextInt();
		}
		scan.nextLine();
	 std[i]=new Student(name,marks);
	}
	
	for(Student detail:std) {
	System.out.println("Student name = \n"+detail.name+"  student marks = "+detail.totalMarks+" average of Marks"+detail.avgOfMarks);
			
	}
}
}