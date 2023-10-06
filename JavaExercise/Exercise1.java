package JavaExercise;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Given a string s consisting of words and spaces, return the length of the last word in the string.
	//A word is a maximal substring consisting of non-space characters only.
		
		String str = "selenium course with testleaf";
        String parts[] = str.split(" ");
        String last = parts[parts.length-1];
        System.out.println("The length of the last word in the given string is " + last.length());

	}
	

}
