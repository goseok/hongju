package study.example1;

import study.shape.Circle;
import study.shape.Point;
import study.shape.Rect;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.printCircle();
		c1.moveCenter(10, 10);
		c1.printCircle();
		c1.resize(10.1);
		c1.printCircle();
		
		Rect r = new Rect();
		r.print();
		Rect r2 = new Rect(0,0,10,-10);
		r2.print();
		Rect r3 = new Rect(new Point(0,0),
				new Point(10,-10));
		r3.print();
	}
}
