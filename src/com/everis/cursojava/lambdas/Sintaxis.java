package com.everis.cursojava.lambdas;

/**
 * The Class Sintaxis.
 */
public class Sintaxis {

	/**
	 * Probar syntaxis.
	 *
	 * @return the double
	 */
	public double probarSyntaxis(){
		Operacion operacion = (double x, double y) -> (x+y)/2;
		
		
		return operacion.calcularPromedio(2, 3);
		
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		Sintaxis app = new Sintaxis();
		System.out.println(app.probarSyntaxis());
	}
}
