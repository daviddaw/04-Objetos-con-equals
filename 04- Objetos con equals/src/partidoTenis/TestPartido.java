package partidoTenis;

public class TestPartido {

	public static void main(String[] args) {
		Jugador j1=new Jugador("Rafael  Nadal",1);
		Jugador j2=new Jugador("Roger Federer",1);
		Partido partido1=new Partido(j1,j2);
		System.out.println(j1.getNombreJugador());
		
		System.out.println(j1.toString());
		System.out.println(j2.getNombreJugador()+" tiene una puntuación de "+j2.getPuntuacion());
	
		
		System.out.println("El ganador es: ");
		partido1.jugar();
		
		System.out.println("Las nuevas clasificaciones son:");
		if (j1.getPuntuacion()>j2.getPuntuacion()) {
			System.out.println(j1.getNombreJugador()+" "+j1.getPuntuacion()+" Puntos ");
			System.out.println(j2.getNombreJugador()+" "+j2.getPuntuacion()+" Puntos ");
		}
		else {
			System.out.println(j2.getNombreJugador()+" "+j2.getPuntuacion()+" Puntos ");
			System.out.println(j1.getNombreJugador()+" "+j1.getPuntuacion()+" Puntos ");
		}

		
		
	}

}
