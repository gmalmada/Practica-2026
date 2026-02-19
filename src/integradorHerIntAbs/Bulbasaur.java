package integradorHerIntAbs;

public class Bulbasaur extends Pokemon implements IPlanta{
	
	public Bulbasaur() {}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Bulbasaur usa Placaje.");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Bulbasaur usa Araniazo.");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Bulbasaur usa Mordisco.");
		
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Bulbasaur usa Drenaje.");
		
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Bulbasaur usa Paralizar.");
		
	}

}
