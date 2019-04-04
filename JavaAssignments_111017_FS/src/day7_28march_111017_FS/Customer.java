package day7_28march_111017_FS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer> {
	private Long id;
	private String name;
	private String mobileNumber;
	private Date birthdate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private Date dateEnrolled;
	private Double rating;
	
	public Customer() {
		super();
	}
	
	public Customer(Long id, String name, String mobileNumber, Date birthdate, Double averageSpendAmount,
			Double totalAmount, Date dateEnrolled, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public Double getAverageSpendAmount() {
		return averageSpendAmount;
	}
	
	public void setAverageSpendAmount(Double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Date getDateEnrolled() {
		return dateEnrolled;
	}
	
	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	
	public Double getRating() {
		return rating;
	}
	
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return "Id: " + this.id + "\nName: " + this.name + "\nMobile Number: " + this.mobileNumber + "\nDate of Birth: " + new SimpleDateFormat("MM-dd-yyyy").format(this.birthdate) + "\nTotal amount: " + this.totalAmount + "\nDate Enrolled: " + new SimpleDateFormat("MM-dd-yyyy").format(this.dateEnrolled) + "\nRating: " + this.rating;
	}
	
	public String toString2() {
		return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", this.id, this.name, this.mobileNumber, new SimpleDateFormat("MM-dd-yyyy").format(this.birthdate), this.averageSpendAmount, this.totalAmount, new SimpleDateFormat("MM-dd-yyyy").format(this.dateEnrolled), this.rating);
	}
	
	public boolean equals(Object obj) {
		Customer other = (Customer)obj;
		
		if(this.name.equals(other.name) && this.mobileNumber.equals(other.mobileNumber) && this.birthdate.equals(other.birthdate)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Customer o) { 
		return this.name.compareTo(o.getName());
	}
}
