package EjerClase;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		System.out.println("Introduce un números");
		int num = teclado.nextInt();

		System.out.println("Introduce dos números");
		int num1 = teclado.nextInt();

		do {
			System.out.println("-------- MENÚ-----------------");
			System.out.println("[0] Salir");
			System.out.println("[1] Suma");
			System.out.println("[2] Resta");
			System.out.println("[3] Multiplicar");
			System.out.println("[4] División entera");
			System.out.println("[5] División decimal");
			System.out.println("[6] Módulo");
			System.out.println("-----------------------------");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:

				System.out.println("La suma de estos dos números son: " + (num + num1));
				break;

			case 2:
				System.out.println("La resta de estos dos números son: " + (num - num1));
				break;

			case 3:
				System.out.println("La multiplicación de estos numeros son: " + (num * num1));
				break;

			case 4:
				System.out.println("La division de estos números son: " + (num / num1));
				break;

			case 5:

				System.out.println("La division decimal de estos números son: " + ((double) num / num1));
				break;

			case 6:
				System.out.println("El resto de la division es: " + (num % num1));
				break;
			default:
				System.err.println("Cerrando sesión ....");
			}

		} while (opcion != 0);
		teclado.close();
	}

}
