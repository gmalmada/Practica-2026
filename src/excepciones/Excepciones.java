package excepciones;

public class Excepciones {
	
	public static void main(String[] args) {
		
		try {
			int resultado = 3 / 0;
		}
		catch(Exception e) { // catch Exception nombreVariable
			System.out.println("No se puede dividir por cero.");
		}
		
		int edades[] = {10, 11, 12, 13};
		
		try {
		System.out.println("La edad en la posicion 4 es " + edades[4]);
		}
		catch(Exception e1) {
			System.out.println("El indice ingresado no existe");
		}
	}

}
