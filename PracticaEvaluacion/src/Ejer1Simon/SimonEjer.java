package Ejer1Simon;
/*
 * Elena Hernández Lozano
 */

import java.util.Random;
import java.util.Scanner;

public class SimonEjer {
	// Atributos

	Scanner teclado = new Scanner(System.in);
	String cadena = "";
	private int contadorSecuencia = 0;
	private int tiempo;

	public void comenzarPartida() {

		Random aleatorio = new Random();

		System.out.println("-- Bienvenido al juego ---");

		// Inicializo el valor de la secuencia
		cadena = "";

		boolean salir = false;
		while (salir == false) {

			// Generamos un nuevo valor
			int valor = aleatorio.nextInt(1, 5);
			cadena += valor;

			// Le mostramos los caracteres de la cadena a adivinar uno por uno
			for (int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);

				// Imprimimos el carácter
				System.out.print(caracter);
				// Hago una pausa del tiempo que sea. Por ejemplo
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Borramos el carácter
				System.out.print("\b"); // Borro el carácter
			}

			System.out.println("Introduce las secuencias ");
			String cadenaSecuenc = teclado.nextLine();

			if (!cadenaSecuenc.equals(cadena)) {
				System.out.println("Has fallado, sigue intentandolo...");
				teclado.nextLine();

			}
		}
		salir = true;

	}

	public void mostrarSecuencia() {

	}

}

/*
 *
 * -
 * 
 */
