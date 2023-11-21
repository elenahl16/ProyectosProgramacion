package BoletinCadenas;
/*
 * Escribe un método que tome una cadena y cuente cuántas veces aparece una letra o
  un carácter específico en la cadena.
 */

public class EjerBoletinString6 {
	// Atributos

	public EjerBoletinString6() {
		// Constructor por defecto

	}

	public int contarVocalesLetras(String cadena, char letra) {

		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			char caracterLeido = cadena.charAt(i);

			if (caracterLeido == letra) {
				contador++;
			}
		}
		return contador;
	}

}
