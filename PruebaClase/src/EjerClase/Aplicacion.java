package EjerClase;

public class Aplicacion {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();// Intanciamos la clase Rectangulo,r1 son variables que nombran 
		//a ese objeto de la clase

		r1.lado1 = 3;
		r1.lado2 = 4;
		
		double area=r1.calcularArea();	// es lo mismo si ponemos r1.calcularArea();
		System.out.println("El area es: " + area);
		System.out.println("El perimero es: "  + r1.calcularPerimetro());
		
		

	}

}
