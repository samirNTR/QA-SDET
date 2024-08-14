package Testing;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_Example {

	public static void main(String[] args) {
		
		Calendar cal= Calendar.getInstance();
		
		SimpleDateFormat sd= new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		
		System.out.println(cal.DAY_OF_MONTH);
		System.out.println(cal.DAY_OF_WEEK);
		System.out.println(cal.DAY_OF_WEEK_IN_MONTH);
		
		
		// TODO Auto-generated method stub

	}

}
