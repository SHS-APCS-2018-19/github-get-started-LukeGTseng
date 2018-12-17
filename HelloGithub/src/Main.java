import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type in the first coordinate point: ");
		Point a = new Point(s.nextInt(),s.nextInt());
		System.out.println("Type in the second coordinate point: ");
		Point b = new Point(s.nextInt(),s.nextInt());
		System.out.println(a.polarCoord());
		System.out.println(b.polarCoord());
		System.out.println(Point.distance(a,b));
	}
}
