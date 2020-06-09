package org.cuatrovientos.recuperacionPSP17;

public class Main {
	public static void main(String[] args) {
		
		ThreadRaceJoin A = new ThreadRaceJoin("Thread A");
		ThreadRaceJoin B = new ThreadRaceJoin("Thread B",A);
		ThreadRaceJoin C = new ThreadRaceJoin("Thread C",B);
		
		
		
		
		A.start();
		B.start();
		C.start();
		
		

	}
}
