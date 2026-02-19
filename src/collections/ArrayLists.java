package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		//List<Objeto> NombreLista = new TipoDeLista<Objeto>();
		List<Persona> lista = new ArrayList<Persona>();
		
		//Crear una persona y añadirla a una lista
		Persona perso = new Persona(1, "Esteban", 24);
		//Añadir a una lista
		lista.add(perso);
		
		//Crear la persona al mismo tiempo que la añado
		lista.add(new Persona(2, "Jose", 22));
		lista.add(new Persona(3, "Maria", 30));
		lista.add(new Persona(4, "Julia", 21));
		
		//Recorrer lista por índice
		for(int i = 0; i< lista.size(); i++) {
			System.out.println("Prueba: " + lista.get(i).getNombre());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		//Recorrer elemento por elemento (FOREACH)
		for(Persona pers : lista) { //	Por cada <Tipo> VariableAuxiliar que este dentro de <NombreLista>...
			System.out.println("Prueba: " + pers.getNombre());
		}
		
	}

}
