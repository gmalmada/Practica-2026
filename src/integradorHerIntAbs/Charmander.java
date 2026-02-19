package integradorHerIntAbs;

public class Charmander extends Pokemon implements IFuego{
	
	public Charmander() {}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Charmander usa Placaje.");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Charmander usa Araniazo.");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Charmander usa Mordisco.");
		
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Charmander usa Punio Fuego.");
		
	}

	@Override
	public void atacarLanzaLlamas() {
		System.out.println("Charmander usa Lanza Llamas.");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Charmander usa Ascuas.");
		
	}

}
