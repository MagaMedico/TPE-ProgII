package TPE;

import java.util.Comparator;

public class ComparadorValor implements Comparator<Atributo>{

	@Override
	public int compare(Atributo o1, Atributo o2) {
		System.out.println(o1.getValor() - o2.getValor());
		return o1.getValor() - o2.getValor();
		
	}

}
