package pocima;

import java.util.ArrayList;

import juegoPrincipal.Atributo;

public class Cocktail extends Pocima {
	
	private ArrayList<Pocima> pocimas;
	
	public Cocktail(String nombre) {
		super(nombre);
		pocimas = new ArrayList<Pocima>();
	}
	
	public void addPocima(Pocima p) {
		this.pocimas.add(p);
	}
	
	@Override
	public double usar(Atributo a) {
		double total = 0.0;
		for(Pocima p : pocimas) {
			total = p.usar(a);
			a.setValor((int)total);
		}
		return total;	
	}
	

}
