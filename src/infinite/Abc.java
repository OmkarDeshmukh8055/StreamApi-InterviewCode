package infinite;

public class Abc {

	public static void main(String[] args) {
		
		int []nums = {1, 2, 3, 4};  //Output:        [24, 12, 8, 6]
		
		
		for (int i = 0; i < nums.length; i++) {
			
			int mul=1;
			
			for (int j = 0; j < nums.length; j++) {
				
				if(j!=i) {
					mul=mul*nums[j];
				}
			}
			System.out.print(mul+", ");
			
			
		}
		
		
	}
}
