package Lab04PartA;

import java.awt.Point;

public class Triangle extends Shape{

	public Triangle(Point[] points){
		super("Triangle");
		Point[] newPoints = new Point[3];
		for(int i = 0; i < newPoints.length; i++){
			newPoints[i] = points[i];
		}
		setPoints(newPoints);
	}

	@Override
	public double getPerimeter() {
		double sum = getDistance(getPoints()[0], getPoints()[1]) + getDistance(getPoints()[1], getPoints()[2]) + 
				getDistance(getPoints()[2], getPoints()[0]);
		return sum;
	}
}
