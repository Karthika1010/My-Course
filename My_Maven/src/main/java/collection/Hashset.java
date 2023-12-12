package collection;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet();  
        set.add("cat");    
        set.add("elephant");    
        set.add("monkey");   
        set.add("dog");  
        set.add("donkey");  
        Iterator<String>i=set.iterator();  
        while(i.hasNext())
        {  
            System.out.println(i.next());  
            }  
        System.out.println("hashset:"+set);
    	set.remove(1);
    	System.out.println(set.size());
    	
	}
	}


