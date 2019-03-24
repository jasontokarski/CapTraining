package day3_22march_111017_FS;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserMainCode {

	public static int getSumOfIntersection(int[] arr1, int[] arr2, int arrSize1, int arrSize2) {
		int sum = 0;
		
		//Swap our sizes and arrays if the first array is larger length
		if(arrSize1 < arrSize2) {
			int tempArr[] = arr1;
			arr1 = arr2;
			arr2 = tempArr;
			
			int temp = arrSize1;
			arrSize1 = arrSize2;
			arrSize2 = temp;
		}
		
		for(int i = 0; i < arrSize1; i++) {
			for(int j = 0; j < arrSize2; j++) {
				if(arr1[i] == arr2[j]) {
					sum = sum + arr1[i];
				}
			}
		}
		
		return sum;
	}
	
	public static void populateArray(int[] arr, int size) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
	}
	
	public static int getBigDiff(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		return largest - smallest;
	}
	
	public static int validateNumber(String phoneNum) {
	      if (Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phoneNum)) {
	    	  return 1;
	      } else {
	    	  return -1;
	      }
	}
	
	public static int validatePassword(String password) {
	    Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{6,20}$");
	    Matcher matcher = pattern.matcher(password);
	      if (matcher.matches()) {
	    	  return 1;
	      } else {
	    	  return -1;
	      }
	}
	
	public static int calculateElectricityBill(int prevReading, int curReading, int unitsPerCharge) {
		return (curReading - prevReading) * unitsPerCharge;
	}
}
