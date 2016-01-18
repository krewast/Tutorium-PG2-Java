package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class program {

	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		
		// Definition eines Datumsformates
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		System.out.println(sdf.format(today));
		
		// oder z.B... (mehr hier: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
		
		SimpleDateFormat sdf_day = new SimpleDateFormat("E dd/M/yyyy");
		System.out.println(sdf_day.format(today));
		
		
		// Was können wir mit Date machen?
		
		// 1. String -> Date
		String dateInString = "31/8/1982 10:20:56";
		Date new_date = sdf.parse(dateInString);
		System.out.println(new_date);
		
		// 2. Calendar -> Date
		Calendar calendar = Calendar.getInstance();
		Date calendar_instance = calendar.getTime();
		
		
		// Was können wir mit Calendar machen? ALLES andere
		
		System.out.println("NEUER Calendar");
		// IMMER GregorianCalendar verwenden
		Calendar greg_cal = new GregorianCalendar(2015,0,31);
		
		// aktuelle Zeit von Kalender ausgeben
		String string_calendar = sdf.format(greg_cal.getTime());
		System.out.println("cal \t\t: " + string_calendar);
		
		// Bestimmte Zeiten bekommen
		int year       = greg_cal.get(Calendar.YEAR);
		System.out.println("year \t\t: " + year);
		
		// Zwei Monate hinzufügen
		greg_cal.add(Calendar.MONTH, 2);
		System.out.println("Plus 2 Monate \t\t: " + sdf.format(greg_cal.getTime()));
		
		// 10 Tage abziehen
		greg_cal.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Minus 10 Tage \t\t: " + sdf.format(greg_cal.getTime()));

	}

}
