package Lab04PartA;
import java.awt.Point;
import java.lang.Math;

public abstract class Shape {
	private String  name;
	private Point[] points;
	
	protected Shape(String aName) {
		name = aName;
	}
	
	public final String getName() {
		return name;
	}

	protected final void setPoints(Point[] thePoints) {
		points = thePoints;
	}
	
	public final Point[] getPoints() {
		return points;
	}
	
	public abstract double getPerimeter();
	
	public static double getDistance(Point one, Point two) {
		double distanceX = Math.abs(one.getX() - two.getX());
		double distanceY = Math.abs(one.getY() - two.getY());
		double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
		return distance;
	}
}