package pocima;

import juegoPrincipal.Atributo;

public class ValorFijo extends Pocima {

	private int valor;
	
	public ValorFijo(String nombre,int valor) {
		super(nombre);
		this.valor = valor;
	}
	
	@Override
	public double usar(Atributo a) {
		a.setValor(valor);
		return this.valor;
	}
}
