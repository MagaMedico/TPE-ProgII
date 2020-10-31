package TPE;

public class Obstinado implements Estrategia {

	@Override
	public String tomarNombreAtributo(Carta c) {
		
		return c.getAtributo().get(4).getNombre(); //CONSULTAR SI SE PASA POR PARAMETRO??
		
	}

}
