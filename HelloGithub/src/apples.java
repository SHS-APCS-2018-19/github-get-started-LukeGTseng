public class apples {
	private String name;
	private String address;
	private String city;
	private int day;
	private int month;
	private int year;
	private static int addresses = 0;
	
	public apples(String name, String address, String city, int month, int day, int year) {
		this.name = name;
		this.address = address;
		addresses++;
		this.city = city;
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.printf("The person's name is %s\n", getName());
		System.out.printf("%s's address is %s\n", getName(), getAddress());
		System.out.printf("%s's birthday is %s\n", getName(), getBirthday());
		System.out.printf("Addresses: %d\n", getAddresses());
		
	}
	public String getBirthday() {
		return String.format("%d/%d/%d", month, day, year);
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return String.format("%s, %s", address, city);
	}
	public int getAddresses() {
		return addresses;
	}
}
