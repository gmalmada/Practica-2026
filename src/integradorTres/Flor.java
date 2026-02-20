package integradorTres;

public class Flor extends Planta{
	
	private String colorPetalos;
	private int cantPetalos;
	private String colorPistilo;
	private String variedad;
	private String estacionFlorece;
	
	public Flor() {}
	

	public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos,
			int cantPetalos, String colorPistilo, String variedad, String estacionFlorece) {
		super(nombre, altoTallo, tieneHojas, climaIdeal);
		this.colorPetalos = colorPetalos;
		this.cantPetalos = cantPetalos;
		this.colorPistilo = colorPistilo;
		this.variedad = variedad;
		this.estacionFlorece = estacionFlorece;
	}

	


	public String getColorPetalos() {
		return colorPetalos;
	}


	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}


	public int getCantPetalos() {
		return cantPetalos;
	}


	public void setCantPetalos(int cantPetalos) {
		this.cantPetalos = cantPetalos;
	}


	public String getColorPistilo() {
		return colorPistilo;
	}


	public void setColorPistilo(String colorPistilo) {
		this.colorPistilo = colorPistilo;
	}


	public String getVariedad() {
		return variedad;
	}


	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}


	public String getEstacionFlorece() {
		return estacionFlorece;
	}


	public void setEstacionFlorece(String estacionFlorece) {
		this.estacionFlorece = estacionFlorece;
	}


	@Override
	public void decirQueSoy() {
		System.out.println("Hola soy una flor.");
		
	}

}
