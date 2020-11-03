package pocima;

import juegoPrincipal.Atributo;

public class Selectiva extends Pocima {
	private String nombreAt;
	private double valor;
	
	public Selectiva(String nombre, String nombreAt, double valor) {
		super(nombre);
		this.nombreAt = nombreAt;
		this.valor = valor;
	}
	
	@Override
	public double usar(Atributo a) {
		double valor = 0.0;
		if(a.getNombre().equals(nombreAt)) {
			valor = a.getValor() * this.valor;
			a.setValor((int)valor);
			return valor;
		}else return a.getValor();
	}
}
