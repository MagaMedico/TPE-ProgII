package TPE;

public class RetornaAlgo extends Pocima {

	private int valor;
	
	public RetornaAlgo(String nombre,int valor) {
		super(nombre);
		this.valor = valor;
	}
	
	@Override
	public double usar(Atributo a) {
		a.setValor(valor);
		return this.valor;
	}
}
