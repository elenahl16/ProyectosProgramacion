package EjerBoletinCadenas;

import java.util.Scanner;
/*
 * Escribe un programa que verifique si una cadena es un palíndromo (se lee
 * igual de izquierda a derecha y de derecha a izquierda).
 */

public class Ejer1 {
	// Atributos

	private String cadena, cadenaInvertida;

	public Ejer1() {
		// Constructor por defecto
	}

	/*
	 * Métodos
	 */
	private String invertirCadena() {

		String resultado = "";
		// Aqui vamos a recorrer con el bucle for la cadena que vamos a introducir de
		// derecha a izquierda

		for (int i = cadena.length() - 1; i >= 0; i--) {

			resultado += cadena.charAt(i);

		}

		return resultado;
	}

	private String cadenaEsPalindrimo(String cadena) {

		return cadenaInvertida = invertirCadena(cadena);

	}

}
