package JavaPrac1;

import java.util.ArrayList;
import java.util.HashMap;

public class Myprac44 {

public static void main(String[] args)
{

	HashMap<Integer, String> hm = new HashMap<>();

	hm.put(1, "Apple");
	hm.put(2,"Orange");
	hm.put(3, "Potato");
	hm.put(4,"Vinegar");


	hm.forEach((key, value)->System.out.println(key+ " ->"+value));
//	------------------------------------------------------------------------------//

	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");

	        // Traversing and printing the ArrayList using lambda expression
	        list.forEach(item -> System.out.println(item));




	    }

}


	//hm.forEach(       (key,value)->sysout(key+"-->"+value);





