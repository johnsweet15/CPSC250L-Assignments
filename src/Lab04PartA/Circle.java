package Lab04PartA;

import java.awt.Point;

public class Circle extends Shape{
	private double radius;
	
	protected Circle(Point center, double r){
		super("Circle");
		Point[] points = new Point[1];
		points[0] = center;
		if(r < 0)
			r = 0;
		this.radius = r;
		super.setPoints(points);
	}
	
	public double getRadius(){
		return radius;
	}

	@Override
	public double getPerimeter(){
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
}
