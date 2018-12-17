public class apples {
	private String name;
	private String address;
	private String city;
	private int day;
	private int month;
	private int year;
	
	public apples(String name) {
		this.name = name;
		System.out.printf("Your name is %s\n", returnName());
	}
	public apples(String address, String city) {
		this.address = address;
		this.city = city;
		System.out.printf("Your address is %s\n", this);
	}
	public apples(String name, int month, int day, int year) {
		this.day = day;
		this.name = name;
		this.month = month;
		this.year = year;
		System.out.printf("%s's birthday is %s\n", returnName(), birthday());
	}
	public String birthday() {
		return String.format("%d/%d/%d", month, day, year);
	}
	public String returnName() {
		return String.format("%s", name);
	}
	public String toString() {
		return String.format("%s, %s", address, city);
	}
}
