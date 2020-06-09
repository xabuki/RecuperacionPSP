package org.cuatrovientos.recuperacionPSP;

public class ExtiendeHilo2 {
	public static void main(String args[]) {

		Thread hiloA = new MiHilo2();
		Thread hiloB = new MiHilo2();
		
		hiloA.start();
		hiloB.start();
		

		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {}
		 
		System.out.println(Thread.currentThread());
	}
}

class MiHilo2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread() );
	}
}
