package org.cuatrovientos.recuperacionPSP27;

public class BankAccount {
	int balance;
	
	public BankAccount(int balance) {
        this.balance=balance;
    }
	
	
	public synchronized void addMoney(int a�adido) {
		
		balance+=a�adido;
		System.out.println("Current balance:"+balance);
		
		
	}
	
	public synchronized void takeOutMoney(int restado) {
		
		balance-=restado;
		System.out.println("Current balance:"+balance);
		
		
	}
	
	public int getBalance() {
		
		return balance;
	}
}

