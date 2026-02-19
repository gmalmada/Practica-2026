package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
	
	public static void main(String[] args) {
		
		//List<Objeto> NombreLista = new TipoDeLista<Objeto>();
		List<Persona> lista = new LinkedList<Persona>();
		
		//Añadir a la lista
		lista.add(new Persona(1, "Esteban",24));
		lista.add(new Persona(2, "Jose", 22));
		lista.add(new Persona(3, "Maria", 30));
		lista.add(new Persona(4, "Julia", 21));
		
		//Añadir al principio
		//lista.add( 0(Parametro indicador para añaadir al principio), new <Objeto>...
		lista.add(0, new Persona(0, "AlPrincipio", 19));
		
		//Al no tener indice, uso FOREACH
		for(Persona perso : lista) {
			System.out.println("Prueba: " + perso.getNombre());
		}
		
	}

}
