package JavaPrac1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeData 

{

	public static void main(String[] args)
	
	{
		Map<String,String> employees= new LinkedHashMap<String,String>();
		employees.put("SAMIR","Manager");
		employees.put("SANJAY","Sr Manager");
		employees.put("SACHIN","QA");
		
		
		for(Map.Entry<String, String> es:employees.entrySet())
		{
			
			System.out.println(es.getKey()+"->"+es.getValue());
		}
		
		
		

	}

}
