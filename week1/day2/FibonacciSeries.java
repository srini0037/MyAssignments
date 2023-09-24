package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numRange = 8;
		int n1=0;
		int n2=1;
		int n3;
		int i;
		
		System.out.print(n1+" "+n2);
		
		for(i=2;i<numRange;i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
