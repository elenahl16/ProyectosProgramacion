package Ejer4;

public class Aplicacion {

	public static void main(String[] args) {

		MedidorTiempo medidortiempo1 = new MedidorTiempo();

		for (int i = 0; i < 100; i++) {

			System.out.println("Hola Perros");

		}
		
		long tiempo = medidortiempo1.tomarMedida();
		
		System.out.println("El tiempo en hacer el bucle es: " + tiempo);

	}

}
