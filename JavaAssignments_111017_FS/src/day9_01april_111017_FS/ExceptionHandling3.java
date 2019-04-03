package day9_01april_111017_FS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int totalRunsScored, totalOversFaced;
		double currentRunRate;
		try {
			System.out.println("Enter the total runs scored");
			totalRunsScored = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the total runs scored");
			totalOversFaced = Integer.parseInt(br.readLine());
			
			if(totalOversFaced < 0 || totalOversFaced > 20) {
				throw new OverRangeException("Over is not in the specified range");
			}
			
			currentRunRate = totalRunsScored / totalOversFaced;
			System.out.print("Current run rate: ");
			System.out.print(String.format("%.2f", currentRunRate));
			
		} catch (ArithmeticException | NumberFormatException | IOException  e) {
			System.out.println(e);
		}  catch(OverRangeException e) {
			System.out.println(e);
		}
	}

}
