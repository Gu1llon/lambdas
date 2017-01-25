package com.everis.cursojava.genericos;

public class ClaseGenerica<T> {
		  T obj;
		 
		  public ClaseGenerica(T o) {
			 this.obj = o;
		  }
		 
		  public void mostrarTipo() {
		    System.out.println("El tipo de T es " + obj.getClass().getName());
		  }
}

