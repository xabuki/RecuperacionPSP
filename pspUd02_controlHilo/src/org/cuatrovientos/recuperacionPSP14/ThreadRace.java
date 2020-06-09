package org.cuatrovientos.recuperacionPSP14;

public class ThreadRace extends Thread {

	String name="";
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ": "+ i);
			System.gc();
		}
		System.out.println(name + " ACABADO");
	}

	public ThreadRace(String string) {
		super();
		this.name = name;
	}
}
