package EjerEncapsul2;

import java.util.Scanner;

public class Aplicacion {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		JuegoTiempo juego1 = new JuegoTiempo();
		int opcion = 0;

		do {
			System.out.println("---------------- MENÚ --------------");
			System.out.println("[1] Jugar a la versión");
			System.out.println("[2] Jugar a la veraión con margen de errores");
			System.out.println("[3] Salir");
			System.out.println("---------------------------------");
			opcion= teclado.nextInt();
			teclado.nextLine();
			
			switch(opcion) {
			
			case 1:
				
				break;
				
			case 2:
				
				break;
			}

		} while (opcion != 0);

	}

}
