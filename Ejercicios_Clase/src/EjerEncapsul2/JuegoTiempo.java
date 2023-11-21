package EjerEncapsul2;

import java.util.Random;
import java.util.Scanner;

public class JuegoTiempo {
	// Atributos

	private long momentoInicial;
	private int numSegundMinimo, numSegundMax, numSegundoMargen;

	public JuegoTiempo() {
		// Constructor por defecto

	}

	public JuegoTiempo(long momentoInicial, int numSegundoMinimo, int numSegundoMax, int numSegundoMargen) {
		// Constructor parametrizado
		

		this.momentoInicial = momentoInicial;
		this.numSegundMinimo = 15;
		this.numSegundMax = 30;
		this.numSegundoMargen = 3;
	}


	public void setMomentoInicial(long momentoInicial) {
		this.momentoInicial = momentoInicial;
	}

	public int getNumSegundMinimo() {
		return numSegundMinimo;
	}

	public void setNumSegundMinimo(int numSegundMinimo) {
		this.numSegundMinimo = numSegundMinimo;
	}

	public int getNumSegundMax() {
		return numSegundMax;
	}

	public void setNumSegundMax(int numSegundMax) {
		this.numSegundMax = numSegundMax;
	}

	public int getNumSegundoMargen() {
		return numSegundoMargen;
	}

	public void setNumSegundoMargen(int numSegundoMargen) {
		this.numSegundoMargen = numSegundoMargen;
	}

	public void jugarPartida() {
		// Generamos numeros aleatorios

		Random numeroAleatorio = new Random();
		int numSegundo = numeroAleatorio.nextInt(numSegundMinimo, numSegundMax);

		System.out.println("El número de segundo es adivinar es: " + numSegundo);
		System.out.println("Pulsar enter cuando quieras que comience la cuenta");
		Scanner teclado = new Scanner(System.in);
		teclado.nextLine();
		// Empezamos a contar el tiempo desde ese momento

	}
}
