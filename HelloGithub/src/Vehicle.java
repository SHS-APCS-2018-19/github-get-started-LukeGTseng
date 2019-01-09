import java.util.*;
public class Vehicle {
	private Boolean onOff = false;
	private int speed;
	public static int numOfVehicles = 0;
	Scanner s = new Scanner(System.in);

	public static Vehicle readFromInput() {
		Vehicle newVehicle = new Vehicle();
		numOfVehicles++;
		return newVehicle;
	}
	public void start() {
		onOff = true;
		System.out.println("Starting vehicle");
		System.out.println("Set the speed of the vehicle");
		setSpeed(s.nextInt());
	}
	public void stop() {
		onOff = false;
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
	public Boolean getStatus() {
		return onOff;
	}
}
