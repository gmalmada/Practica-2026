package collections;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {
	
	public static void main(String[] args) {
		
		//Map<TipodDeDatoClave, TipoDeDatoValor> nombreHashMap ...
		Map<Integer, String> mapaEmpleados = new HashMap<>();
		
		//Agregar al HashMap
		//nombreHashMap.put(ValorClave, Contenido);
		mapaEmpleados.put(1523, "Hola muy buenas");
		mapaEmpleados.put(1621, "Que tal");
		mapaEmpleados.put(1477, "Como va");
		
		//Consultar por valor dentro del Mapa
		mapaEmpleados.containsValue("Como va");
		
		//Para mostrarlo en pantalla
		boolean estaNoEsta = mapaEmpleados.containsValue("Como va");
		System.out.println(estaNoEsta);
		
		//Consultar por clave dentro del Mapa
		mapaEmpleados.containsKey(1621);
		
		boolean estaClave = mapaEmpleados.containsKey(1621);
		System.out.println(estaClave);
		
		//Consultar todos los valores dentro del mapa
		System.out.println(mapaEmpleados.values());		
		
		//Consultar todas las claves dentro del mapa
		System.out.println(mapaEmpleados.keySet());
		
		//Traer un valor asociado a una Key (Clave), usando la Key y guardando el contenido en una variable.
		
		String nombre = mapaEmpleados.get(1621);
		System.out.println(nombre);
		
		//Eliminar de un Mapa
		mapaEmpleados.remove(1523);
		System.out.println(mapaEmpleados.keySet());
		
	}

}
