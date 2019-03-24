package day3_22march_111017_FS;

import java.util.Scanner;

public class DiffBetweenSmallestAndLargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 0;
		size = scan.nextInt();
		
		int[] arr1 = new int[size];
		UserMainCode.populateArray(arr1, size);
		
		System.out.println(UserMainCode.getBigDiff(arr1));
	}

}
