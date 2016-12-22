package shape;

public class Circle extends Shape {
	public double radius;
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	 
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//double radius = radius / 2;
	
	@Override
	
	public double getArea() {
		return Math.PI *(radius * radius);
	}


}
