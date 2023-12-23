package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {

    public static void main(String[] args) {
        // Creating a List of Maps to store table data
        List<Map<String, String>> tableData = new ArrayList<>();

        // Adding rows (each row as a Map) to the List
        Map<String, String> row1 = new HashMap<>();
        row1.put("Name", "Alice");
        row1.put("Age", "25");
        row1.put("City", "New York");
        tableData.add(row1);

        Map<String, String> row2 = new HashMap<>();
        row2.put("Name", "Bob");
        row2.put("Age", "30");
        row2.put("City", "London");
        tableData.add(row2);

        Map<String, String> row3 = new HashMap<>();
        row3.put("Name", "Charlie");
        row3.put("Age", "28");
        row3.put("City", "Paris");
        tableData.add(row3);

        // Displaying the stored table data
        for (Map<String, String> row : tableData) 
        {
            System.out.println("Row Data:");
            for (Map.Entry<String, String> entry : row.entrySet()) 
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("-------------");
        }
    }
}
