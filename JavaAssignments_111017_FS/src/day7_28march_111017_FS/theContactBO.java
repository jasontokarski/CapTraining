package day7_28march_111017_FS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class theContactBO {
	
	public static List<Customer> customerResults = new ArrayList<Customer>();
	
	public static Customer createCustomer(String line) throws ParseException {
		String[] details = line.split(",");
		Date birthdate = new SimpleDateFormat("dd-MM-yyyy").parse(details[3]);
		Date enrollDate = new SimpleDateFormat("dd-MM-yyyy").parse(details[6]);
		Customer c = new Customer(Long.parseLong(details[0]),details[1],details[2],birthdate,Double.parseDouble(details[4]),Double.parseDouble(details[5]),enrollDate,Double.parseDouble(details[7]));
		return c;
	}
	
	public static List<Customer> findCustomer(List<Customer> customerList, String name) {
		for(Customer c : customerList) {
			if(c.getName().equals(name)) {
				customerResults.add(c);
			}
		}
		return customerResults;
	}
	
	public static List<Customer> findCustomer(List<Customer> customerList, Date birth) {
		for(Customer c : customerList) {
			if(c.getBirthdate().equals(birth)) {
				customerResults.add(c);
			}
		}
		return customerResults;
	}
	
	public static List<Customer> findCustomer(List<Customer> customerList, Double rating) {
		for(Customer c : customerList) {
			if(c.getRating().equals(rating)) {
				customerResults.add(c);
			}
		}
		return customerResults;
	}
}
