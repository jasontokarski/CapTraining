package day1_20march_111017_FS;

public class VariablesAndNames {
	public static void main(String[] args) {
		//Declare integer variables
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		//Declare double variables
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		//Initialize the variables with values
		cars = 100;
		space_in_a_car = 4.0;
		drivers = 30;
		passengers = 90;
		//Do calculations and save the result in a variable
		cars_not_driven = cars - drivers;
		cars_driven = drivers;
		carpool_capacity = cars_driven * space_in_a_car;
		average_passengers_per_car = passengers / cars_driven;
		//Output all the values to the console.
		System.out.println( "There are " + cars + " cars available." );
		System.out.println( "There are only " + drivers + " drivers available." );
		System.out.println( "There will be " + cars_not_driven + " empty cars today." );
		System.out.println( "We can transport " + carpool_capacity + " people today." );
		System.out.println( "We have " + passengers + " to carpool today." );
		System.out.println( "We need to put about " +
		average_passengers_per_car + " in each car." );
		
		//1. The floating point decimal is not required, it will result in the same answer because the final result is not a fraction.
		//2. A floating point number is a number with decimal and a certain amount of precision.
		//3. The = operator is the assignment operator, it stores a value into a variable on the left side of the operand
		//4. The == is the equals operator and it returns a boolean value depending if both values on the left and right sides of the operand are the same.
	}
}
