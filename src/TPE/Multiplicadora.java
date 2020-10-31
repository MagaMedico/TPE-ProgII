package TPE;

public class Multiplicadora extends Pocima {

	private double valor;
	
	
	public Multiplicadora(double valor) {
		this.valor = valor;
	}


	@Override
	public double usar(Atributo a) {
		
		return a.getValor()*this.valor;
		
		
	}

}
