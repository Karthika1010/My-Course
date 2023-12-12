package collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Violet");
		list.add("Indigo");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		list.add("Orange");
		list.add("Red");
		System.out.println("list:"+list);
		System.out.println("The element at index 5 in the ArrayList is: " + list.get(5));
		System.out.println("list using Iterator");
		Iterator<String>it=list.iterator();
		
			while(it.hasNext())
			{
			System.out.println(it.next());
		}
			list.remove(3);
			System.out.println(list.contains("Blue"));
			 
	}
	

}
