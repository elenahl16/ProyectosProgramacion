package BoletinCadenas;

/*
 * Crea un método que tome una cadena y reemplace todas las letras minúsculas por
	mayúsculas y viceversa.
 */
public class EjerBoletinString3 {
	// Atributos

	private String cadena;

	public EjerBoletinString3() {
		// Constructor por defecto

	}

	public EjerBoletinString3(String cadena) {
		// Constructor parametrizado

		this.cadena = cadena;
	}

	public String invertirMinuscMayusc(String cadena) {

		String resultado = "";
		String cadenaMin = cadena.toLowerCase();
		String cadenaMay = cadena.toUpperCase();
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) == cadenaMin.charAt(i)) {
				resultado+=cadenaMay.charAt(i);
				
			}
			else {
				resultado+=cadenaMin.charAt(i);
			}

		}
		return resultado;

	}
}
