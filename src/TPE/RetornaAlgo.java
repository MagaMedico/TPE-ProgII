package TPE;

public class RetornaAlgo extends Pocima {

	private int valor;
	
	public RetornaAlgo(int valor) {
		this.valor = valor;
	}
	
	@Override
	public double usar(Atributo a) {
		return this.valor;
	}

}
