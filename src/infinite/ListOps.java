package infinite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOps {

	public static void main(String[] args) {
//			
//			List<Integer> list=Arrays.asList(10,800,40,30,90,20);
//			
//			Integer a=list.stream().max(Integer::compareTo).get();
//			Integer b=list.stream().max((e1,e2)->e1.compareTo(e2)).get();

		// System.out.println(a+" "+b);

		List<Integer> list = Arrays.asList(2, 3, 4, 0, 8, 0, -1, 3);

		// Separate non-zero and zero elements
		List<Integer> result = Stream.concat(list.stream().filter(n -> n == 0),list.stream().filter(n -> n != 0))
				.collect(Collectors.toList());

		System.out.println(result);

	}
}
