package BoletinCadenas;

/*
 * Escribe un programa que tome una cadena y cuente cuántas palabras la componen.
   Como separador de palabras se considerarán los caracteres: “. , : ; y el espacio”
 */
public class EjerBoletinString7 {
	// Atributos

	public EjerBoletinString7() {
		// Constructor por defecto
	}

	public int contadorPalabra(String cadena) {

		int contador = 0;
		boolean anteriorSeparador=true;

		for (int i = 0; i < cadena.length(); i++) {
			char caracterLeido = cadena.charAt(i);

			if (caracterLeido == ' ' || caracterLeido == ',' || caracterLeido == '.' || caracterLeido == ':'
					|| caracterLeido == ';') {
				anteriorSeparador=true;

			}
			else {
				 if(anteriorSeparador==true) {
					 contador++;
				 }
				 
				 anteriorSeparador=false;
			}

		}
		return contador;
	}
	
	public static void main(String[] args) {

		EjerBoletinString7 ejer7 = new EjerBoletinString7();
		System.out.println(ejer7.contadorPalabra("Hola, buenas tardes"));

	}

}
