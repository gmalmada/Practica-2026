package metodosEnum;

public class MetodosEnum {
	
	public static void main(String[] args) {
		
		for(Color c : Color.values()) {
			System.out.println("Colores: " + c);
		}
		
		System.out.println("----------------------------------------");
		
		Color col = Color.AZUL;
		
		//Mostrar el nombre del color
		System.out.println(col.name());
		
		//Mostrar posicion dentro del Array
		System.out.println(col.ordinal());
		
		//Mostrar segun un valor  dentro de la lista
		//Caso valor DENTRO del array
		col = Color.valueOf("AZUL");
		System.out.println("Encontré " + col);
		
		//Caso valor QUE NO ESTA en el array
		try {
		col = Color.valueOf("ASUL");
		System.out.println("Encontré " + col);
		} catch(IllegalArgumentException e) { //Primero pruebo sin Exception, para ver que Excepcion tira por defecto, y luego la uso aca
			System.out.println("El valor no es correcto.");
		}
	}
}
