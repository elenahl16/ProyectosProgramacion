package EjercMatriz;

/*
 * metodo que pase una tabla y nos tiene que devolver una array de enteros 
 * 
 */
public class EjerMatriz {
	// Atributos

	public EjerMatriz() {
		// Constructor por defecto
	}

	public static int[] sumaFilas(int[][] tabla, int sumaArray) {

		int[] resultado = new int[tabla.length];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {

				resultado[i] += tabla[i][j];
			}

		}

		return resultado;
	}

	public static void main(String[] args) {

	}

}
