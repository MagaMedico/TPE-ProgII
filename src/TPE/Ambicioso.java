package TPE;

import java.util.Collections;

public class Ambicioso extends Jugador  {
	
	public Ambicioso(String nombre) {
		super(nombre);
		
	}

	@Override
	public String tomarNombreAtributo() {
		String aux = null;
		Collections.sort(this.tomarCarta().getAtributo(),new ComparadorValor());
		aux = this.tomarCarta().getAtributo().get(0).getNombre();
		return aux;
	}

}
