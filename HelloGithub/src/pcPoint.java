public class pcPoint {
	private double radius;
	private double theta;
	
	public pcPoint(int x, int y) {
		radius = getRadius(x, y);
		theta = getTheta(y, x);
	}
	public double distance(pcPoint moo) { //formula: square root of (x2-x1) squared + (y2-y1) squared;
		double distance = Math.sqrt(Math.pow(moo.x-this.x,2)+ Math.pow(moo.y-this.y,2));
		return distance;
	}
	
	public double getRadius(int x, int y) {
		radius = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		return radius;
	}
	public double getTheta(int y, int x) {
		theta = Math.atan2(y,x);
		return theta;
	}
	
}
