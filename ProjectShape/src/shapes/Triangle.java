package shapes;

public class Triangle extends Shape implements IAngle {
	Point[] pos = new Point[3];  // point가 들어갈 배열 3개
	public Triangle() {}
	public Triangle(String color, Point pos1, Point pos2, Point pos3) {
		super(color);
		pos[0] = pos1;
		pos[1] = pos2;
		pos[2] = pos3;
	}
	public Triangle(String color, int x1, int y1, int x2, int y2, int x3, int y3) {
		pos[0] = new Point(x1,y1);
		pos[1] = new Point(x2,y2);
		pos[2] = new Point(x3,y3);
	}
	@Override
	public void draw() {
		System.out.println("[Triangle-color: " + getColor() + ", pos1: " + pos[0].xy() + ", pos2: " + pos[1].xy() + ", pos3: " + pos[2].xy() + "]");
	}

}
