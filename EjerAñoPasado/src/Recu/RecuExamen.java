package Recu;

import java.util.Scanner;

public class RecuExamen {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;

		do {

			System.out.println("----------- MENÚ -------------------");
			System.out.println("[0] Salir del programa");
			System.out.println("[1] Contar Vocales");
			System.out.println("[2] Comprobar contraseña");
			System.out.println("[3] Medias pares/impares");
			System.out.println("[4] Números");
			System.out.println("--------------------------------------------");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:

				String frase;
				int contadorVocal = 0; // contador que va llevando la cuenta de las vocales

				System.out.println("Introduce una cadena de texto");
				frase = teclado.nextLine();
	

				for (int i = 0; i < frase.length(); i++) { //
					

					if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
							|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {

						contadorVocal++;

						// charAt() lo que hace es devolvernos el caracter de la posicion que queremos
						// recorrer

					}
				}
				
				System.out.println("Tiene " + contadorVocal + " vocales la cadena " + frase);
				break;

			case 2:

				System.out.println("Introduce la contraseña");
				String contraseña = teclado.nextLine();

				if (contraseña.length() >= 6 && contraseña.equalsIgnoreCase("adminprogramacion")) {
					System.out.println("La contraseña es válida");

				}

				else if (contraseña.length() <= 6) {

					System.err.println("Lo sentimos la contraseña es menor de 6");

				}

				// OPCION 1
				/*
				 * if (contraseña.length() >= 6) {
				 * 
				 * if (contraseña.equalsIgnoreCase("adminprogramacion")) {
				 * 
				 * System.out.println("La contraseña es válida");
				 * 
				 * } }
				 * 
				 * else if (contraseña.length() < 6) {
				 * System.err.println("La contraseña es menor que 6");
				 * 
				 * } /*
				 * 
				 * 
				 */

				break;

			case 3:
				int numero = 0;
				int suma = 0;
				int mediaPar = 0, mediaImp = 0;
				int contadorPar = 0, contadorImpar = 0;

				do {

					System.out.println("Introduce un numero");
					numero = teclado.nextInt();

					if (numero % 2 == 0) {

						System.out.println("El número " + numero + " es par");
						contadorPar++;
						suma += numero;
					}

					else {
						System.out.println("El número " + numero + " es impar");
						contadorImpar++;
					}

					System.err.println("Lo sentimos no hay ningun número par ni impar");

				} while (numero != -1);

				mediaPar = suma / contadorPar;
				mediaImp = suma / contadorImpar;

				System.out.println("La media de los números pares son: " + mediaPar);
				System.out.println("La media de los números impares son: " + mediaImp);

				break;

			case 4:
				int contadorCeros = 0, contadorNeg = 0;
				double numDec = 0;
				int sumaNeg = 0;

				for (int i = 5; i > 0; i--) {
					System.out.println("Intoduce un numeros");
					numDec = teclado.nextDouble();

					if (numDec<0) {
						contadorNeg++;
						
					}

					else if (numDec == 0) {
						contadorCeros++;
					}
				}
				sumaNeg += numDec;
				contadorNeg *= sumaNeg;
				
				System.out.println("La multiplicaión de estos números negativos son: " + contadorNeg);
				System.out.println("La cantidad de ceros que tiene son: " + contadorCeros);
				break;
			default:
				System.err.println("Cerrando sesión...");

			}

		} while (opcion != 0);
		teclado.close();
	}
}
