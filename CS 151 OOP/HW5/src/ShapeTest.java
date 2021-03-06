
import java.util.*;
public class ShapeTest {
	public static void main (String [] arg) {
		Shapes shapes = new Shapes(new ArrayList<Shape>());
		shapes.add(new Triangle(5,10));
		shapes.add(new Triangle(7.5,20));
		shapes.add(new Rectangle(20,30));
		shapes.add(new Rectangle(20.5, 10.5));
		shapes.add(new Circle(2));
		shapes.add(new Circle(5.5));
		shapes.add(new Hexagon(10));
		shapes.add(new Hexagon(15.5));
		
		shapes.compute();
		
		for (Shape i : shapes.getShapeList()) {
			System.out.println(i.toString());
		}
		
		System.out.println("Shape has the largest area: \n" + shapes.max());
		System.out.println("Shape has the smallest area: \n" + shapes.min());
	}
}
