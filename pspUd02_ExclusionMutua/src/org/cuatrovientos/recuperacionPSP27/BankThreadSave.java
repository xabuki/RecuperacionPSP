package org.cuatrovientos.recuperacionPSP27;

public class BankThreadSave extends Thread {
	
	BankAccount banco;
	
	public BankThreadSave(BankAccount banco) {
        this.banco=banco;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				banco.addMoney(100);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
