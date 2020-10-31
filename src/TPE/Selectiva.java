package TPE;

public class Selectiva extends Pocima {

	private String nombre;
	private double valor;
	
	public Selectiva(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	@Override
	public double usar(Atributo a) {
		if(a.getNombre().equals(nombre)) {
			return a.getValor() * valor;//TENDRIAMOS QUE RETORNAR EL VALOR 
			
		}else {
			return a.getValor();
		}
		
	}

}
