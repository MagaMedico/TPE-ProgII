package TPE;

public class Multiplicadora extends Pocima {
	private double valor;
	
	public Multiplicadora(String nombre, double valor) {
		super(nombre);
		this.valor = valor;
	}

	@Override
	public double usar(Atributo a) {
		double valor = 0.0;
		valor = a.getValor()*this.valor;	
		a.setValor((int)valor);
		return valor;
	}
}
