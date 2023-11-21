package BoletinCadenas;

public class Aplicacion {

	public static void main(String[] args) {

		BoletinCadenas1 ejercicio1 = new BoletinCadenas1();
		
		
		if (ejercicio1.esPalindromo("oso") == true) {
			
			System.out.println("Es palíndromo");
		} 
		else {
			System.out.println("No es palíndromo");
		}

	}

}
