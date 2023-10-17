package JavaExercise;

import CodingReviewArrStr.ReverseString;

public class Palindrome extends ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "A man, a plan, a canal: Panama";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		str = str.toLowerCase();
		System.out.println(str);
		String revStr = revStr(str);
		if(str.equals(revStr))
			System.out.println(str+" is a palindrome");

	}

}
