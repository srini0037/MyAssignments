package week2.day2;

public class October4Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Testleaf";
		char comp = 'e';
		int temp = 0;
		
		char[] letters = String.valueOf(word).toCharArray();		
		//System.out.println(letters.length);
		
		for(int i=0;i<letters.length;i++) {
			if(letters[i]==comp) 
				temp = temp+1;				
		}
		System.out.println("The character " +comp+ " is used "+temp+" times in the word "+word);

	}

}
