package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOfMapsExample {
    public static void main(String[] args) {

        Map<String, Map<String, String>> myData = new LinkedHashMap<>();

        Map<String, String> hm = new LinkedHashMap<>();
        Map<String, String> hm1 = new LinkedHashMap<>();

        hm.put("City", "Delhi");
        hm.put("Hobbies", "Reading");

        hm1.put("City", "Jaipur");
        hm1.put("Hobbies", "Running");

        myData.put("Samir", hm);
        myData.put("Sanjay", hm1);

        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter name (Samir or Sanjay):");
            String name = scanner.nextLine();

            String hobbies = "";
            String city = "";

            if (myData.containsKey(name)) {
                Map<String, String> personData = myData.get(name);
                hobbies = personData.get("Hobbies");
                city = personData.get("City");

                System.out.println("Details of " + name + ":");
                System.out.println("City: " + city);
                System.out.println("Hobbies: " + hobbies);
            } else {
                System.out.println("Details not found for " + name);
            }

            System.out.println("Do you want to continue? (y/n):");
            choice = scanner.nextLine();
        }

        System.out.println("Program ended. Thank you!");
        scanner.close();
    }
}
