package EjerPersona;

public class Persona {
	//Atributos
	
	int edad;
	String nombre,apellido,direccion;
	
	
	
	public Persona() {
		//Constructor por defecto
		
	}
	
	public Persona(int edad, String nombre, String apellido,String direccion) {
		//Constructor parametrizado
		
		this.edad=edad;
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
	}
	
	public void mostrar() {
		
		System.out.println("Su edad es: " + edad);
		System.out.println("Su nombre y apellido es: " + nombre + " " + apellido);
		System.out.println("Su dirección es: " + direccion);
	}
	
	
	

}
