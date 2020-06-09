package org.cuatrovientos.psp01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object Bicicleta = new MountainBike(0,0,0,0);
		
		
		
		if(Bicicleta instanceof MountainBike) {
			MountainBike bicicleta2= (MountainBike)Bicicleta;
		}
	}

}
