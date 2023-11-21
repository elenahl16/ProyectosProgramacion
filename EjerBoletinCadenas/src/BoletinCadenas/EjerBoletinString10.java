package BoletinCadenas;

/*
 * Desarrolla un método que tome una cadena con varias palabras y devuelva la misma
 cadena con las palabras en orden inverso.
 */
public class EjerBoletinString10 {
	// Atributos

	public String invertirCadena(String cadena) {

		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {//aqui recorremos la cadena de derecha a izq
			resultado += cadena.charAt(i);

		}

		return resultado;
	}

	public static void main(String[] args) {

		EjerBoletinString10 ejer10 = new EjerBoletinString10();
		String cadena = "La casa es azul";

		System.out.println("Las palabras en orden inverson son: " + ejer10.invertirCadena(cadena));
	}

}
