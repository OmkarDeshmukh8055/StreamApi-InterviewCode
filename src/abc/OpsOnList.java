package abc;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OpsOnList {

	public static void main(String[] args) {
//		
//		  try {
//	             int a = 5 / 0; //
//	        } catch (Exception e) {
//	            System.out.println("Exception caught");
//	        } catch (ArithmeticException e) {  
//	            System.out.println("ArithmeticException caught");
//	        }

		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 1, 1, 2 };
			
		System.out.println("Unique element only");
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).forEach(e -> System.out.print(e.getKey() + " "));
		
		System.out.println("\nRemove  Duplicate");
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(e -> System.out.print(e.getKey() + " "));

	}
}
