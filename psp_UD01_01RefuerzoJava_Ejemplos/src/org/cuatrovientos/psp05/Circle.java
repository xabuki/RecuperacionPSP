package org.cuatrovientos.psp05;


public class Circle implements IShape 
{
	private double radius;
	
	public Circle(double radius) 
        {
		this.radius = radius;
	}
	
	@Override
	public double getArea() 
        {
		return Math.PI * radius * radius;
	}

}
