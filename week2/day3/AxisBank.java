package week2.day3;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();

	}
	
	public void deposit() {
		System.out.println("This is AxisBank deposit method");
		super.deposit();
	}

}
