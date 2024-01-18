package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list= new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("apple");
		list.add("guava");
		list.add("orange");
		list.add("banana");
		
		System.out.println("The original list is "+list);
		
		Set<String> uniqueValues= new LinkedHashSet<String>(list);
			
		System.out.println("Unique list is "+uniqueValues);
		
		System.out.println("Duplicate values are: ");
		
		for(Object item: uniqueValues)
		{
			if(Collections.frequency(list,item)>1)
			{
				System.out.println(item);
			}
		}
		
		
		
		

	}

}
