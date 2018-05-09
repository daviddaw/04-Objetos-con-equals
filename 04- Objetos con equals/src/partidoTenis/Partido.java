package partidoTenis;

public class Partido {
private Jugador j1;
private Jugador j2;
private Jugador ganador;

public Partido(Jugador j1,Jugador j2){
	ganador=null;
	this.j1=j1;
	this.j2=j2;
}

public Jugador ganador() {
	double resultado1,resultado2;
	do {
		resultado1= Math.random() * j1.getPuntuacion();
		resultado2= Math.random() * j2.getPuntuacion();
	} while (resultado1==resultado2);
     if (resultado1>resultado2) {
		return j1;
	}else {
		return j2;
	}
}


public void jugar(){
	ganador=ganador();
	System.out.println(ganador.getNombreJugador());
	ganador.setPuntuacion();
}
}