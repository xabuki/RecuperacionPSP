package org.cuatrovientos.recuperacionPSP14;

public class Main {

	public static void main(String[] args) {
		
		
		
		ThreadRace A = new ThreadRace("Thread A");
		ThreadRace B = new ThreadRace("Thread B");
		ThreadRace C = new ThreadRace("Thread C");
		
		A.start();
		B.start();
		C.start();

	}

}

