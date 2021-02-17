package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(123, "John");
		studentMap.put(124, "Mike");
		studentMap.put(128, "Ben");
		studentMap.put(125, "Mike");
		studentMap.put(126, null);
		studentMap.put(127, null);
		
		studentMap.replace(123, "John sr");

		

		//java 8
		studentMap.forEach((k,v)->System.out.println(k+" : "+v));
		
		
		for(Map.Entry<Integer, String> m: studentMap.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		
		
	}

}
