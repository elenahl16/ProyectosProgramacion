package ejercicio;

import java.util.Scanner;

public class Principal {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Agenda agendita = new Agenda();
		int opcion = 0;

		do {
			System.out.println("---------- Agenda Telefonica ---------------");
			System.out.println("[1] Mostrar entradas");
			System.out.println("[2] Añadir entradas");
			System.out.println("[3] Modificar entradas");
			System.out.println("[4] Borrar entradas");
			System.out.println("[5] Buscar entradas");
			System.out.println("[6] Compactar la Agenda");
			System.out.println("[7] Salir");
			System.out.println("--------------------------------------------");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:
				agendita.mostrarEntradaAgenda();
				break;

			case 2:
				agendita.insertarEntrada();
				break;

			case 3:
				agendita.modificarEntrada();
				break;

			case 4:
				agendita.borrarEntrada();
				break;
				
			case 5:
				agendita.buscarAgenda();
				break;
				
			case 6:
				agendita.compactarAgenda();
				break;
			}

		} while (opcion != 7);
	}

}
