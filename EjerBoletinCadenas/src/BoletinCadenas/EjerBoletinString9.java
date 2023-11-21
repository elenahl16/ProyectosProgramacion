package BoletinCadenas;

/*
 * Implementa un método que reciba una String que sólo puede contener 0 y 1. El
método debe devolver el número máximo de 1 seguidos que hay. Si alguno de los
caracteres no es un 0 o un 1, debe retornar -1.
 */
public class EjerBoletinString9 {
	// Atributos

	public int contadorcadena(String palabra) {

		int contadorUno = 0;
		int numUnoMax = 0;

		for (int i = 0; i < palabra.length(); i++) {
			char caracterLeido = palabra.charAt(i);

			if (caracterLeido == '1') {
				contadorUno++;

				if (contadorUno > numUnoMax) {
					numUnoMax = contadorUno;// Aqui lo que hacemos es igual el numeromaximo de uno
				}

			} else if (caracterLeido == '0') {

			} else {
				return -1;// Cadena no válida porque el caracter no tiene ni 0 ni 1
			}

		}
		return numUnoMax;
	}

	public static void main(String[] args) {

		EjerBoletinString9 ejer9 = new EjerBoletinString9();

		System.out.println(ejer9.contadorcadena("100110111001"));
	}

}
