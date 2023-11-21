package Ejer5;

import java.util.Scanner;

public class Aplicacion {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		JuegoDados juegoDado1 = new JuegoDados();
		int opcion = 0;

		do {

			System.out.println("Tu saldo actual es: " + juegoDado1.getSaldo());
			System.out.println("*---------------------------");
			System.out.println("[1] Recargar saldo");
			System.out.println("[2] Hacer apuesta");
			System.out.println("[3] Salir del juego");
			System.out.println("*-------------------------*");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:
				System.out.println("Cuanto dinero quieres recargar");
				int cantidad=teclado.nextInt();
				juegoDado1.incrementarSaldo(cantidad);
				break;

			case 2:
				System.out.println("Cuanto quieres apostar");
				int cantidad2=teclado.nextInt();
				
				if(juegoDado1.hacerApuesta(cantidad2) ==-1) {
					System.err.println("No tienes saldo suficiente");	
				}
				
				break;
			default:System.err.println("Cerrando sesión....");
			}

		} while (opcion == 3);
		
		
		
		/*Otra forma de hacerlo, esto iria dentro del main
		 * boolean salir=false;

		Scanner teclado=new Scanner(System.in);

		

		Juego miJuego=new Juego();

		

		while(salir==false)

		{

			System.out.println("Tu saldo actual es : " + miJuego.getSaldo());

			System.out.println("¿Qué quieres hacer?");

			System.out.println("1 - Recargar saldo");			

			System.out.println("2 - Hacer apuesta");

			System.out.println("3 - Salir");

			int opcion=teclado.nextInt();

			

			if(opcion==1)

			{

				// Recargar saldo

				System.out.println("¿Cuánto quieres recargar?");

				int cantidad=teclado.nextInt();

				miJuego.incrementarSaldo(cantidad);

			}

			else if(opcion==2)

			{

				System.out.println("¿Cuánto quieres apostar?");

				int cantidad=teclado.nextInt();

				if(miJuego.hacerApuesta(cantidad)==-1)

					System.out.println("No tienes saldo suficiente");					

			}

			else salir=true;

		}

		

		

		// Cerramos el objeto de la clase Scanner

		teclado.close();

	}
		 */
	
	}

}
