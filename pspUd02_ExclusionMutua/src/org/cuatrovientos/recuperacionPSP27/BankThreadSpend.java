package org.cuatrovientos.recuperacionPSP27;

public class BankThreadSpend extends Thread{
	
	
	BankAccount banco;
	
	public BankThreadSpend(BankAccount banco) {
        this.banco=banco;
    }
	
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				if(banco.balance<100) {
					System.out.println("Que no te queda money maquina");
				}else
				banco.takeOutMoney(100);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
