package TPE;

public class Jugador {
	
	private String nombre;
	private Mazo mazo;
	private Estrategia estrategia;
	
	public Jugador(String nombre, Estrategia estrategia) {
		this.nombre = nombre;
		mazo = new Mazo();
		this.estrategia =  estrategia;
	}

	public Estrategia getEstrategia() {
		return estrategia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mazo getMazo() {
		return mazo;
	}

	public void addCarta(Carta c) {
		mazo.addCarta(c);
	}
	
	public Carta tomarCarta() {
		Carta aux = new Carta();
		for(int i=0; i<mazo.getCarta().size();i++) {
			aux = mazo.getCarta().get(0);
		}
		return aux;
	}
	
	public String tomarNombreAtributo(Carta c) {
		return this.estrategia.tomarNombreAtributo(c);
	}
}
