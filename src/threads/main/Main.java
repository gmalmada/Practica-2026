package threads.main;

import threads.logica.Hilo;
import threads.logica.HiloRunnable;

public class Main {
	
	public static void main(String[] args) {
		
		Hilo proceso = new Hilo();
		
		//Empezar a ejecutar el hilo usando Thread
		proceso.start();
		
		Thread proceso2 = new Thread(new HiloRunnable());
		
		//Empezar a ejecutar el hilo usando Runnable
		proceso2.start();
	}

}
