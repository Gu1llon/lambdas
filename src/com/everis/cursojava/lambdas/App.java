package com.everis.cursojava.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The Class App.
 */
public class App {
	
	 /**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
 	public static void main(String[] args) {
		 App app = new App();
		 app.ordenar();
		 app.calcular();
	 }
	 
	/**
	 * Ordenar.
	 */
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("Aquiles Brinco");
		lista.add("Elmer Curio");
		lista.add("Elba Calao");
		lista.add("Elvio Lao");
		lista.add("Esteban Dido");
		lista.add("Susana Orias");
		lista.add("Armando Mocha");
		lista.add("Zampa teste");
		
		/*Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		
		});
		*/
		
		Collections.sort(lista, (String o1, String o2) -> o1.compareTo(o2));
		
		for (String element : lista) {
			System.out.println(element);	
		}
		
	 }
	
	/**
	 * Calcular.
	 */
	public void calcular(){
		
//		Operacion operacion = new Operacion() {
//			
//			@Override
//			public double calcularPromedio(double n1, double n2) {
//				return n1 + n2 / 2;
//			}
//		};
		
		Operacion operacion = (double x, double y) -> (x+y)/2;
		System.out.println(operacion.calcularPromedio(4, 9));
	
	}
	
	
	 
}
