package infinite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PlaneRoute {

	public static void main(String[] args) {
		
		
		 List<List<String>> asList = Arrays.asList(Arrays.asList("Latur","Ahemdabad"), Arrays.asList("Pune","Mumbai"),Arrays.asList("Delhi","Latur"),
												   Arrays.asList("Bangluru","Delhi"),Arrays.asList("Mumbai","Bangluru"));
		 //Pune , Mumbai, Bangluru, Delhi, Latur,Ahemdabad
		 
		 // sotre takeOff as a Key and land as a Value
		 HashMap<String, String> map=new HashMap<String, String>();
		 
		 //store only takeOff
		 List<String> takeOff=new ArrayList<String>();
		 
		 // store only land
			List<String> land=new ArrayList<String>();
			
		 for(List<String> a:asList) {
			 map.put(a.get(0), a.get(1));
			 takeOff.add(a.get(0));
			 land.add(a.get(1));
		 }
		
		 // to manage the route or insertion order
		 List<String> route=new ArrayList<String>();

		String start = map.entrySet().stream().map(e->e.getKey()).filter(e-> !land.contains(e)).collect(Collectors.joining());
		String end = map.entrySet().stream().map(e->e.getValue()).filter(e-> !takeOff.contains(e)).collect(Collectors.joining());
				
		route.add(start);

		String t=start;
		for (int i = 1; i < map.size(); i++) {
			
		if(	map.containsKey(t)) {
			route.add(map.get(t));
		t=map.get(t);
		}
		}
		route.add(end);
		
		System.out.println(route);
	}
}
