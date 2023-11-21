package Ejer5;

import java.util.Random;

public class JuegoDados {
	// Atributos

	int saldoInicial, dado1, dado2, dado3;

	public JuegoDados() {
		// Constructor por defecto

	}

	public void incrementarSaldo(int cantidad) {

		if (cantidad > 0) {
			saldoInicial += cantidad;
		}
	}

	public int getSaldo() {

		return saldoInicial;
	}

	public void lanzarDados() {

		Random numAleatorio = new Random();// instanciamos la clase random o también podemos utilizar math.random

		this.dado1 = numAleatorio.nextInt(1, 7);
		this.dado2 = numAleatorio.nextInt(1, 7);
		this.dado3 = numAleatorio.nextInt(1, 7);
	}

	public int comprobarResultado() {

		int resultado;
		// comprueba los valores que tienen los dados

		if (dado1 == dado2 && dado2 == dado3) { // Cromprueba si los 3 dados son iguales
			resultado = 10;
		}

		else if (dado1 == dado2 && dado2 == dado3 && dado1 == dado3) {

			resultado = 2;

		} else {
			resultado = 0;
		}

		return resultado;
	}

	public int hacerApuesta(int cantidad) {

		int retorno = 1;

		if (saldoInicial >= cantidad) {

			saldoInicial -= cantidad;

			lanzarDados();// Lanzamos los dados llamando al metodo
			System.out.println("Los valores que han salido son: " + dado1 + dado2 + dado3);

			int resultado = comprobarResultado();// Aqui comprobamos el resultado

			if (resultado == 0) {
				System.err.println("Lo sentimos, has perdido la apuesta");

			}

			else if (resultado == 2) {

				System.out.println("Hay dos valores iguales. Has ganado " + resultado * cantidad);
			}

			else {
				System.out.println("Has hecho pleno!!. Has ganado " + resultado * cantidad);
			}

			saldoInicial += (resultado * cantidad); // Actualizamos el saldo
		}

		else {
			retorno = -1;
		}

		return retorno;
	}
}
