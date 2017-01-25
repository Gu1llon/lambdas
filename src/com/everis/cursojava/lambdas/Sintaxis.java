package com.everis.cursojava.lambdas;

public class Sintaxis {

	public double probarSyntaxis(){
		Operacion operacion = (double x, double y) -> (x+y)/2;
		
		
		return operacion.calcularPromedio(2, 3);
		
	}
	
	public static void main(String[] args){
		Sintaxis app = new Sintaxis();
		System.out.println(app.probarSyntaxis());
	}
}
