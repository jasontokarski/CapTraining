package day7_28march_111017_FS;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	public static Boolean validateAge(java.util.Date birth) {
		Calendar birthdate = new GregorianCalendar();
		Calendar currentDate = new GregorianCalendar();
		birthdate.setTime(birth);
		int birthYear = birthdate.get(Calendar.YEAR);
		int birthMonth = birthdate.get(Calendar.MONTH) + 1;
		int birthDay = birthdate.get(Calendar.DAY_OF_MONTH);
		int currentYear = currentDate.get(Calendar.YEAR);
		int currentMonth = currentDate.get(Calendar.MONTH) + 1;
		int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
		int age = currentYear - birthYear;
		if (currentMonth < birthMonth) {
			age--;
		} else if (currentMonth == birthMonth) {
			if (currentDay < birthDay) {
				age--;
			}
		}

		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean validateName(String name) {
		return (!name.equals("")) && (name != null) && (name.matches("^[a-zA-Z]*$"));
	}

	public static Boolean validateLuckyCustomer(String mobile) {
		long mobileNum = Long.parseLong(mobile);

		while (mobileNum > 9) {
			mobileNum = sumOfDigits(mobileNum);
		}

		if (mobileNum == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static long sumOfDigits(long n) {
		long sum = 0;
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}
}
