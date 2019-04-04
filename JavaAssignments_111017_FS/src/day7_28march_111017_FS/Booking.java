package day7_28march_111017_FS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Booking {
	private long id;
	private String customerName;
	private int tableNumber;
	private Table table;
	private int membersPresent;
	private double amount;
	private Date bookingTime;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking(long id, String customerName, int tableNumber, int membersPresent, double amount, Date bookingTime) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.tableNumber = tableNumber;
		this.membersPresent = membersPresent;
		this.amount = amount;
		this.bookingTime = bookingTime;
	}

	public Booking(long id, String customerName, Table table, int membersPresent, double amount, Date bookingTime) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.table = table;
		this.membersPresent = membersPresent;
		this.amount = amount;
		this.bookingTime = bookingTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public int getMembersPresent() {
		return membersPresent;
	}

	public void setMembersPresent(int membersPresent) {
		this.membersPresent = membersPresent;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}
	
	static void createBooking(List<Table> tableList, List<Booking> bookingList, String line) throws NumberFormatException, ParseException {
		String[] tableData = line.split(",");
		boolean tableFound = false, alreadyBooked = false;
		Booking booked;
		Table tempTable = new Table();
		
		for(Table t : tableList) {
			if(Integer.parseInt(tableData[2]) == t.getNumber()) {
				tableFound = true;
				tempTable = t;
			}
		}
		
		if(tableFound) {
			for(Booking b : bookingList) {
				if(b.getTable().getNumber() == Integer.parseInt(tableData[2])) {
					alreadyBooked = true;
				}
			}
		}
		
		if(tableFound == false || alreadyBooked) {
			System.out.println("Sorry table is not available");
			Table[] tb = new Table[tableList.size()];
			int index = 0;
			
			for(Booking b : bookingList) {
				for(Table t : tableList) {
					if(t.getNumber() != b.getTable().getNumber()) {
						tb[index++] = t;
					}
				}
			}
			
			if(index > 0) {
				System.out.println("The available tables are:");
				System.out.format("%-5s %-10s %s\n","ID","Number","Capacity");
				for(int i = 0;i < index; i++) {
					System.out.println(tb[i]);
				}
			}
			
		} else {
			booked = new Booking(Long.parseLong(tableData[0]), tableData[1], tempTable, Integer.parseInt(tableData[3]), Double.parseDouble(tableData[4]), new SimpleDateFormat("dd-MM-yyyy").parse(tableData[5]));
			bookingList.add(booked);
			System.out.println("Table successfully booked");
		}
	}
	
	public static Map<Date,Double> calculateDayBilling(List<Booking> bookings) {
		Map<Date,Double> billList = new TreeMap<Date,Double>();
		Iterator<Booking> it = bookings.iterator();
		Booking b = new Booking();
		while (it.hasNext()) {
			b = it.next();
			if(billList.containsKey(b.getBookingTime())) {
				billList.replace(b.getBookingTime(), b.getAmount() + billList.get(b.getBookingTime()));
			} else {
				billList.put(b.getBookingTime(), b.getAmount());
			}
		}
		return billList;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
}
