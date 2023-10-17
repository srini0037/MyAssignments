package JavaExercise;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {8,4,4,1,2,1,2};
		
		for(int i=0;i<nums.length;i++){
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				//System.out.print(count);
				//System.out.println(nums[j]);
				}
				
			}
			
			if(count==1)
				System.out.println(nums[i]);
			
		}
		


	}

}
