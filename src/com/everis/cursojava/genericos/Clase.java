package com.everis.cursojava.genericos;

public class Clase {
	
 public static void main(String args[]) {

	 	ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
	    intObj.mostrarTipo();
	 
	    ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
	    strObj.mostrarTipo();
	    }
 
 
}
