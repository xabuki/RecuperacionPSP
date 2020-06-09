package org.cuatrovientos.psp05;



public class ShapeComparator<T extends IShape, U extends IShape> {
	private T shape1;
	private U shape2;
	
	ShapeComparator(T shape1, U shape2) {
		this.shape1 = shape1;
		this.shape2 = shape2;
	}

	public T getShape1() {
		return shape1;
	}

	public void setShape1(T shape1) {
		this.shape1 = shape1;
	}

	public U getShape2() {
		return shape2;
	}

	public void setShape2(U shape2) {
		this.shape2 = shape2;
	}
	
	public void compare() {
		double area1 = shape1.getArea();
		double area2 = shape2.getArea();
		
		if(area1 > area2) {
			System.out.printf("Shape 1 wins: %.2f vs %.2f\n", area1, area2);
		} else if(area2 > area1) {
			System.out.printf("Shape 2 wins: %.2f vs %.2f\n", area2, area1);
		} else {
			System.out.printf("Tie: %.2f\n", area1);
		}
	}
}
