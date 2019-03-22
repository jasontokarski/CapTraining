package day1_20march_111017_FS;

public class YourInitials {
	public static final int NUM_ROWS = 7;
	public static void main(String[] args) {
		String[] myInitials = new String[NUM_ROWS];
		System.out.print("For the name Jason Anthony Tokarski...");
		myInitials[0] = "JJJJJ   A   TTTTT";
		myInitials[1] = "  J    A A    T  ";
		myInitials[2] = "  J   A   A   T  ";
		myInitials[3] = "  J   AAAAA   T  ";
		myInitials[4] = "J J   A   A   T  ";
		myInitials[5] = "J J   A   A   T  ";
		myInitials[6] = " JJ   A   A   T  ";
		for(int i = 0; i < NUM_ROWS; i++) {
			System.out.println(myInitials[i]);
		}
	}
}
