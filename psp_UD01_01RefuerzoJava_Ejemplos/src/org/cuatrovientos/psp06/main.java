package org.cuatrovientos.psp06;
interface ISayThings{
	public void sayHello();
	public void sayGoodbye();
};


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISayThings sayThings = new ISayThings() {
			private String name="Peter";
			@Override
			public void sayHello(){	
			System.out.println("Hello");
				}
			@Override
			public void sayGoodbye(){
				System.out.println("Bye");
			}
			
	};
	}

}
