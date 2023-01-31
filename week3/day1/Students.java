package week3.day1;

public class Students {

	public void getStudentInfo(int ID) {
		System.out.println(ID);
	}
	
	public void getStudentInfo(int ID, String Name) {
		System.out.println(ID + Name);
	}
	
	public void getStudentInfo(String Email,int Phone) {
	 System.out.println(Email + Phone);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students students = new Students();
		students.getStudentInfo(5);
		students.getStudentInfo(5, "RAM");
		students.getStudentInfo("ram@gmail.com", 855536);
			

	}

}
