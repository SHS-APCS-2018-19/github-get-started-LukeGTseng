
public class Car extends Vehicle {
	public static int increment = 1;
	public static String licensePlateCar = "C" + increment;
	public Car() {
		super(licensePlateCar);
		increment += 2;
	}

	public static Car readFromInput() {
		Car newCar = new Car();
		numOfVehicles++;
		return newCar;
	}
	public void openTrunk() {
		System.out.println("Trunk Open");
	}
	public void closeTrunk() {
		System.out.println("Trunk Closed");
	}
}
