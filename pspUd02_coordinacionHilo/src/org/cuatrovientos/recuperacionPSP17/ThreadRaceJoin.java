package org.cuatrovientos.recuperacionPSP17;

public class ThreadRaceJoin extends Thread {
	Thread waitThread;
	String name="";
	
	public ThreadRaceJoin(String string, Thread t) {
		super();
		this.name = name;
		waitThread =t;
	}
	
	public ThreadRaceJoin(String string) {
		super();
		this.name = name;
		waitThread =null;
	}
	

	
	
	@Override
	public void run() {
		if (waitThread != null)
			try {
				waitThread.join();
				
				System.out.println(name + " FINISHED");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ": "+ i);
			System.gc();
		}
		
	}

}
