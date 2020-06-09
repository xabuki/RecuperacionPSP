package org.cuatrovientos.recuperacionpsp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		try (RegexReader reader = new RegexReader(new FileReader("./File.txt"))) {
				 String line;
				 while ((line = reader.readLine()) != null && !line.matches("*dd/mm/yyyy*")) {
				 System.out.println(line);
				 }} catch (FileNotFoundException e) {
					 System.err.println("El archivo es inexistente!");

				}
		
	}
}
