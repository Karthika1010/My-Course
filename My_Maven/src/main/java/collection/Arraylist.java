package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arraylist {

	public static void main(String args[]) {
	ArrayList<String> l=new ArrayList<String>();
	l.add("Grapes");
	l.add("Orange");
	l.add("Apple");
	l.add("Watermelon");
	System.out.println("list:"+l);
	l.remove(1);
	Collections.sort(l);
	System.out.println("list"+l);
	System.out.println("list of for loop");
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	System.out.println("list of for eachloop");
	for(String element:l)
	{
		System.out.println(element);
	}
	System.out.println("list using Iterator");
	Iterator<String>it=l.iterator();
	
		while(it.hasNext())
		{
		System.out.println(it.next());
	}
		System.out.println("getting element");
		System.out.println(l.get(2));
		System.out.println("setting element");
		l.set(2, "greenapple");
		System.out.println(l);
	}
}
