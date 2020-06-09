package org.cuatrovientos.recuperacionpsp;

public class NegativeSubstractException extends Exception {
	public NegativeSubstractException(int n1, int n2) {
		super("NegativeSubstractException: " +n1+" - " +n2+ " el resultado es negativo");
	}
}
