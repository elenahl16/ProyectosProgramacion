package Ejer4;

public class MedidorTiempo {
	// Atributos

	long puntoReferencia, ultimaMedia;// Tipo long utiliza 8 byte

	public MedidorTiempo() {
		// Constructor por defecto

		this.ultimaMedia = 0;
		this.puntoReferencia = System.currentTimeMillis();

	}

	public MedidorTiempo(long puntoReferencia, long ultimaMedia) {
		// Constructor parametrizado

	}

	public void setPuntoReferencia() {

		this.puntoReferencia = System.currentTimeMillis();
	}

	public long tomarMedida() {

		long tiempo;
		tiempo = System.currentTimeMillis() - puntoReferencia;

		ultimaMedia = tiempo;
		return tiempo;

	}

	public long devolverMedida() {

		return ultimaMedia;
	}

	public double devolverUltimaMedidaSegundo() {

		///Ojo con el detalle de la division entera
		return ((double) ultimaMedia) / 100;
		
		//aqui lo que hacemos es cambiar ultimaMedia a double
		// otra opcion que es lo mismo si ponemos return double ultimaMedia / 100.0;

	}
}
