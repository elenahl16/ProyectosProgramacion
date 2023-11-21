package Ejer3;

import java.util.Scanner;

public class Cuenta {

	static Scanner teclado = new Scanner(System.in);

	// Atributos

	int idCuenta;
	String nombreTitular;
	String dniTitular;
	double saldo;

	/*
	 * Métodos
	 */
	public Cuenta() {
		// Contructor por defecto

	}

	public Cuenta(int idCuenta, String nombreTitular, String dniTitular, double saldo) {
		// Contructor parametrizado

		this.idCuenta = idCuenta;
		this.nombreTitular = nombreTitular;
		this.dniTitular = dniTitular;
		this.saldo = saldo;

	}

	public double obtenerSaldo() {

		return saldo;
	}

	public int hacerIngreso(double cantidad) {

		if (cantidad >= 0) {
			saldo += cantidad;
			return 1;
		} else {
			return -1;
		}
	}

	public int hacerReintegro(double cantidad) {

		System.out.println("Introduce la cantidad de tu saldo");
		cantidad = teclado.nextInt();

		if (cantidad > saldo) {

			return -1;// Si el saldo es insuficiente
		}

		else {
			saldo -= cantidad;
			return 1;
		}

	}

	public void mostrarDatosCuenta() {

		System.out.println("El id de la cuenta es:  " + idCuenta);
		System.out.println("El nombre del Titular es: " + nombreTitular);
		System.out.println("Dni del Titular es: " + dniTitular);
		System.out.println("Su saldo actual es: " + saldo);

	}

	public int hacerTransferencia(double cantidad,Cuenta uniCaja) {

		// Compruebo que tengo saldo suficiente
		if (saldo >= cantidad) {

			saldo -= cantidad;// Aqui disminuyo el saldo de la cuenta origen
			uniCaja.hacerIngreso(cantidad);// Aqui incremento el saldo en la cuenta destino
			return 1;
		} 
		
		else {
			return 0;// aqui es donde habria un problema y no se podria hacer
		}

	}

}
