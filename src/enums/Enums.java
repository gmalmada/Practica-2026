package enums;

public class Enums {
	
	//enum <Nombre>{ Valores }
	enum Color{ 
		ROJO, AZUL, AMARILLO, VERDE, NARANJA
	}
	//Color ahora es un tipo de dato, como si de una clase se tratara.
	
	public static void main(String[] args) {
		
		Color color = Color.AMARILLO;
		
		System.out.println("El color es: " + color);
		
		System.out.println("--------------------------------------------------------");
		
		//Mostrar todos los valores
		
		for(Color c : Color.values()) {
			System.out.println("Color: " + c);
		}
		
	}

}
