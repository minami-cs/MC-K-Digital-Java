package sec01.var;

class Point {
	int x, y;
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}
class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super(x, y);
//		this.x = x;
//		this.y = y;
		this.z = z;
	}
	@Override
	String getLocation() {
		return super.getLocation() + ", z: " + z;  // 부모 것 + 자식 것
	}
	
}
public class OverrideTest {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,2,3);
		System.out.println(p1.getLocation());

	}

}
