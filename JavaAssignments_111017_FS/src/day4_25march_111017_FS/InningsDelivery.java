package day4_25march_111017_FS;

import java.util.Scanner;

public class InningsDelivery {

	public static void main(String[] args) {
		System.out.println("Enter the number of innings");
		Scanner scan = new Scanner(System.in);
		int numInnings = scan.nextInt();
		Innings[] iArr = new Innings[numInnings];
		
		InningsBO ibo = new InningsBO();
		for(int i = 0; i < numInnings; i++) {
			System.out.println("Enter innings " + (i+1) + " details");
			Innings in = ibo.createInnings(scan.next());
			iArr[i] = in;
		}
		
		System.out.println("Enter the number of innings");
		int numDeliveries = scan.nextInt();
		Delivery[] dArr = new Delivery[numDeliveries];
		DeliveryBO dbo = new DeliveryBO();
		
		for(int i = 0; i < numDeliveries; i++) {
			System.out.println("Enter delivery " + (i+1) + " details");
			String deliveryData = scan.next();
			Delivery de = dbo.createDelivery(deliveryData, iArr);
			dArr[i] = de;
		}
		
		System.out.println("Enter the delivery number for which you need to find the innings number");
		Long deliveryNum = scan.nextLong();
		String inningsNum = dbo.findInningsNumber(dArr, deliveryNum);
		System.out.println(inningsNum);
		scan.close();
	}

}
