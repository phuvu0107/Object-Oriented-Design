/*
 * HW5 Exercise 1
 * @author Truong Phu VU
 * @since 11/7/2021
 */

import java.util.*;
import java.util.Collections;

public class Shapes extends Thread {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();

	// constructor

	Shapes() {
	}

	Shapes(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}

	// getters and setters
	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}

	// methods

	public void add(Shape obj) {
		shapeList.add(obj);
	}

	public void remove(Shape obj) {
		shapeList.remove(shapeList.indexOf(obj));
	}

	public Shape max() {
		Comparator<Shape> maxArea = new Comparator<Shape>() {
			@Override 
			public int compare(Shape obj1, Shape obj2) {
				return (int) (obj2.getArea() - obj1.getArea());
			}
		};
		
		Collections.sort(shapeList, maxArea);
		
		return shapeList.get(0);
	}
	
	public Shape min() {
		Comparator<Shape> maxArea = new Comparator<Shape>() {
			@Override 
			public int compare(Shape obj1, Shape obj2) {
				return (int) (obj2.getArea() - obj1.getArea());
			}
		};
		
		Collections.sort(shapeList, maxArea);
		Collections.reverse(shapeList);
		
		return shapeList.get(0);
	}
	
	public synchronized void compute() {
		for (Shape i : shapeList) {
			i.start();
		}
	}

}
