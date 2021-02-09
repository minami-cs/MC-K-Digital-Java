

import shapes.Circle;
import shapes.IAngle;
import shapes.Point;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class ShapeSet {
	
	Shape[] shps = new Shape[100];
	int cnt;
	
	public void addShape(Shape shp) {
		shps[cnt++] = shp;
	}
	
	public void allShapeDraw() {
		for (int i=0; i<cnt; i++) {
			shps[i].draw();
		}
	}
	// 원을 제외한 도형들만 보여주게 할 때에도 인터페이스를 이용해서 인터페이스 참조여부를 판별할 수 있음
	public void angleShape() {
		for (int i=0; i<cnt; i++) {
			if(shps[i] instanceof IAngle) {
				shps[i].draw();
			}
		}
	}

	public static void main(String[] args) {
		ShapeSet set = new ShapeSet();
		// set.addShape(new Shape());  // 불가능
		// set.addShape(new Shape("purple"));  // 불가능
		set.addShape(new Circle("green", new Point(10,10),5));
		set.addShape(new Circle("red", 20,20,5));
		set.addShape(new Rectangle("yellow", 5,10));
		set.addShape(new Triangle("blue", new Point(3,3), new Point(7,7), new Point(2,2)));
		set.addShape(new Triangle("orange", 20,20,15,15,17,17));
		
//		set.allShapeDraw();
		set.angleShape();

	}

}

/* 출력결과
 * [Circle-color: green, center: (10,10), radius: 5]
 * [Circle-color: red, center: (20,20), radius: 5]
 * [Rectangle-color: yellow, width: 5, height: 10]
 * [Triangle-color: blue, pos1: (3,3), pos2: (7,7), pos3: (2,2)]
 * [Triangle-color: orange, pos1: (20,20), pos2:(15,15), pos3: (17,17)]
 */