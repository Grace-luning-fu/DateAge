package dateAge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * This is an application to calculate your age and how many days between then
 * and current time.
 * 
 * @author Grace
 * 
 */

public class DateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize today's data, birthday and scanner
		LocalDate today = LocalDate.now();
		LocalDate birth = null;
		Scanner sc = new Scanner(System.in);
		
		//prompt for input
		System.out.println("Enter your Birthday (yyyy/MM/dd)");
		String date = sc.nextLine();
		//define the formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		// ask the user to input the birthday in the format
		try {
			birth = LocalDate.parse(date, formatter);
		} catch (DateTimeParseException e) {
			System.out.println("Enter the date in yyyy/mm/dd:");
		}

		// calculate period and days between now and then
		Period age = Period.between(birth, today);
		long days = ChronoUnit.DAYS.between(birth, today);
		System.out.println("It has been " + days + " days since you were born.\n" + "You are " + age.getYears() + " years, "
				+ age.getMonths() + " months, and " + age.getDays() + " days old.");
	}

}

/**
 * Test result:
 * 
 * Enter your Birthday (yyyy/MM/dd) 1990/10/10 It has been 9792 days since you
 * were born. You are 26 years, 9 months, and 22 days old.
 *
 *
 */
