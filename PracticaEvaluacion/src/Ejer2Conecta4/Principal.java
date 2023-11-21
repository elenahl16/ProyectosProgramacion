package Ejer2Conecta4;

import java.util.Scanner;

public class Principal {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Conecta4Juego conecta4 = new Conecta4Juego();

		int opcion = 0;

		do {

			System.out.println("---- Juego Conecta 4 -----");
			System.out.println("[1] Nueva Partida");
			System.out.println("[2] Salir");
			System.out.println("------------------------------");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1: {
				conecta4.empezarPartida();
				break;
			}

			default:
				System.err.println("Cerrando partida...");
			}

		} while (opcion != 0);
		teclado.close();
	}

}
