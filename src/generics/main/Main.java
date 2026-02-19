package generics.main;

import generics.caja.Caja;

public class Main {
	
	public static void main(String[] args) {
		
		//Crear la caja
		Caja<String> cajaString = new Caja<>();
		
		//Guardar dentro de la caja
		cajaString.ponerAlgo("Buenos Dias");
		String contenido = cajaString.obtenerAlgo();
		System.out.println("El contenido es: " + contenido);
		
		System.out.println("                                                                  ");
		
		//Guardar dentro de la caja un Integer
		Caja<Integer> cajaEnteros = new Caja<>();
		
		cajaEnteros.ponerAlgo(24);
		int numero = cajaEnteros.obtenerAlgo();
		System.out.println("El contenido es: " + numero);
		
	}

}
