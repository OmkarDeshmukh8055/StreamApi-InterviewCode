package interivew;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Find1stNonRepetingChar {

	public static void main(String[] args) {
		
		String str="aabcbcdccb";
		
		Character unique = str.chars()
			.mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
			.entrySet()
			.stream()
			.filter(c->c.getValue()==1)
			.map(Map.Entry::getKey)
			.findFirst()
			.orElse(null);
		
		System.out.println(unique);
	}
}
