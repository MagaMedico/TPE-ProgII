package estrategias;

import java.util.ArrayList;
import java.util.Collections;

import juegoPrincipal.Atributo;
import juegoPrincipal.Carta;

public class Ambicioso implements Estrategia  {
	
	@Override
	public String tomarNombreAtributo(Carta c) {
		String aux = null;
		ArrayList<Atributo> auxList = new ArrayList<>();
		auxList = c.getAtributo();
		Collections.sort(auxList,new ComparadorValor());
		aux = auxList.get(4).getNombre();
		return aux;
	}

}
