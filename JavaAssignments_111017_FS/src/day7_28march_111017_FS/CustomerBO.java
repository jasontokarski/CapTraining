package day7_28march_111017_FS;

public class CustomerBO {	
	public String[] clearSpaces(String[] data) {
		for(int i = 0; i < data.length; i++) {
			data[i] = data[i].replaceAll("\\s+","");
		}
		return data;
	}
}
