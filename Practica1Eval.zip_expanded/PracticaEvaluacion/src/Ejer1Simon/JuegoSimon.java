package Ejer1Simon;

import java.util.Random;
import java.util.Scanner;

/*
 * Elena Hernández Lozano
 */
public class JuegoSimon {
	// Atributos

	Scanner teclado = new Scanner(System.in);
	String cadenaColores = "";
	static int contadorNumAciertos = 0;

	public JuegoSimon() {
		// Constructor por defecto

	}

	public void generarSecuenciaAleatorio() {
		// metodo que genere una secuencia del 1 al 4 de manera aleatorio

		Random aleatorio = new Random();

		int valor = aleatorio.nextInt(1, 5);//
		cadenaColores += valor;

	}

	public void mostrarCadenaAdivinar() {
		// metodo donde le vamos a

		for (int i = 0; i < cadenaColores.length(); i++) {
			char caracter = cadenaColores.charAt(i);

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
	}

	public void comenzarPartida() {

		System.out.println("-- Bienvenido al juego ---");
		boolean salirMenu = false;
		generarSecuenciaAleatorio();
		mostrarCadenaAdivinar();
			
		while (salirMenu == false) {
			System.out.println("Introduce las secuencias ");
			String cadenaSecuenc = teclado.nextLine();
			
			if (!cadenaSecuenc.equals(cadenaColores)) {
				System.err.println("Has fallado, sigue intentandolo...");
				teclado.nextLine();
			}

			else {
				contadorNumAciertos++; // si se cumple incrementamos el contador

			}
			salirMenu = true;
		}

	}

}
