package pruebas;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EjerArrayInvertirç {
	// Atributos

	public static int[] revertirArray(int[] arNumeros) {

		int[] resultado = new int[arNumeros.length];

		for (int i = 0; i < arNumeros.length; i++) {

			resultado[arNumeros.length - 1 - i] = arNumeros[i];

		}
		return resultado;
	}

	public static String invertirCadena(String cadena) {

		String resultado = "";

		for (int i = cadena.length() - 1; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);

		}
		return resultado;
	}

	public static int[] insertaFinalArray(int[] arNumeros, int dato) {

		int[] resultado = new int[arNumeros.length + 1]; // Creamos un array con el tamaño del original sumandole + 1

		for (int i = 0; i < arNumeros.length; i++) {// Copiamos los elementos del array original en el nuevo

			resultado[i] = arNumeros[i];

			resultado[resultado.length - 1] = dato;// Copio el nuevo dato

		}
		return resultado;
	}

	public static int[] insertaArrayEnPosicion(int[] arNumeros, int dato, int posicion) {

		int contador = 0;
		int[] resultado = new int[arNumeros.length + 1]; // Creamos un array con el tamaño del original sumandole + 1
		resultado[contador] = dato;

		for (int i = 0; i < arNumeros.length; i++) {

			if (i == posicion) {

				contador++;
			}

			resultado[contador] = arNumeros[i];
			contador++;

		}
		return resultado;
	}

	public static int posicionPrimeroMayor(int[] arNumeros, int dato) {

		int resultado = 0;
		for (int i = 0; i < arNumeros.length; i++) {

			if (arNumeros[i] >= dato) {
				return i;
			}
		}
		return resultado;
	}

	public static int[] borrarPrimeraOcurrencia(int[] arNumeros, int dato) {

		int posicionBorrar = -1;

		// Compruebo que si elemento que quiero borrar esta en el array
		for (int i = 0; i < arNumeros.length; i++) {

			if (arNumeros[i] == dato) {
				posicionBorrar = 1;
				break;// Me salgo del bucle
			}

			int[] resultado = new int[arNumeros.length + 1];
		}

		if (posicionBorrar != -1) {
			// el elemento que va a borrar esta en el array

			int[] resultado = new int[arNumeros.length - 1]; // Creo un array con una posicion menos que el original

			int j = 0;
			for (int i = 0; i < arNumeros.length; i++) {
				if (i != posicionBorrar) {
					resultado[j] = arNumeros[i];
					j++;
				}

			}
			return resultado;
		}

		else {
			return arNumeros;
		}

	}

	public static int[] borrarOcurrencia(int[] arNumeros, int dato) {

		int contador = 0;

		// Compruebo que si elemento que quiero borrar esta en el array
		for (int i = 0; i < arNumeros.length; i++) {

			if (arNumeros[i] == dato) {
				contador++;
				break;// Me salgo del bucle
			}

		}

		if (contador > 0) {
			// el elemento que va a borrar esta en el array

			int[] resultado = new int[arNumeros.length - contador]; // Creo un array con una posicion menos que el original

			int j = 0;
			for (int i = 0; i < arNumeros.length; i++) {
				if (arNumeros[i] != dato) {
					resultado[j] = arNumeros[i];
					j++;
				}

			}
			return resultado;
		}

		else {
			return arNumeros;
		}

	}

	public static void main(String[] args) {

		int[] arNumeros = { 1, 30, 100, 200, 400, 100 };

		int[] resu = borrarPrimeraOcurrencia(arNumeros, 100);
		System.out.println(Arrays.toString(resu));

		// int[] res = insertaArrayEnPosicion(arNumeros, 4, 15);

		// System.out.println(Arrays.toString(res));

	}

}
