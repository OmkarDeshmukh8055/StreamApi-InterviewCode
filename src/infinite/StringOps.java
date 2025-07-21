package infinite;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StringOps {

	public static void main(String[] args) {
		
		String str="abcabcfabc";
		
		String s=str.chars().distinct().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(s);
		//		String str = "aabbbccccaeee"; // 2a3b4c1a3e
//		String str1 = "";
//		
//		for (int i = 0; i < str.length(); i++) {
//
//			int cnt = 0;
//			
//			for (int j = i; j < str.length(); j++) {
//				
//				if (str.charAt(j) == str.charAt(i)) {  
//					cnt += 1;
//				} else {
//					break;
//				}
//			}
//			i=i+cnt-1;
//			str1 = str1 + cnt + str.charAt(i);
//
//		}
//		System.out.println(str1);
//		
//		
//		Supplier<Integer> s=() -> {return print();};
//		
//		Integer object = s.get();
//		System.out.println(object);
//	}
//	
//	static Integer print() {
//		
//		return new Random().nextInt();
	}
}
