
public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static double distance(Point moo, Point dab) { //formula: square root of (x2-x1) squared + (y2-y1) squared;
		double distance = Math.sqrt((moo.x-dab.x)+(moo.y-dab.y));
		return distance;
	}
}
