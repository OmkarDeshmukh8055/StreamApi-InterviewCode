package interivew;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		
		
	Integer[] arr={1,8,4,6,3};
		
		int max=Arrays.stream(arr).mapToInt(e->e).max().getAsInt();
		int min=Arrays.stream(arr).mapToInt(e->e).min().getAsInt();
		
		System.out.println("Max "+max+", min "+min);
		
		int m=Integer.MAX_VALUE;
		
		int maxx=Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
										
				if(arr[i]<m)
					m=arr[i];
				
				if(arr[i]>maxx)
					maxx=arr[i];
		}
		System.out.println("Max "+maxx+", min "+m);
		
		String message = "Hello from the thread!";
		 Thread thread = new Thread(() -> System.out.println(message));
	        thread.start();
	}
}
