package week3.day1;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name");
	}
	
	
	public void studentDept() {
		System.out.println("Student Dept");
	}
	
	
	public void studentId() {
		System.out.println("Student ID");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
