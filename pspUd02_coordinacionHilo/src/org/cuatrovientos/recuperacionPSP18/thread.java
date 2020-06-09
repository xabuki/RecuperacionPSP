package org.cuatrovientos.recuperacionPSP18;

public class thread extends Thread {
	Thread waitThread;
	int numero=5;
	
	public thread(Thread t) {
		super();
		
		waitThread =t;
	}
	
	public thread() {
		super();
		
		waitThread =null;
	}
	
	public void run() {
		if (waitThread != null)
			try {
				waitThread.join();
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			int res;
			res= numero*i;
			System.out.println(numero + "x" + i + "=" + res);
		}
	}

}
