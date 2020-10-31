package TPE;

public class Obstinado extends Jugador {

	public Obstinado(String nombre) {
		super(nombre);
		
	}

	@Override
	public String tomarNombreAtributo() {
		
		return this.tomarCarta().getAtributo().get(4).getNombre();
		
	}

}
