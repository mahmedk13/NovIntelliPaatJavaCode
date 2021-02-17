package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("BMW");
		list1.add("Mercedez");
		list1.add("BMW");
		
		//Object class is superclass of String, Integer
		list.add("BMW"); //first 0
		list.add("Mercedez");
		list.add("Honda"); //last 2
		
		
//		System.out.println(list);
//		
//		//for each loop
//		
//		for(String car: list) {
//			System.out.println(car);
//		}
//		
//		//iterator
//		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println(list.get(0));
		System.out.println(list.contains("Maruti"));
		System.out.println(list.equals(list1));
		System.out.println(list.indexOf("BMW"));
		System.out.println(list.lastIndexOf("BMW"));
//		System.out.println(list.remove(0));
//		System.out.println(list.remove("Mercedez"));
		list.add(0, "Maruti");
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		
		//java 1.0
		//list has 10 elements
		for(int i=0; i<list.size()-4; i++) { //i<10 -->0-9, i<6--> 0-5
			System.out.println(list.get(i));
		}

		
		

	}

}
