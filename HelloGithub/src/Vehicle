import java.util.*;
public class Vehicle {
	private Boolean onOff = false;
	private int speed;
	Scanner s = new Scanner(System.in);

	public void start() {
		onOff = true;
		System.out.println("Starting car");
	}
	public void stop() {
		onOff = false;
		System.out.println("Stopping car");
	}
	public void setSpeed() {
		System.out.println("Set Speed: ");
		speed = s.nextInt();
		System.out.println("Speed set to " + speed + " mph");
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
	public void increaseSpeed() {
		speed += 5;
		System.out.printf("Speed now at %d mph\n", speed);
	}
	public void decreaseSpeed() {
		speed -= 5;
		System.out.printf("Speed now at %d mph\n", speed);
	}
}
