package poo.basico;

public class Main {
	
	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno(); //Crear alumno vacio
		Alumno alu2 = new Alumno(5, "Juan", "Burgos");//Crear alumno con datos cargados
		
		//Mostrar datos del alumno cargado
		
		System.out.println("La id del Alumno 2 es " + alu2.getId());
		System.out.println("Su nombre es " + alu2.getNombre());
		System.out.println("Su apellido es " + alu2.getApellido());
		
		System.out.println("------------------------------------");
		
		//Cargar datos al alumno vacio
		
		alu1.setId(8);
		alu1.setNombre("Monica");
		alu1.setApellido("Vaalson");
		
		System.out.println("La id del Alumno 1 es " + alu1.getId());
		System.out.println("Su nombre es " + alu1.getNombre());
		System.out.println("Su apellido es " + alu1.getApellido());
		
		System.out.println("-------------------------------------");
		
		//Sobreescritura
		
		alu1.setId(38);
		System.out.println("La nueva id del alumno 1 es " + alu1.getId());
	}

}
