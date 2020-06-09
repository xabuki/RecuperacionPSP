package org.cuatrovientos.psp02;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circ = new Circle();
		Rectangle rect= new Rectangle();
		
	List<GraphicObject> lGraphObj = new ArrayList<GraphicObject>();
	
	lGraphObj.add(rect);
	lGraphObj.add(circ);
	
	
	for (GraphicObject graphicObject: lGraphObj) {
		if (graphicObject instanceof Circle) {
			System.out.println(" Circulo");
		}else {
			System.out.println(" Rectangulo");
		}
	}

	}


}
