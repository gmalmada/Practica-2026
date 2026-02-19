package integradorHerIntAbs;

public class Pikachu extends Pokemon implements IElectrico{
	
	public Pikachu() {}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Pikachu usa Placaje.");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Pikachu usa Araniazo.");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Pikachu usa Mordisco.");
		
	}

	@Override
	public void atacarImpacTrueno() {
		System.out.println("Pikachu usa Impact Trueno.");
		
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Pikachu usa Punio Trueno.");
		
	}

}
