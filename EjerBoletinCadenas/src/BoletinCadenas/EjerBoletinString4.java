package BoletinCadenas;

import java.util.Scanner;

/*
 * Desarrolla un método que tome una cadena y elimine todos los espacios en blanco.
 */

public class EjerBoletinString4 {
	// Atributos

	public EjerBoletinString4() {
		// Constructor por defecto

	}

	public String eliminarEspacios(String cadena) {

		return cadena.replace(" ", "");
		// el metodo replaceAll sirve para borrar los espacios en blancos, la expresión
		// \\s se usa para representar un espacio en blanco

	}

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		EjerBoletinString4 ejer4 = new EjerBoletinString4();//instanciamos la clase 

		String cadena = "Mi casa es de color azul celeste"; //aqui le asigno la cadena 
		
		System.out.println("Cadena con espacio: " + cadena);
		System.out.println("Cadena sin espacios: " + ejer4.eliminarEspacios(cadena));

	}

}
