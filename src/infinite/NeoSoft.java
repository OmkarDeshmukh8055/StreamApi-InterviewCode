package infinite;

import java.util.stream.Collectors;

public class NeoSoft {

		public static void main(String[] args) {
			
			String str="Hello World";
			
			str.chars().mapToObj(e-> (char)e)
						.collect(Collectors.groupingBy(c->c,Collectors.counting()))
						.entrySet().stream()
						.filter(c-> c.getValue()>1)
						.forEach((e)-> System.out.println(e.getKey()+":"+e.getValue()));
			print(null);
		}
		
		static void print(Object a) {
			System.out.println("Obj "+a);
		}
		
		
}
