package poo.sobrecarga;

public class Perro extends Animal{
	
	private String nombrePerro;
	private double raza;
	private double peso;
	private double sexo;
	
	@Override
	public void hacerSonido() {
		System.out.println("Soy un perro y ladro.");
	}

}
