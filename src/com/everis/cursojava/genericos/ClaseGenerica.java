package com.everis.cursojava.genericos;

/**
 * The Class ClaseGenerica.
 *
 * @param <T> the generic type
 */
public class ClaseGenerica<T> {
		  
  		/** The obj. */
  		T obj;
		 
		  /**
  		 * Instantiates a new clase generica.
  		 *
  		 * @param o the o
  		 */
  		public ClaseGenerica(T o) {
			 this.obj = o;
		  }
		 
		  /**
  		 * Mostrar tipo.
  		 */
  		public void mostrarTipo() {
		    System.out.println("El tipo de T es " + obj.getClass().getName());
		  }
}

