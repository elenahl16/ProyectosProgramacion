package Ejer3;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta(1654879,"Pepito","2054877F", 0);
		
		Cuenta c2 = new Cuenta(7894561,"Roberta","205678B",0);
		
		c1.mostrarDatosCuenta();
		System.out.println("-----------------------------");
		c2.mostrarDatosCuenta();
		
		c1.hacerIngreso(600);
		System.out.println("-----------------------------");
		c1.hacerTransferencia(600,c2);
		
		c1.mostrarDatosCuenta();
		System.out.println("-----------------------------");
		c2.mostrarDatosCuenta();
		
	/*	int retorno=c1.hacerIngreso(700);
		
		if(retorno ==1) {
			System.out.println("El ingreso se ha hecho correctamente");
		}
		else {
			System.err.println();
		}
		c1.mostrarDatosCuenta();
		
		retorno=c1.hacerIngreso(-100);
		*/
		
		
	}

}
