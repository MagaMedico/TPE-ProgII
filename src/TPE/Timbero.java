package TPE;

public class Timbero implements Estrategia {


	@Override
	public String tomarNombreAtributo(Carta c) {
		String aux = null;
		for(int j=0; j<c.getAtributo().size();j++){
			int numero = (int) (Math.random() * c.cantAtributos());
			aux = c.getAtributo().get(numero).getNombre(); 
		}
		return aux;
	}

}
