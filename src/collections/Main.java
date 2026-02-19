package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Persona> listaArray = new ArrayList<Persona>();
		listaArray.add(new Persona(1, "Jose", 22));
		listaArray.add(new Persona(2, "Juan", 23));
		listaArray.add(new Persona(3, "Mario",21));
		listaArray.add(new Persona(4, "Fiora", 25));
		
		List<Persona> listaLinked = new LinkedList<Persona>();
		listaLinked.add(new Persona(1, "Jose", 22));
		listaLinked.add(new Persona(2, "Juan", 23));
		listaLinked.add(new Persona(3, "Mario",21));
		listaLinked.add(new Persona(4, "Fiora", 25));
		
		//Remove en ArrayList
		listaArray.remove(1);
		
		//Remove en LinkedList
		String nombreBorrar = "Jose";
		for(Persona persona2 : listaLinked) {
			if(persona2.getNombre().equals(nombreBorrar)) {
				listaLinked.remove(persona2);
				break; //FOREACH deja de recorrer
			}
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		//Conocer el tamaño de la lista
		System.out.println("ArrayList: " + listaArray.size());
		System.out.println("LinkedList: " + listaLinked.size());
		
		System.out.println("----------------------------------------------------------------------");
		//Obtener primer y ultimo objeto (SOLO PARA LINKEDLIST)
		System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
		System.out.println("Ultimo en LinkedList: " + listaLinked.getLast().toString());
		
		System.out.println("-----------------------------------------------------------------------");
		//Borrar toda la lista
		listaArray.clear();
		listaLinked.clear();
		
		System.out.println("------------------------------------------------------------------------");
		//Comprobar si la lista esta vacia
		listaArray.isEmpty();
		listaLinked.isEmpty();
	}

}
