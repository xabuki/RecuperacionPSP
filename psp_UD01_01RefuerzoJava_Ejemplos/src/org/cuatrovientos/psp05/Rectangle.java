package org.cuatrovientos.psp05;



public class Rectangle implements IShape 
{
	private double height, base;
	
	public Rectangle(double height, double base) 
        {
		this.height = height;
		this.base   = base;
	}
	
	@Override
	public double getArea() 
        {
		return height * base;
	}
}
