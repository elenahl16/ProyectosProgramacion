package BoletinCadenas;
/*
 * Escribe un programa que tome una cadena y cuente cuántas veces aparece una
 palabra específica en ella.
 */

public class EjerBoletinString8 {
	// Atributos
	

	public int contadorPalabra(String cadena, String palabraEspecifica) {

		int contador = 0;
		int posicion=cadena.indexOf(palabraEspecifica);
		
		while (posicion!= -1) {
			contador++;
			 posicion=cadena.indexOf(palabraEspecifica,posicion + 1);
		}
		return contador;
	}
}
