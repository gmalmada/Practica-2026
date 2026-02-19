package collections;

import java.util.Stack;

public class Pilas {
	
	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<Integer>();
		
		System.out.println("Pila: " + pila);
		System.out.println("Esta vacia? " + pila.isEmpty());
		
		//Agregar a la pila
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		
		//Recorrer la pila
		for(Integer pilita: pila) {
			System.out.println(pilita);
		}
		
		//Mostrar la pila actual
		System.out.println("Pila: " + pila);
		System.out.println("Esta vacia? " + pila.isEmpty());
		
		//Eliminar el ultimo objeto que entró
		pila.pop();
		
		//Buscar en la pila
		System.out.println("Esta el 3?" + pila.search(3)); 
		//Si devuelve Numero positivo = Si esta. Numero negativo= No esta
		
		//Mostrar ultimo agregado
		System.out.println("Ultimo objeto: " + pila.peek());
	}

}
