package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		c.set(116, 4 , 19 , 23, 59 ,30);
		
		Date dateMai16 = c.getTime();
		SimpleDateFormat formateurDate = new SimpleDateFormat("dd/MM/yyyy");
		
		
		String dateMai16Form = formateurDate.format(dateMai16);
		System.out.println(dateMai16Form);	
		
		
		Calendar c1 = Calendar.getInstance();
		Date date1 = c1.getTime();
		SimpleDateFormat formateurDateHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String date1Form = formateurDateHeure.format(date1);
		System.out.println(date1Form);
		
		SimpleDateFormat formatFr = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss" , Locale.FRENCH);
		System.out.println(formatFr.format(date1));
		
		SimpleDateFormat formatRu = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss" , new Locale("ru", "RU"));
		System.out.println(formatRu.format(date1));
		
		SimpleDateFormat formatCn = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss" , Locale.CHINESE);
		System.out.println(formatCn.format(date1));
		
		SimpleDateFormat formatDe = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss" , Locale.GERMANY);
		System.out.println(formatDe.format(date1));
		
	}

}
