package CodingReviewArrStr;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		char[] digits = String.valueOf(num).toCharArray();
		int[] newdigits = new int[digits.length];
		
		for(int i=0;i<digits.length;i++) {
			newdigits[i]= Integer.parseInt(String.valueOf(digits[i]));
		}
		int a= newdigits[0]*newdigits[0]*newdigits[0];
		int b= newdigits[1]*newdigits[1]*newdigits[1];
		int c= newdigits[2]*newdigits[2]*newdigits[2];
		
		int res=a+b+c;
		
		if(res==num)
			System.out.println(num +" is an Armstrong number!");
		else
			System.out.println(num +" is not an Armstrong number!");
		

	}

}
