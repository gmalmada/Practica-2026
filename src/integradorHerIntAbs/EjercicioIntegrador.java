package integradorHerIntAbs;

public class EjercicioIntegrador {
	
	public static void main(String[] args) {
		
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Pikachu pikachu = new Pikachu();
		Bulbasaur bulbasaur = new Bulbasaur();
		
		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();
		charmander.atacarAraniazo();
		charmander.atacarLanzaLlamas();
		bulbasaur.atacarAraniazo();
		bulbasaur.atacarDrenaje();
		pikachu.atacarAraniazo();
		pikachu.atacarImpacTrueno();
	}

}
