package ejercicio;

public class DatosPersona {
	// Atributos

	private String nombre, direccion, numFijo, numMovil, gmail;

	public DatosPersona() {
		// Constructor por defecto

	}

	public DatosPersona(String nombre, String direccion, String fijo, String movil, String gmail) {
		// Constructor parametrizado
		
		this.nombre=nombre;
		this.direccion=direccion;
		this.numFijo= fijo;
		this.numMovil=movil;
		this.gmail=gmail;

	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumFijo() {
		return numFijo;
	}

	public void setNumFijo(String numFijo) {
		this.numFijo = numFijo;
	}

	public String getNumMovil() {
		return numMovil;
	}

	public void setNumMovil(String numMovil) {
		this.numMovil = numMovil;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	public String formatoCorto() {
		
		String resultado;
		resultado = nombre + "(" + numFijo + "," + numMovil + ")";		
		return resultado;
	}

}
