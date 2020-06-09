package org.cuatrovientos.recuperacionPSP27;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount banco = new BankAccount(100);
		
		Thread [] hilos = new Thread[40];
		
		for (int i = 0; i < hilos.length/2; i++) {
			
				hilos[i]= new BankThreadSave(banco);
			}
		for (int i = hilos.length/2;i < hilos.length/2 ; i++) {
			
			hilos[i]= new BankThreadSpend(banco);
		}
		for (int i = 0; i < hilos.length; i++) {
			hilos[i].start();
		}
		
			
		}
}
