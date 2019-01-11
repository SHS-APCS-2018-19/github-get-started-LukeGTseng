
public class Truck extends Vehicle {
	static int increment = 2;
	static String licensePlateTruck = "T" + increment;
	public Truck() {
		super(licensePlateTruck);
		increment += 2;
	}
	public static Truck readFromInput() {
		Truck newTruck = new Truck();
		numOfVehicles++;
		return newTruck;
	}
	public void openTailgate() {
		System.out.println("Tailgate Open");
	}
	public void closeTailgate() {
		System.out.println("Tailgate Closed");
	}
}
