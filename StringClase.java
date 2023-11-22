package pruebas;

public class StringClase {

	public static String sustitucion(String cadena, char caracter) {

		char[] ar = cadena.toCharArray();

		for (int i = 0; i < cadena.length(); i++) {
			if(caracter == ar[i]) {
				ar[i]='-';
				
			}
			
		}
		return new String(ar);
	}

	public static void main(String[] args) {

		String cadena = "Hola";

	}
}
