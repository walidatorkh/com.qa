package shape;

public class Point extends Shape {
	
	public int y, x;
	

	public Point(int y, int x) {
		super();
		this.y = y;
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Point [y=" + y + ", x=" + x + "]";
	}

    
}
