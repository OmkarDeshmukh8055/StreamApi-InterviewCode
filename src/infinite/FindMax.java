package infinite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMax {
	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(10,20,20,30, 20, 40, 80, 10, 30); // 80

//		Integer r=list.stream().max((a,b)->a-b).get();
//		
//		Integer r1=list.stream().min((a,b)->a-b).get();
//		System.out.println(r1);
//		int r=list.stream().mapToInt(e->e).max().getAsInt();
//		int r=list.stream().mapToInt(e->e).min().getAsInt();
//		System.out.println(r);
//		Map<Integer,Long>map=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
//		System.out.println(map);
//		list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
//			.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
		List<Object> list = Arrays.asList(10,20,20,"Omar","Lala",30, 20, 40, 80, 10, 30,"Lala"); // 80
		
		list.stream().distinct().filter(e->e instanceof String).forEach(e->System.out.println(e));
String a="Om" , b="Deshmukh";

String a1=Stream.concat(a.chars().mapToObj(e->String.valueOf((char)e)), b.chars().mapToObj(e->String.valueOf((char)e))).collect(Collectors.joining());
System.out.println(a1);

List<Integer> list1 = Arrays.asList(10,9,20,11); // 80


list1=Stream.concat(list1.stream().filter(e->e%2!=0), list1.stream().filter(e->e%2==0)).collect(Collectors.toList());
System.out.println(list1);

System.out.println("----------------------Sort on the basis of Value-------------------------------------------");
HashMap<Integer, Integer> map=new HashMap<>();
map.put(1,10);
map.put(2,30);
map.put(3,20);
map.put(4,50);


Map<Integer, Integer> sortedMap = map.entrySet()
.stream()
.sorted(Map.Entry.comparingByValue()) // or comparingByKey()
.collect(Collectors.toMap(
    Map.Entry::getKey,
    Map.Entry::getValue,
    (e1, e2) -> e1,
    LinkedHashMap::new
));

System.out.println(sortedMap);

	}
}
