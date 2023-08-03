package collectionFramework;

	import java.util.HashMap;

	class MyEmployee {
	    private String key;
	    private String value;

	    public MyEmployee(String key, String value) 
	    {
	        this.key = key;
	        this.value = value;
	    }

	    public String getKey() {
	        return key;
	    }

	    public String getValue() {
	        return value;
	    }
	}

	public class HashMap1 {
	    public static void main(String[] args) {
	        // Create the custom key-value pairs using the constructor
	        MyEmployee pair1 = new MyEmployee("name", "John");
	        MyEmployee pair2 = new MyEmployee("age", "30");
	        MyEmployee pair3 = new MyEmployee("city", "New York");

	        // Create a HashMap and add the key-value pairs
	        HashMap<String, String> dataMap = new HashMap<>();
	        dataMap.put(pair1.getKey(), pair1.getValue());
	        dataMap.put(pair2.getKey(), pair2.getValue());
	        dataMap.put(pair3.getKey(), pair3.getValue());

	        // Retrieve data from the HashMap
	        String name = dataMap.get("name");
	        String age = dataMap.get("age");
	        String city = dataMap.get("city");

	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("City: " + city);
	    }
	}



