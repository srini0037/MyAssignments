package week3.day1;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanaraBank cb = new Amazon();
		cb.cashOnDelivery();
		cb.cardPayments();
		cb.upiPayments();
		cb.internetBanking();
		cb.recordPaymentDetails();
		

	}

	
	public void cashOnDelivery() {
		System.out.println("This payment type is COD");
		
	}
	public void upiPayments() {
		System.out.println("This payment type is UPI");
		
	}
	public void cardPayments() {
		System.out.println("This payment type is Cards");
		
	}	
	public void internetBanking() {
		System.out.println("This payment type is Internet Banking");
		
	}
	public void recordPaymentDetails() {
		System.out.println("Make a payment detail record");
		
	}
	

}
