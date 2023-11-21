package EjercMatriz;

public class Aplicacion {

	public static void main(String[] args) {

		int[][] tabla = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		/*
		 * int[][] tabla = new int[4][3]; Primer corchete es la fila y el segundo la
		 * columna
		 * 
		 * tabla[0][0] = 1; tabla[0][1] = 2; tabla[0][2] = 3;
		 * 
		 * tabla[1][0] = 4;
		 */
		int suma = 0;

		for (int i = 0; i < tabla.length; i++) { // aqui recorremos con un for la filas

			for (int j = 0; j < tabla[i].length; j++) {

				System.out.print(" |" + tabla[i][j] + " |");
				suma += tabla[i][j];

			}

			System.out.print("\n");

		}
	}
}

/* ---- NOTACIONES ---
 *   
 */
