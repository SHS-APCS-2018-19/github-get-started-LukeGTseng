public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(Point moo) { //formula: square root of (x2-x1) squared + (y2-y1) squared;
		double distance = Math.sqrt(Math.pow(moo.x-this.x,2)+ Math.pow(moo.y-this.y,2));
		return distance;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
