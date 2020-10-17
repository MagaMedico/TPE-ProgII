package TPE;

public class Jugador {
	
	private String nombre;
	private Mazo mazo;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		mazo = new Mazo();
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
	
	public String tomarNombreAtributo() {
		String aux = null;
		for(int j=0; j<tomarCarta().getAtributo().size();j++){
			int numero = (int) (Math.random() * tomarCarta().cantAtributos());
			aux = tomarCarta().getAtributo().get(numero).getNombre(); 
		}
		return aux;
	}
	
	
	/*metodo tomarCarta(Mazo mazo o arraylist?){primero agarra la primer carta y toma un atributo random}
	 * 
	 */
}