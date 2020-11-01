package TPE;

public abstract class Pocima {	
	private String nombre;
	
	public Pocima(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public abstract double usar(Atributo a);
}
