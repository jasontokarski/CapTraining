package day1_20march_111017_FS;

public class NumbersAndMath {
	public static void main(String[] args) {
		//This will output a string to the console
		System.out.println( "I will now count my chickens:" );
		//This will divide 30 by 6 and then add 25 to the result
		System.out.println( "Hens " + ( 25.0F + 30.0F / 6.0F ) );
		//25 * 3 has highest precedence and will have a result of 75
		//Next we will take 75 modulo 4 which gives us a remainder of 3
		//Finally we will subtract 3 from 100
		System.out.println( "Roosters " + ( 100.0F - 25.0F * 3.0F % 4.0F ) );
		System.out.println( "Now I will count the eggs:" ); 
		//This will take 4 modulo 2 which returns 0
		//Then we will divide 1 by 4 which will return .25
		//Then 3 + 2 + 1 - 5 will result with 1
		//We will then do 1 - 0 which is 1
		//Then 1 minus .25 is .75 and finally we add that to 6 resulting in 6.75
		System.out.println( 3.0F + 2.0F + 1.0F - 5.0F + 4.0F % 2.0F - 1.0F / 4.0F + 6.0F ); 
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		//This will return false because 5 is not less -2
		System.out.println( 3.0F + 2.0F < 5.0F - 7.0F );
		//This will concatenate 5 to the end of a string
		System.out.println( "What is 3 + 2? " + ( 3.0F + 2.0F ) );
		//This will concatenate -2 to the end of a string
		System.out.println( "What is 5 - 7? " + ( 5.0F - 7.0F ) );
		System.out.println( "Oh, that's why it's false." );
		System.out.println( "How about some more." );
		//This will return true because 5 is greater than -2
		System.out.println( "Is it greater? " + ( 5.0F > -2.0F ) );
		//This will return true because 5 is greater than or equal to -2
		System.out.println( "Is it greater or equal? " + ( 5.0F >= -2.0F ));
		//This will return false because 5 is not less than or equal to -2
		System.out.println( "Is it less or equal? " + ( 5.0F <= -2.0F ) );
		
		//2. A floating point number allows decimal arithmetic and more precise answers
		//4. The % operator is call modulus because it computes the modulo of two numbers
		//5. The % operator will return the remainder after division.
		//6. This determines the order your expressions will be evaluated depending on the operator.
		//7. Because the value after the decimal is truncated.
	}
}
