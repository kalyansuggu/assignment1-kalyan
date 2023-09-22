package encapsulation;

public class Student{

	String studentName;
	int rollNo;
	static final String CLASS_NAME = "10th class";
	
	void displayStudentDetails() {
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student Roll No: "+ rollNo);
		System.out.println("Student Class Name: "+ CLASS_NAME);
	}

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentName = "Student1";
		student1.rollNo = 1;
	
		Student student2 = new Student();
		student2.studentName = "Student2";
		student2.rollNo = 2;

		Student student3 = new Student();
		student3.studentName = "Student3";
		student3.rollNo = 3;
		
		Student student4 = new Student();
		student4.studentName = "Student4";
		student4.rollNo = 4;
		
		System.out.println(student1.CLASS_NAME);
		System.out.println(student2.CLASS_NAME);
		System.out.println(student3.CLASS_NAME);
		System.out.println(student4.CLASS_NAME);
		
//		className = "11th Class";
//		
//		student1.className = "12th Class";
//		
		System.out.println("--------------------------------------------------");
		System.out.println(student1.CLASS_NAME);		
		System.out.println(student2.CLASS_NAME);		
		System.out.println(student3.CLASS_NAME);
		System.out.println(student4.CLASS_NAME);
		System.out.println("--------------------------------------------------");
		student1.displayStudentDetails();
		
		System.out.println("--------------------------------------------------");
		student2.displayStudentDetails();	
		
		System.out.println(Calculator.d);
	}
	
	
	

}
