package estrategias;

import juegoPrincipal.Carta;

public class Obstinado implements Estrategia {

	private String nombre;
	
	
	public Obstinado(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String tomarNombreAtributo(Carta c) {
		
		return nombre;
		
	}

}
