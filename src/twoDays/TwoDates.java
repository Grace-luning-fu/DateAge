package twoDays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * This is an application to calculate difference in dates between
 * two dates
 * 
 * @author Grace
 * 
 */

public class TwoDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize date1, date2, formatter and scanner
		Date date1 = new Date();
		Date date2 = new Date();
		SimpleDateFormat sdateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first date (MM/dd/yyyy): ");
		try {
			date1 = sdateFormat.parse(sc.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.print("Enter the second date (MM/dd/yyyy): ");
		try {
			date2 = sdateFormat.parse(sc.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// find the absolute difference in millisecond (the order of the two dates
		// doesn't matter)
		long diff = Math.abs(date2.getTime() - date1.getTime());
		// using TimeUnit to convert milliseconds to days
		int days = (int) TimeUnit.MILLISECONDS.toDays(diff);

		// display the difference
		System.out.printf("The difference in days between two dates is %d days", days);
		
		//close the scanner
		sc.close();

	}

}
