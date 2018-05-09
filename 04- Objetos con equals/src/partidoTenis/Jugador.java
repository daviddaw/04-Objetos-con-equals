package partidoTenis;

public class Jugador {
	private String nombreJugador;
	private int puntuacion=1;

	public Jugador(String nombreJugador,int ranking) {
		this.nombreJugador=nombreJugador;
		this.puntuacion=puntuacion;
	}

	@Override
	public String toString() {
		return " Nombre " + getNombreJugador() + ", Puntuacion " + getPuntuacion() ;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}



	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion() {
		puntuacion = puntuacion+1;
	}
}
