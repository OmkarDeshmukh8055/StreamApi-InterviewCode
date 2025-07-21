package infinite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfInt {

	public static void main(String[] args) {
		
		// Sum of int value
		List<Object> list = new ArrayList<>();
        list.add(10);
        list.add("Test");
        list.add(101);
        list.add(2);
        list.add(33);
        list.add("AAAA");


int sum = list.stream().filter(ele->ele instanceof Integer).mapToInt(ele->(Integer)ele*2).sum();

System.out.println(sum);


// Frequency Of each WORD note: not char
String str = "I am Omkar and I am the programmer";

Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s,Collectors.counting())).forEach((k,v)->System.out.println(k+"="+v));


	}
}
