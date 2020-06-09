package org.cuatrovientos.recuperacionPSP15;

public class sthread extends Thread{
public static void main(String[] args) {
		
		
		
		sthread t1 = new sthread("A");
		
		
		sthread t2 = new sthread("B");
		
		
	    
		sthread t3 = new sthread("C");
		
		
	    
		t1.start();
		t2.start();
		t3.start();
		
	
	 
	

}

	public String name;
	public boolean terminar = false;
	
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if(!terminar) {
				System.out.println(name + ": "+ i);
				
				
				if(i>=700 && name.equals("Thread A")) {
					terminar = true;
				}
				System.gc();
			}
		}
		System.out.println(name + " ACABADO");
	}

	public sthread(String name) {
		super();
		this.name = name;
	}
	
	
	

	public int getRunnerNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setFinish(boolean terminar) {
		 this.terminar = terminar;
		 }
}


