
public class Car extends Vehicle {
	static int increment = 1;

	public Car() {
		super("C" + increment);
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
