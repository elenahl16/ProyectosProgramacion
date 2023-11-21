package BoletinCadenas;

/*
 * Haz un método que devuelva las iniciales de un nombre pasado por parámetro. Por
   ejemplo si le paso “Fernando García Castillo”, debería devolver “F.G.C.”.
 */
public class EjerBoletinString5 {
	// Atributos

	private String nombreCompleto;

	public EjerBoletinString5() {
		// Constructor por defecto

	}

	public String contarCaracter(String nombreCompleto) {

		String cadenaMay = nombreCompleto.toUpperCase();// aqui creo una variable donde voy a guardar
		// el nombreCompleto en mayusculas

		nombreCompleto.trim();// quito todos los espacios
		String resultado = "";

		for (int i = 0; i < nombreCompleto.length(); i++) {

			char caracterLeido = nombreCompleto.charAt(i);
			resultado += nombreCompleto;

			if (caracterLeido == cadenaMay.charAt(i)) {
				System.out.print(caracterLeido + ".");
			}
		}

		return resultado;
	}

	public static void main(String[] args) {

		EjerBoletinString5 ejer5 = new EjerBoletinString5();
		ejer5.contarCaracter("Elena Hernández Lozano");

	}

}
