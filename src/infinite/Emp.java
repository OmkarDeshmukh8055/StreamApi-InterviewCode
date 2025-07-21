package infinite;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Emp {

	int id;
	String name;
	int salary;

	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<Emp> emp = Arrays.asList(new Emp(1, "Omkar", 200000), new Emp(1, "Omkar", 200000),
				new Emp(2, "Sham", 100000), new Emp(1, "Omkar", 200000), new Emp(3, "Somu", 120000),
				new Emp(1, "Omkar", 220000), new Emp(3, "Somu", 120000));
//		List<Emp> sortedDesc = emp.stream()
//			    .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
//			    .collect(Collectors.toList());
//		sortedDesc.forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));
			
//		Collections.sort(emp,Comparator.comparing(Emp::getSalary).reversed());
//		System.out.println(emp);
//		for(Emp e : emp) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
//		}

		
//		emp = emp.stream().distinct()
//			    .sorted(Comparator.comparingInt(Emp::getSalary)
//			    .thenComparing(Emp::getName)
//			    .reversed()) // This reverses the WHOLE chain!
//			    .collect(Collectors.toList());
//		
//		for(Emp e : emp) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
//		}
		
//		List<Integer> list=Arrays.asList(-1,-2);
//		Optional<Integer> max2=list.stream().filter(e->e!=list.stream().max(Integer::compareTo).get()).max(Integer::compareTo);
//		System.out.println(max2);
		
//		String str="abcbacabc";
//		
//		Map<Character,Long> map=str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e->e,Collectors.counting()));
//		
//		str=str.chars().sorted().mapToObj(e-> String.valueOf((char)e)).collect(Collectors.joining());
//		System.out.println(str);
		
	String str="Omkar A Deshmukh";
	
	String s=IntStream.range(0, str.length()).mapToObj(c->String.valueOf((char)str.charAt(str.length()-1-c))).collect(Collectors.joining());
	System.out.println(s);
	
//		String str1=new StringBuffer(str).reverse().toString();
//		System.out.println(str1);
//		String collect = Arrays.stream(str.split(" ")).map(s->new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
//		System.out.println(collect);
//		
//		String reverse = IntStream.range(0, str.length())
//		        .mapToObj(i -> String.valueOf(str.charAt(str.length() - i - 1)))
//		        .collect(Collectors.joining());
//		
//		System.out.println(reverse);
//	
	
emp.stream().sorted(Comparator.comparingInt(Emp::getSalary)).forEach(e->System.out.print(e.getName()+" "+e.getSalary()));
		}

}
