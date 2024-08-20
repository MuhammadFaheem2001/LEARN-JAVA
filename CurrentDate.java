package Practice;

import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Date : " + date);
		System.out.println("Date : " + date.getDate());
		System.out.println("Day : " + date.getDay());
		
		System.out.println("Hour : " + date.getHours());
		System.out.println("Minute : " + date.getMinutes());
		System.out.println("Month : " + date.getMonth());
		date.setMonth(5);
		
		System.out.println("TimeZone : " + date.getTimezoneOffset());
		System.out.println("Year : " + date.getYear());

	}

}
