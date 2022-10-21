package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
	
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formateur.format(date);
		
		System.out.println(dateFormatee);
		
		Date dateMai16 = new Date(116, 4 , 19 , 23, 59 ,30);
		SimpleDateFormat formateurDateHeure = new SimpleDateFormat("EEEE yyyy/MM/dd HH:mm:ss");
		
		String dateMai16Form = formateurDateHeure.format(dateMai16);
		System.out.println(dateMai16Form);		
	}
}
