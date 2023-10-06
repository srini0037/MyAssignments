package week2.day3;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stu = new Students();
		getStudentInfo(10);
		stu.getStudentInfo(10,"Srinivas");
		stu.getStudentInfo("Srini", 1234567890);

	}
	
	public static void getStudentInfo(int id) {
		
		System.out.println("This method input is only id");
		
		
	}
	public void getStudentInfo(int id, String name) {
		
		System.out.println("This method input is id and name");
		
	}
	public void getStudentInfo(String email, int phone) {
		
		System.out.println("This method input is email and phone number");
	
	}
}
