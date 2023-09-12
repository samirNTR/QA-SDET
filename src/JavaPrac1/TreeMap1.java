package JavaPrac1;
import java.util.*;

public class TreeMap1 {

    private TreeMap<Integer, String> records;

    public TreeMap1() {
        records = new TreeMap<>();
    }
    
    public void addRecord(int id, String name) {
        records.put(id, name);
    }

    public void printRecords() {
        for (Map.Entry<Integer, String> entry : records.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }

    public static void main(String[] args) {
        TreeMap1 treeMap1 = new TreeMap1();

        // Adding records
        treeMap1.addRecord(1, "Alice");
        treeMap1.addRecord(3, "Bob");
        treeMap1.addRecord(4, "Charlie");
        treeMap1.addRecord(2, "David");
        treeMap1.addRecord(5, "Eve");
        treeMap1.addRecord(6, "Frank");

        // Printing records
        treeMap1.printRecords();
    }
}
