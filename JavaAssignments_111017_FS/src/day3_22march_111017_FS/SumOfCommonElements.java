package day3_22march_111017_FS;

import java.util.Scanner;

public class SumOfCommonElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size1 = 0, size2 = 0;
		size1 = scan.nextInt();
		size2 = scan.nextInt();
		int[] arr1 = new int[size1]; 
		int[] arr2 = new int[size2];
		UserMainCode.populateArray(arr1, size1);
		UserMainCode.populateArray(arr2, size2);
		
		int sum = UserMainCode.getSumOfIntersection(arr1, arr2, size1, size2);
		if(sum > 0) {
			System.out.println(sum);
		} else {
			System.out.println("No common elements");
		}
	}
}
