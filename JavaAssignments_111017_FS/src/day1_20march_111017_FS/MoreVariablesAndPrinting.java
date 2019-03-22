package day1_20march_111017_FS;

public class MoreVariablesAndPrinting {
	public static final double IN_TO_CM = 2.54;
	public static final double LB_TO_KG = 0.453592;
	
	public static void main(String[] args) {
		String Name, Eyes, Teeth, Hair;
		int Age, Height, Weight;
		Name = "Zed A. Shaw";
		Age = 35; // not a lie
		Height = 74; // inches
		Weight = 180; // lbs
		Eyes = "Blue";
		Teeth = "White";
		Hair = "Brown";
		System.out.println( "Let's talk about " + Name + "." );
		System.out.println( "He's " + Height + " inches (or " + Height*IN_TO_CM + " cm) tall." );
		System.out.println( "He's " + Weight + " pounds (or " + Weight*LB_TO_KG + " kg) heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + Eyes + " eyes and " + Hair + "hair.");
		System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );
		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight + " I get " + (Age + Height + Weight) + "." );
		
		//3. No the left hand side must be a variable and a digit is not a valid variable name.
		//4. You can use a format specifier in println such as %.3f or you can use the DecimalFormat class.
		//5. This makes sense
	}
}
