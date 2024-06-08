package Testing;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormat {
	public static void main(String[] args) {
		// Input date string

		Date d = new Date();
	
		String inputDate = "18-04-2022";
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/M/yyyy");
		SimpleDateFormat sd= new SimpleDateFormat("dd/M/yyyy  HH:mm:ss");
		
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		System.out.println(sd.format(d));

		// Parse the input string to LocalDate using a formatter
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputDate, inputFormatter);

		// Format LocalDate to the desired output format
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = date.format(outputFormatter);

		// Print the formatted date
		System.out.println(formattedDate);
	}
}
