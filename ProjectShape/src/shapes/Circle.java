package shapes;

public class Circle extends Shape {
	Point center;
	int radius;
	
	public Circle() {}
	public Circle(String color, Point center, int radius) {
		super(color);
		this.center = center;
		this.radius = radius;
	}
	public Circle(String color, int x, int y, int radius) {
		super(color);
		this.center = new Point(x,y);
		this.radius = radius;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("[Circle-color: " + getColor() + ", center: " + center.xy() + ", radius: " + getRadius() + "]");
		
	}
	
	
}
