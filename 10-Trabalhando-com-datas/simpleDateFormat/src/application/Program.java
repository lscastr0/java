package application;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		System.out.println("Data atual:" + sdf1.format(new Date()));
		System.out.println("Data e hora atual: " + sdf2.format(new Date()));
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(y2);
		cal.add(Calendar.HOUR_OF_DAY, 1);
		y2 = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println(sdf2.format(y2));
		System.out.println(minutes);
		
	}

}
