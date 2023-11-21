package pruebas;

import java.util.Arrays;

public class PruebaArray3 {
	//Atributos
	
	
	
	public static int[] copiarArra(int[] arDatos) {

		int[] resultado = new int[arDatos.length];
                              
		for (int i = 0; i < arDatos.length; i++) {
			
			resultado [i] = arDatos[i];//aqui lo que hacemos una copia exacta del array ardatos
		
		}
		return resultado;
	}

	public static void main(String[] args) {
		
		int [] arDatos={10,2,6,4,1};
		
		int [] resu = copiarArra(arDatos);
		
		System.out.println(Arrays.toString(resu));
		
		System.out.println(Arrays.toString(arDatos));
	}
}
