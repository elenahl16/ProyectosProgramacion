package EjerClase;
/*
 * @Elena Hernández Lozano
 */
public class Rectangulo {
	//Atributos, se definen al principio de la clase
	
	double lado1, lado2;
	
	public Rectangulo(){
		//Constructor por defecto es donde inicializamos los valores q tienen los actributos de esa clase
		
		
	}
	
	public Rectangulo(double lado1, double lado2) {
		// Constructor parametrizado
		
		this.lado1=lado1;
		this.lado2=lado2;
		
	}
	
	public double calcularArea() {
		//Método de la clase para calcular el area
		
		double area= lado1*lado2;
		return area; //aqui ponemos return al dato que queremos devolver
		
	}
	
	public double calcularPerimetro() {
		//Método de la clase para calcular el perimetro
		
		double perimetro= (2*lado1)+(2*lado2);
		return perimetro; //aqui ponemos return al dato que queremos devolver
		
		/*
		 * También se puede poner de forma más directa de esta manera:
		 * return (2*lado1)+(2*lado2);
		 * Que lo hace es devolverme la suma de todos los lados del rectangulo
		 */
	}

}
