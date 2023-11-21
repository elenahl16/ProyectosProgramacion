package EjerPersona;

public class Principal {

	public static void main(String[] args) {
		
		Persona pers1 = new Persona(25,"Pepe","Lozano","Calle pez");
		
		System.out.println("Su nombre y apellido es " + pers1.nombre + " " + pers1.apellido);
		System.out.println("Tiene " + pers1.edad + " años");
		System.out.println("La dirección es: " + pers1.direccion);
		
	}

}
