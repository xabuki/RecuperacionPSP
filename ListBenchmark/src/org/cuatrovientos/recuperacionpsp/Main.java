package org.cuatrovientos.recuperacionpsp;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> Lista1 = new ArrayList<Double>();
		LinkedList<Double> Lista2 = new LinkedList<Double>(); 
		
		
		//Añadir 100.000 elementos
		Instant start = Instant.now();
		for (int i = 0; i < 100000; i++) {
			
			Lista1.add(0,05.00);
		}
		Instant end = Instant.now();
		Duration dur = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		Instant start2 = Instant.now();
		for (int i = 0; i < 100000; i++) {
			
			Lista2.add(0,05.00);
		}
		Instant end2 = Instant.now();
		Duration dur2 = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		//Eliminar 50.000 primeras posiciones
		Instant start3 = Instant.now();
		for (int i = 0; i < 50000; i++) {
			
			Lista1.remove(0);
		}
		Instant end3 = Instant.now();
		Duration dur3 = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		Instant start4 = Instant.now();
		for (int i = 0; i < 50000; i++) {
			Lista1.remove(0);
		}
		Instant end4 = Instant.now();
		Duration dur4 = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		Instant start5 = Instant.now();
		int ran;
		for (int i = 0; i < 50000; i++) {
			
			ran= (int)(Math.random())*(50000+i);
			Lista1.add(ran,05.00);
			
		}
		Instant end5 = Instant.now();
		Duration dur5 = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		Instant start6 = Instant.now();
		int ran2;
		for (int i = 0; i < 50000; i++) {
			ran2= (int)Math.random()*(50000+i);
			Lista2.add(ran2,05.00);
		}
		Instant end6 = Instant.now();
		Duration dur6 = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		Instant start7 = Instant.now();
		int ran3;
		for (int i = 0; i < 50000; i++) {
			
			ran3= (int)Math.random()*(50000+i);
			Lista1.remove(ran3);
			
		}
		Instant end7 = Instant.now();
		Duration dur7 = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		Instant start8 = Instant.now();
		int ran4;
		for (int i = 0; i < 50000; i++) {
			ran4= (int)Math.random()*(50000+i);
			Lista2.remove(ran4);
		}
		
		Instant end8 = Instant.now();
		Duration dur8 = Duration.between(start, end);
		System.out.printf("ArrayList: The operation ... takes: %dms\n",
		dur.toMillis());
		
		Instant end9 = Instant.now();
		for (int i = 0; i < 50000; i+=2) {
			Lista1.remove((int)Math.random());
		}
		Instant end10 = Instant.now();
		Instant startLista1 = Instant.now();
		for (int i = 0; i < 50000; i+=2) {
			Lista2.remove((int)Math.random());
		}
		Instant endLista2 = Instant.now();
		Duration durLista1 = Duration.between(end9, end10);
		Duration durLista2 = Duration.between(startLista1, endLista2);
		System.out.printf("ArrayList: The operation ... takes: %dms\n", durLista1.toMillis());
		System.out.printf("LinkedList: The operation ... takes: %dms\n",durLista2.toMillis());
		

	}

}
