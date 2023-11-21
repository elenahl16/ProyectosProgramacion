package pruebas;

public class PruebaArray {

	public static void mostrarContenido(int[] arrayNum) {

		for (int i = 0; i < arrayNum.length; i++) {
			int valor = arrayNum[i];
			System.out.println(valor);
		}

	}

	public static int[] contarParesImpares(int[] arrayNum) {

		int contadorNumPar = 0, contadorNumImpar = 0;

		/*
		 * Primera forma for(int i=0; i<arrayNum.length;i++) {
		 * 
		 * int valor=arrayNum[i];
		 * 
		 * }
		 */

		for (int valor : arrayNum) {
			if (valor % 2 == 0) {
				contadorNumPar++;

			} else {
				contadorNumPar++;
			}

			int[] resultado = { contadorNumImpar, contadorNumPar };
			return resultado;
		}
		return arrayNum;

	}

	public static void main(String[] args) {

		int[] arrayNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// Aqui creamos el array y le decimos q tiene 10 posiciones
		int sumaPar = 0, sumaImp = 0;

		for (int i = 0; i < arrayNum.length; i++) {// Recorremos las distintas posiciones del array

			int valor = arrayNum[i];

			if (valor % 2 == 0) {
				sumaPar += valor;

			}

			else {
				sumaImp += valor;

			}
		}

		System.out.println(sumaPar);
		System.out.println(sumaImp);

	}

}
