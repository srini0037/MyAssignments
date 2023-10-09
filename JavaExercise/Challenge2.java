package JavaExercise;

public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This program is to find the square root of the given number
		
		int num = 87;
		int count = 1;
		
		for(int i=2;i<=num;i++) {
			int res=num/i;
			if(res==i && num%i==0) {
				System.out.println("The square root of "+num+" is "+i);
			}else
				count++;
			
			}
		if(count==num)
			System.out.println(":(");

	}

}
