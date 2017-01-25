package com.everis.cursojava.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas2 {

	String[] datos= new String[]{   
	        "Hola","Adios","Spast","Kaiser","Adelante","BBVA","Schwuchtel",
	        "Kanacke","Garganta","Negro","Everis","Rojo","Lambda","Tramboliko"};
	
	private void ejercicios(){
        //los metodos se encargaran de quitar las palabras de la lista que contengan una longuitud impar
        System.out.println("Longuitud Impar Sin Lambda");
        metodoSinLambdaA();
        System.out.println("Longuitud Impar Con Lambda");
        metodoConLambdaA();
        //los metodos se encargaran de pasar cada palabra a mayusculas
        System.out.println("Mayusculas Sin Lambda");
        metodoSinLambdaB();
        System.out.println("Mayusculas Con Lambda");
        metodoConLambdaB();
        //los metodos se encargaran de ordenar las palabras en orden alfabetico
        System.out.println("Orden de las palabras");
        metodoOrden();
    }
	
	private void metodoSinLambdaA() {
		List<String> lista = new ArrayList<>(Arrays.asList(datos));
        List<String> listaNueva = new ArrayList<>();        
        for (int index = 0;index<lista.size();index++) {
            if(lista.get(index).length()%2==0){
                listaNueva.add(lista.get(index));
            }
        }        
        System.out.println(listaNueva);
	}
	
	private void metodoConLambdaA() {
		List<String> lista = new ArrayList<>(Arrays.asList(datos));
        lista.removeIf(s -> s.length()%2 != 0);
        System.out.println(lista);
	}
	
	private void metodoSinLambdaB() {
		List<String> lista = new ArrayList<>(Arrays.asList(datos));
        for (int index = 0;index<lista.size();index++) {
            lista.set(index, lista.get(index).toUpperCase());
        }
        System.out.println(lista);
	}
	private void metodoConLambdaB() {
		List<String> lista = new ArrayList<>(Arrays.asList(datos));
        lista.replaceAll(String::toUpperCase);
        System.out.println(lista);
		
	}
	private void metodoOrden() {
		List<String> lista = new ArrayList<>(Arrays.asList(datos));
        System.out.println((lista.stream().sorted().sorted().collect(Collectors.toList())));
		
	}
	
	 public static void main(String[] args) {
	        new Lambdas2().ejercicios();
	    }   
}
