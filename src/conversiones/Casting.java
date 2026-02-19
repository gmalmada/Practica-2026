package conversiones;

public class Casting {
	
	public static void main(String[] args) {
		
		//Variable a convertir
		double num = 1.67;
		
		//Casteo a entero
		int numInt = (int) num;
		
		//Casteo a long
		long numLong = (long) num;
		
		
		System.out.println("Double: " + num);
		System.out.println("Int: " + numInt);
		System.out.println("Long: " + numLong);
		
		System.out.println("-----------------------------------------------------------------");
		//Casteo de Strings (PARSEO)
		
		String cantidad = "15";
		String precio = "150.27";
		
		int cantInt = Integer.parseInt(cantidad); 
		double precioDouble = Double.parseDouble(precio);
		
		//double resul = cantInt * precioDouble;
		System.out.println("El valor de la compra es " + cantInt*precioDouble);
		
		System.out.println("-----------------------------------------------------------------");
		//Casteo a String
		
		int edad = 30;
		double altura = 1.67;
		
		String edadString = String.valueOf(edad);
		String alturaString = String.valueOf(altura);
		
		System.out.println("Edad: " + edadString);
		System.out.println("Altura: " + alturaString);
		
		
	}

}
