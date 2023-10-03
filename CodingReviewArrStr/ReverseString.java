package CodingReviewArrStr;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "testleaF";
		revStr(str);

	}
	
	public static String revStr(String s) {
		
		//string to char array
		char[] chars = s.toCharArray();
		//System.out.println(chars.length);
		//System.out.println(chars);
		char[] revChars = new char[chars.length];
		
		//Assign the array index in reverse
		for(int i=0;i<chars.length;i++) {
			
			revChars[(chars.length-i)-1]=chars[i];
			//chars[i]= revChars[(chars.length-i)-1];
			
		}
		System.out.println(revChars);
		return s;
	}

}
