package pruebas;

import java.util.Arrays;
import java.util.Random;

/*
 * Método que simule el lanzamiento de dado que indiquemos y digamos cuentas veces a salido
 */
public class EjerPropuestoClase {
	// Atributos

	public static int[] lanzamientoDado(int numVeces) {

		// Las posiciones int de array se inicializan a 0
		int[] resultadoLanzam = new int[6];
		Random numAleatorio = new Random();

		for (int i = 0; i < numVeces; i++) {

			int valor = numAleatorio.nextInt(1, 7);// aqui tenemos un valor entre el 1 y el 7 contando el 0
			resultadoLanzam[valor - 1]++;// el valor -1 es 0

		}
		return resultadoLanzam;
	}

	// Metodo que le pasamos un numero de veces y nos tiene que devolver verdadero o
	// falso

	public static boolean ordenarArray(int[] arNumeros) {

		for (int i = 1; i < arNumeros.length; i++) {

			if (arNumeros[i] < arNumeros[i - 1]) {

				return false;
			}
		}
		return true;
	}



	public static void main(String[] args) {

		int[] arNumeros = { 10, 20, 60, 60, 1000 };
		
	
		if (ordenarArray(arNumeros) == true) {

			System.out.println("Esta ordenado");

		} else {
			System.out.println("No esta ordenado");
		}

	}

}
