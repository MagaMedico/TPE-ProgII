package TPE;

public class Timbero extends Jugador {

	
	public Timbero(String nombre) {
		super(nombre);
	}

	@Override
	public String tomarNombreAtributo() {
		String aux = null;
		for(int j=0; j<tomarCarta().getAtributo().size();j++){
			int numero = (int) (Math.random() * tomarCarta().cantAtributos());
			aux = tomarCarta().getAtributo().get(numero).getNombre(); 
		}
		return aux;
	}

}
