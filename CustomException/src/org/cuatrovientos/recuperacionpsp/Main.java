package org.cuatrovientos.recuperacionpsp;

public class Main {
	public static int positiveSubstract(int n1, int n2) throws NegativeSubstractException{
		
		if (n1<n2) throw new NegativeSubstractException(n1,n2);
		
		return n1-n2;
		
	}


		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				int result = positiveSubstract(4,12);
			}catch (NegativeSubstractException e) {
				System.out.println(e.getMessage());
					
				}
			}

	

}
