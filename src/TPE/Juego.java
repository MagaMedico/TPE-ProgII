package TPE;

import java.util.ArrayList;

public class Juego {
	private int maxRonda;
	private Jugador j1;
	private Jugador j2;
	private Mazo mazo;
	private ArrayList<String> bitacora;
	private Jugador perdedor;
	private String nombre;
	private Carta cartaG;
	private Carta cartaP;
	
	public Juego(int maxRonda, Jugador j1, Jugador j2, Mazo mazo) {
		this.maxRonda=maxRonda;
		this.j1=j1;
		this.j2=j2;
		this.mazo= mazo;
		bitacora = new ArrayList<>();
	}

	public int getMaxRonda() {
		return maxRonda;
	}

	public void setMaxRonda(int maxRonda) {
		this.maxRonda = maxRonda;
	}

	public Jugador getJ1() {
		return j1;
	}

	public void setJ1(Jugador j1) {
		this.j1 = j1;
	}

	public Jugador getJ2() {
		return j2;
	}

	public void setJ2(Jugador j2) {
		this.j2 = j2;
	}

	public Mazo getMazo() {
		return mazo;
	}

	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}
	
	public ArrayList<String> getBitacora(){
		return new ArrayList<>(this.bitacora);
	}
	
	private void repartirCartas(){
		for(int i=0; i<mazo.getCarta().size();i++) {
			if(i%2==0) {
				j2.addCarta(mazo.getCarta().get(i));
			}else {
				j1.addCarta(mazo.getCarta().get(i));
			}
		}
	}
	
	private Jugador compararCarta(Jugador ganador, Jugador perdedor) {
		ganador.getMazo().addCarta(perdedor.tomarCarta());
		ganador.getMazo().addCarta(ganador.tomarCarta());
		ganador.getMazo().removePrimerCarta();
		perdedor.getMazo().removePrimerCarta();
		return ganador;
	}
	
	private Jugador jugarMano(Jugador jugadorMano, Jugador jugadorNoMano) {
		Carta carta = jugadorMano.tomarCarta();
		nombre = jugadorMano.tomarNombreAtributo(carta);
		this.bitacora.add(nombre + System.lineSeparator());
		if(jugadorMano.tomarCarta().getAtributo(nombre).getValor()>jugadorNoMano.tomarCarta().getAtributo(nombre).getValor()){
			cartaG = jugadorMano.tomarCarta();
			cartaP = jugadorNoMano.tomarCarta();
			perdedor = jugadorNoMano;
			return compararCarta(jugadorMano,jugadorNoMano);
		}else if(jugadorMano.tomarCarta().getAtributo(nombre).getValor()==jugadorNoMano.tomarCarta().getAtributo(nombre).getValor()){
			jugadorNoMano.getMazo().addCarta(jugadorNoMano.tomarCarta());
			jugadorNoMano.getMazo().removePrimerCarta();
			jugadorMano.getMazo().addCarta(jugadorMano.tomarCarta());
			jugadorMano.getMazo().removePrimerCarta();
			cartaG = jugadorMano.tomarCarta();
			cartaP = jugadorNoMano.tomarCarta();
			perdedor = jugadorNoMano;
			return jugadorMano;
		}else{
			cartaP = jugadorMano.tomarCarta();
			cartaG = jugadorNoMano.tomarCarta();
			perdedor = jugadorMano;
			return compararCarta(jugadorNoMano,jugadorMano);
		}
	}
	
	public void Jugar(){
		int contador=1;
		Jugador jugadorMano = j1;
		Jugador jugadorNoMano = j2;
		repartirCartas();
		while(contador<=this.maxRonda && jugadorMano.getMazo().getCarta().size()!=0 && jugadorNoMano.getMazo().getCarta().size()!= 0){
			this.bitacora.add("-------Ronda " + contador + "---------" + System.lineSeparator());
			this.bitacora.add("El jugador " + jugadorMano.getNombre() + " selecciona competir por el atributo ");
			jugadorMano = jugarMano(jugadorMano, jugadorNoMano);
			jugadorNoMano = perdedor;
			contador++;
			this.bitacora.add("La carta de " + jugadorMano.getNombre() + " es " + cartaG + " con "+ nombre + " " + cartaG.getAtributo(nombre).getValor() + System.lineSeparator());
			this.bitacora.add("La carta de " + jugadorNoMano.getNombre() + " es "+ cartaP + " con " + nombre + " " + cartaP.getAtributo(nombre).getValor() + System.lineSeparator());
			this.bitacora.add("Gana la ronda " + jugadorMano.getNombre() + System.lineSeparator());
			this.bitacora.add(jugadorMano.getNombre() + " posee ahora " + jugadorMano.getMazo().getCarta().size() + " y " + jugadorNoMano.getNombre() + " posee ahora " + jugadorNoMano.getMazo().getCarta().size() + " cartas" + System.lineSeparator());
		}
	}
}

