package Ejer1Simon;

import java.util.Scanner;

public class Principal {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		JuegoSimon simon = new JuegoSimon();
		int opcion = 0;

		do {

			System.out.println("-------------- MENÚ -----------------------------------");
			System.out.println("[1] Nueva Partida");
			System.out.println("[2] Modificar tiempo de espera entre valor");
			System.out.println("[3] Ver número máximo de aciertos en la actual ejecución");
			System.out.println("[4] Salir");
			System.out.println("-------------------------------------------------------");
			opcion=teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:
				simon.comenzarPartida();
				break;

			case 2:

				break;
			case 3:

				break;
				default: System.err.println("Cerrando Sesión....");
			}

		} while (opcion != 4);
		teclado.close();

	}

}
