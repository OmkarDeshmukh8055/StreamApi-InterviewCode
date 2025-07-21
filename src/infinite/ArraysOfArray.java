package infinite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArraysOfArray {

	public static void main(String[] args) {
		
		String[][] cityRoutes = {
			    {"Latur", "Ahemdabad"},
			    {"Pune", "Mumbai"},
			    {"Delhi", "Latur"},
			    {"Bangluru", "Delhi"},
			    {"Mumbai", "Bangluru"}
			};

		HashMap<String, String> map=new HashMap<String, String>();
		
		for(String[] str: cityRoutes) {
			
			map.put(str[0], str[1]);
		}
		System.out.println(map);
		
		
		
		
	}
}
