package Lab04PartA;

import java.awt.Point;

public class Quadrilateral extends Shape{
	
	public Quadrilateral(Point[] points){
		super("Quadrilateral");
		Point[] newPoints = new Point[4];
		for(int i = 0; i < newPoints.length; i++){
			newPoints[i] = points[i];
		}
		setPoints(newPoints);
	}

	@Override
	public double getPerimeter() {
		double sum = getDistance(getPoints()[0], getPoints()[1]) + getDistance(getPoints()[1], getPoints()[2]) + 
				getDistance(getPoints()[2], getPoints()[3]) + getDistance(getPoints()[3], getPoints()[0]);
		return sum;
	}
}
