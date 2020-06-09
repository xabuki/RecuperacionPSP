package org.cuatrovientos.recuperacionPSP15;

public class Main {

	public static void main(String[] args) {
		
		
		sthread thread1 = new sthread("A");
		thread1.setName("A");
		
		sthread thread2 = new sthread("B");
		thread2.setName("B");
		
	    
		sthread thread3 = new sthread("C");
		thread3.setName("C");
		
	    
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		}
	}