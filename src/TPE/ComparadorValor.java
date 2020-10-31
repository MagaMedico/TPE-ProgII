package TPE;

import java.util.Comparator;

public class ComparadorValor implements Comparator<Atributo>{

	@Override
	public int compare(Atributo o1, Atributo o2) {
		return o1.getValor() - o2.getValor();
	}

}
