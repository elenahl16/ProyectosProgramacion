package BoletinCadenas;

/*
 * Escribe un programa que verifique si una cadena es un palíndromo (se lee
 * igual de izquierda a derecha y de derecha a izquierda).
 */
public class BoletinCadenas1 {
	// Atributos

	public BoletinCadenas1() {
		// Contructor por defecto

	}

	public boolean esPalindromo(String cadena) {

		int posIzquierda = 0;
		int posDerecha = cadena.length() - 1;
		boolean resultado = true;

		while (posIzquierda < posDerecha) {

			if (cadena.charAt(posIzquierda) != cadena.charAt(posDerecha)) {
				resultado = false;
				posIzquierda++;
				posDerecha--;
			}
		}

		return resultado;
	}

	public int contarCadena(String cadena) {
		/*
		 * Crea un método que reciba como parámetro una cadena y cuente cuántas vocales
		 * tiene. Ojo, habría que contabilizar tanto mayúsculas como minúsculas y
		 * vocales con tilde.
		 */

		// Aqui vamos a recorrer la cadena de izq a derecha
		int contadorNumVocal = 0;

		// Convertimos la cadena que nos pasen a minúscula para hacer menos
		// comprobaciones
		cadena=cadena.toLowerCase();

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);// Aqui lo hacemos de manera más directa

			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
					|| caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
				contadorNumVocal++;
			}

		}
		return contadorNumVocal;
	}

}
