import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type in the first coordinate point: ");
		Point a = new Point(in.nextInt(),in.nextInt());
		System.out.println("Type in the second coordinate point: ");
		Point b = new Point(in.nextInt(),in.nextInt());
		System.out.println("Distance: " + a.distance(b));
	}
}
