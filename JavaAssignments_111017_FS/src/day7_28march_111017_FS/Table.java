package day7_28march_111017_FS;

public class Table implements Comparable<Table> {
	private long id;
	private int number;
	private int capacity;
	
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Table(long id, int number, int capacity) {
		super();
		this.id = id;
		this.number = number;
		this.capacity = capacity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String toString() {
		return String.format("%-5s %-10s %s\n",this.id,this.number,this.capacity);
	}
	
	public int compareTo(Table t) {
		 if(this.number > t.getNumber()) {
			 return 1;
		 } else if(this.number < t.getNumber()) {
			 return -1;
		 } else {
			 return 0;
		 }
	}
 
	public static Table createTable(String line) {
		String[] tableData = line.split(",");
		Table t = new Table(Long.parseLong(tableData[0]), Integer.parseInt(tableData[1]), Integer.parseInt(tableData[2]));
		return t;
	}
}
