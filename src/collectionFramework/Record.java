package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Record {
    private List<Map<String, String>> records;

    // Constructor to initialize the List
    public Record() 
    {
        records = new ArrayList<>();
    }

    // Method to add a record to the List
    public void addRecord(String key, String value)
    {
        Map<String, String> record = new HashMap<>();
        record.put(key, value);
        records.add(record);
    }

    // Method to fetch all records
    public List<Map<String, String>> getAllRecords() 
    {
        return records;
    }



    public static void main(String[] args) {
        // Create an instance of the Record class
        Record recordHandler = new Record();

        // Add records using the addRecord method
        recordHandler.addRecord("Name", "John");
        recordHandler.addRecord("Age", "25");
        recordHandler.addRecord("City", "New York");
        recordHandler.addRecord("Name", "Sonu");
        recordHandler.addRecord("Age", "30");
        recordHandler.addRecord("City", "New Delhi");

        // Fetch all records
        List<Map<String, String>> allRecords = recordHandler.getAllRecords();

        // Display all records
        for (Map<String, String> record : allRecords) 
        {
            for (Map.Entry<String, String> entry : record.entrySet()) 
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("-----------");
        }
    }
}
