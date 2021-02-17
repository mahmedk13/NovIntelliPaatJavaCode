package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<Integer>();
        
        set.add(13); //0 hashcode
        set.add(42); //1
        set.add(45); //2
        set.add(12); //3
       
        
        //switching to windows
        //insertion order is not maintained
        //number--> each item in my set
        
        //enhanced for loop
        //java 1.5
        for(Integer number : set){
            System.out.println(number);
        }
        
        
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        
        
    }

}
