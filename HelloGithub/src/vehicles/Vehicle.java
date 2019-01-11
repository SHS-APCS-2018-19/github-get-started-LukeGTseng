import java.util.*;
public class Vehicle {
	int speed;
	static int numOfVehicles = 0;
	Scanner s = new Scanner(System.in);
	String licensePlate;
	
	public Vehicle(String licensePlate) {
		this.licensePlate = licensePlate;
		System.out.println(licensePlate);
	}
	
	public void start() {
		System.out.println("Starting vehicle");
		System.out.println("Set the speed of the vehicle");
		setSpeed(s.nextInt());
	}
	public void stop() {
		this.speed = 0;
		System.out.println("Stopping vehicle");
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("Speed set to " + this.speed + " mph");
	}
	public void turn() {
		String input;
		System.out.println("Turn Left(L) or Right(R)?");
		input = s.next();
		if(input.equals("L")) {
			System.out.println("Turning Left");
		} else if (input.equals("R")) {
			System.out.println("Turning Right");	
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void increaseSpeed(int s) {
		speed += s;
		System.out.printf("Speed now at %d mph\n", speed);
	}
	public void decreaseSpeed(int s) {
		speed -= s;
		System.out.printf("Speed now at %d mph\n", speed);
	}
	public static int getNumOfVehicles() {
		return numOfVehicles;
	}
}
