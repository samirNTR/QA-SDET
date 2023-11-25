package Testing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        // Input date string
        String inputDate = "8-04-2022";

        // Parse the input string to LocalDate using a formatter
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);

        // Format LocalDate to the desired output format
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        String formattedDate = date.format(outputFormatter);

        // Print the formatted date
        System.out.println(formattedDate);
    }
}
