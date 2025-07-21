package interivew;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		
		int[] arr={1,8,4,6,3};
		
		 int max2=(int)Arrays.stream(arr)
			  .boxed()
			  .sorted((e1,e2)->e2-e1)
			  .skip(1)
			  .findFirst()
			  .get();
System.out.println(max2);
	}
}
