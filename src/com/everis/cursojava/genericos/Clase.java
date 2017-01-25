package com.everis.cursojava.genericos;

/**
 * The Class Clase.
 */
public class Clase {
	
 /**
  * The main method.
  *
  * @param args the arguments
  */
 public static void main(String args[]) {

	 	ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
	    intObj.mostrarTipo();
	 
	    ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
	    strObj.mostrarTipo();
	    }
 
 
}
