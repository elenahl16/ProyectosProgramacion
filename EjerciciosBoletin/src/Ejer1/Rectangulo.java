package Ejer1;

public class Rectangulo {
	// Atributos

	double lado1, lado2;

	public Rectangulo() {
		// Constructor por defecto

	}

	public Rectangulo(double lado1, double lado2) {
		// Constructor parameterizado

		this.lado1 = 5;
		this.lado2 = 6;
	}

	public double calcularArea(double lado1, double lado2) {

		double area = lado1 * lado2;
		return area;
	}

	public double calcularPerimetro(double lado1, double lado2) {

		double perimetro = (2 * lado1) + (2 * lado2);
		return perimetro;
	}

}
