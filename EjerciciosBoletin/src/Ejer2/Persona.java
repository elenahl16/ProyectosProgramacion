package Ejer2;

public class Persona {
	// Atributos

	String nombre, direccion;
	double altura;
	int edad;

	public Persona() {
		// Constructor por defecto
	}

	public Persona(String nombre, String direccion, double altura, int edad) {
		// Contructor parametrizado

		this.nombre = nombre;
		this.direccion = direccion;
		this.altura = altura;
		this.edad = edad;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarDatosPersonales() {

		System.out.println("Mi nombre es: " + getNombre());
		System.out.println("Mi edad es: " + getEdad());
		System.out.println("Mi altura es: " + getAltura());
		System.out.println("Mi direccion es :" + getDireccion());
	}

	public static void main(String[] args) {

		Persona p1 = new Persona();
		p1.setNombre("Desconocido");
		p1.setDireccion("C/SinNombre,");
		p1.setAltura(1.75);
		p1.setEdad(35);
		
		System.out.println("Mi nombre es: " + p1.nombre);
		System.out.println("Mi edad es: " + p1.edad);
		System.out.println("Mi altura es: " + p1.altura);
		System.out.println("Mi direccion es : " + p1.direccion);
		System.out.println("--------------------------------------");
		
		Persona p2 = new Persona("Pepe", "Calle sol", 1.80, 26);
		System.out.println("Mi nombre es: " + p2.nombre);
		System.out.println("Mi edad es: " + p2.edad);
		System.out.println("Mi altura es: " + p2.altura);
		System.out.println("Mi direccion es : " + p2.direccion);

	}
}
