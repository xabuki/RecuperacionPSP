package org.cuatrovientos.recuperacionPSP;

public class MiHilo {
	package org.cuatrovientos.psp;

	class NoHaceNada {}

	public class MiHilo extends NoHaceNada implements Runnable {
		public void run() {

			System.out.println( Thread.currentThread() );
		}
	}

}
