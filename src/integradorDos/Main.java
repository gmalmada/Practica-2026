package integradorDos;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//Crear lista
		List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
		
		//Crear videojuegos
		VideoJuego video1 = new VideoJuego(123, "Banjoo Kazooe", "Nintendo", 4, "Plataforma");
		VideoJuego video2 = new VideoJuego(456, "League of Legends", "PC", 10, "MOBA");
		VideoJuego video3 = new VideoJuego(789, "Valorant", "PC", 10, "Shooter");
		VideoJuego video4 = new VideoJuego(101, "God Of War", "PlayStation", 1, "Fantasia");
		VideoJuego video5 = new VideoJuego(102, "Counter Strike", "PC", 10, "Shooter");
		
		//Añadir videojuegos a la lista
		listaVideojuegos.add(video1);
		listaVideojuegos.add(video2);
		listaVideojuegos.add(video3);
		listaVideojuegos.add(video4);
		listaVideojuegos.add(video5);
		
		//Recorrer la lista
		for(VideoJuego video : listaVideojuegos) {
			System.out.println("Titulo: " + video.getTitulo() + " Consola: " + video.getConsola() + " Cantidad de jugadores: " + video.getCantJugadores());
		}
		
		//Elegir dos videojuegos y cambiar su nombre y cantidad de jugadores
		video1.setTitulo("Mortal Kombat");
		video1.setCantJugadores(8);
		
		video5.setTitulo("Mario Bross");
		video5.setCantJugadores(5);
		
		System.out.println("------------------------------------------------------");
		
		//Recorrer la lista y mostrar por pantalla a los Videojuegos que sean de la Nintendo 64
		for(VideoJuego vid : listaVideojuegos) {
			if(vid.getConsola().equals("Nintendo")) {
				System.out.println("Juego de nintendo: " + vid.toString());
			}
		}
	}

}
