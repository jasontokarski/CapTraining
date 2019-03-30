package day4_25march_111017_FS;

public class DeliveryBO {
	public Delivery createDelivery(String data, Innings[] inningsList) {
		String[] deliveryData = data.split(",");
		Long deliveryNumber = Long.parseLong(deliveryData[0]);
		String batsman = deliveryData[1];
		String bowler = deliveryData[2];
		Long runs = Long.parseLong(deliveryData[3]);
		Long inningsNumber = Long.parseLong(deliveryData[4]);
		Delivery d = new Delivery();
		
		for(Innings i : inningsList) {
			if(inningsNumber.equals(i.getInningsNumber())) {
				d = new Delivery(deliveryNumber, batsman, bowler, runs, inningsNumber, i);
			}
		}
		
		return d;
	}
	
	public String findInningsNumber(Delivery[] deliveryList, long deliveryNumber) {
		String de = new String();
		for(Delivery d : deliveryList) {
			if(deliveryNumber == d.getDeliveryNumber()) {
				de = "Innings : " + d.getInningsNumber();
			}
		}
		return de;
	}
}
