package org.cuatrovientos.recuperacionPSP;

public class ImplementRunnable {

	public static void main(String args[]) {
		// Se instancia dos nuevos objetos Thread
		Thread hiloA = new Thread(new MiHilo(),  "hiloA");
		Thread hiloB = new Thread(new MiHilo(),  "hiloB");
		
		// Se arrancan las dos tareas, para que comiencen su ejecuci�n 
		hiloA.start();
		hiloB.start();
		
		// Aqu� se retrasa la ejecuci�n un segundo y se captura la posible 
		// excepci�n que genera el m�todo, aunque no se hace nada en el 
		// caso de que produzca
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {}
		
		// Presenta informaci�n acerca del thread principal del programa
		System.out.println( Thread.currentThread() );
	}
}
