package day4_25march_111017_FS;

public class HotelRoom {
	String hotelName;
	int numberOfSqFeet;
	boolean hasTV;
	boolean hasWifi;
	
	public HotelRoom() {
		super();
	}
	
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff() {
		return this.numberOfSqFeet * this.getRatePerSqFeet();
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}
}
