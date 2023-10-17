package JavaExercise;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isHappyNumber(5526);
			
	}
	
	public static void isHappyNumber(int num) {
		
		char[] strNum = ("" + num).toCharArray();
		int strLength = strNum.length;
		int sum = 0;
		
		if(strLength >1) {
			 for (int i = 0; i < strLength; i++) {
				  int digit = Character.getNumericValue(strNum[i]);
				  sum += (digit * digit);
				} 			 
			 if(sum!=1) {
				 isHappyNumber(sum);
			 }else if (sum==1) {
				 System.out.println("True! it's a Happy number."); 
			 }
			}	else {
				 System.out.println("False:( it is not a Happy number.");
			 }

		
	}

}
