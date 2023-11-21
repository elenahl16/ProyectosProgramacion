package EjerEncapsul;

public class SimuladorDados {
	// Atributos

	private int dado1, dado2, dado3, dado4;
	private int numeroLanzanientos;

	public SimuladorDados() {
		// Construcyor por defecto

	}

	public SimuladorDados(int dado1, int dado2, int dado3, int dado4, int numeroLanzamientos) {
		// Constructor parametrizado

		this.dado1 = dado1;
		this.dado2 = dado2;
		this.dado3 = dado3;
		this.dado4 = dado4;

	}

	private int lanzarDado() {
		int numero = ((int) Math.random() * 6) + 1;
		return numero;
	}

	public void lanzarDados() {

		this.dado1 = lanzarDado();
		this.dado2 = lanzarDado();
		this.dado3 = lanzarDado();
		this.dado4 = lanzarDado();
		numeroLanzanientos++;

	}

	public void getUltimaJugada() {

		System.out.println("La tirada del primer dado es: " + dado1);
		System.out.println("La tirada del segundo dado es: " + dado2);
		System.out.println("La tirada del tercer dado es: " + dado3);
		System.out.println("La tirada del cuarto dado es: " + dado4);

	}

	public int getNumeroLanzamientos() {

		return numeroLanzanientos;

	}

	public int calcularSumaUltimoLanzamiento() {
		int resultadoTirada;

		return resultadoTirada = dado1 + dado2 + dado3 + dado4;
	}

	public int comprobarResultadoUltimoLanzamiento() {

		int resultadoPuntos = 0;

		if (dado1 == dado2 || dado2 == dado3 || dado3 == dado4) {

			resultadoPuntos = 4;

		}

		else if (dado2 == dado3 || dado2 == dado1 || dado2 == dado4) {
			resultadoPuntos = 3;

		} else if (dado3 == dado1 || dado3 == dado2 || dado3 == dado4) {
			resultadoPuntos = 2;
		}

		else if (dado4 == dado1 || dado4 == dado2 || dado4 == dado3) {
			resultadoPuntos = 1;
		}

		else {
			resultadoPuntos = 0;

		}
		return resultadoPuntos;

	}

	public void estadisticasTiradas(int numTiradas) {

		int numPoker = 0, numTrio = 0, numParejasDobles = 0, numParejas = 0;

		while (numTiradas < numeroLanzanientos) {

			// Lanzamos los dados una vez
			lanzarDados();
			// Comprobamos si hay alguna jugada con puntos

			int resultado = comprobarResultadoUltimoLanzamiento();
			if (resultado == 4) {
				numPoker++;
			} else if (resultado == 3) {
				numTrio++;
			} else if (resultado == 2) {
				numParejasDobles++;
			} else if (resultado == 1) {
				numParejas++;
			}

			System.out.println("El número de lanzamientos total es: " + numTiradas);
			System.out.println("---------------------------------------------------------");
			System.out.println("Número de póker es de: " + numPoker);
			System.out.println("Número de trios es de: " + numTrio);
			System.out.println("Número de dobles parejas es de: " + numParejasDobles);
			System.out.println("Número de parejas simples es de: " + numParejas);
			System.out.println("---------------------------------------------------------");

		}

	}

	public int tiradasHastaPoker() {

		int contador = 0;

		boolean salir = false;

		while (salir == false) {

			contador++;

			lanzarDados();

			// Comprobamos si hay alguna jugada con puntos

			if (comprobarResultadoUltimoLanzamiento() == 4)

				salir = true;

		}
		return contador;
	}

}
