package dataAge;

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

public class DataAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize today's data, birthday and scanner
		LocalDate today = LocalDate.now();
		LocalDate birth;
		Scanner sc = new Scanner(System.in);

		// ask the user to input the birthday in the format
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			System.out.println("Enter your Birthday (yyyy/MM/dd)");
			String date = sc.nextLine();
			birth = LocalDate.parse(date, formatter);
		} catch (DateTimeParseException exc) {
			System.out.printf("%s is not parsable! Enter the date in yyyy/mm/dd:%n");
			throw exc;
		}

		// calculate period and days between now and then
		Period p = Period.between(birth, today);
		long p2 = ChronoUnit.DAYS.between(birth, today);
		System.out.println("It has been " + p2 + " days since you were born.\n" + "You are " + p.getYears() + " years, "
				+ p.getMonths() + " months, and " + p.getDays() + " days old.");
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
