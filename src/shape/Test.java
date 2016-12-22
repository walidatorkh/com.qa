package shape;

import shape.Circle;

public class Test extends Circle {

	public static void main(String[] args) {
		Shape s = new Shape(); // create an object
		s.setColor("Red"); // set the color
		System.out.println(s.getColor()); // print color
		System.out.println(s.getArea()); // print area
		
		System.out.println("============================================");
		
		Rectanle r = new Rectanle();
		r.setLength(10); // set the length
		r.setWidth(5); // set the width
		r.setColor("Blue"); // set the color
		System.out.println(r.getColor()); //print color
		System.out.println(r.getArea()); // print area
		
		System.out.println("=============================================");
		
		
		Circle c = new Circle();
		
		c.setRadius(9.0); //set the radius
		
		c.setColor("black"); //set the color
		
		System.out.println(c.getColor()); //print the color
		System.out.println(c.getArea()); //print the area
		System.out.println("=============================================");
		
		
		Point p = new Point(0, 0);
		//p.x = 83;
		//p.y = 75;
		p.setX(4);
		p.setY(5);
		
			System.out.println("Point [y=" + p.y + ", x=" + p.x + "]");
	
	}
}
