package TPE;

import java.util.ArrayList;

public class Carta {
	private String nombre;
	private ArrayList<Atributo> atributos;
	private Pocima pocima;
	
	public Carta() {
		atributos = new ArrayList<Atributo>();
	}
	
	public Carta(String nombre){
		this.nombre = nombre;
		pocima = null;
		atributos = new ArrayList<Atributo>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atributo> getAtributo(){
		return new ArrayList<Atributo>(this.atributos);
	}
	
	public void addAtributo(Atributo a) {
		this.atributos.add(a);
	}
	
	public int cantAtributos() {
		return atributos.size();
	}
	
	public Pocima getPocima() {
		return pocima;
	}

	public void setPocima(Pocima pocima) {
		this.pocima = pocima;
	}

	public Atributo getAtributo(String nombre){
		for(int i=0; i<atributos.size(); i++){
			if(atributos.get(i).getNombre().equals(nombre)){
				return atributos.get(i);
			}
		}
		return null;
	}
	
	
	public boolean compararAtributos(Carta c){
		if(c.cantAtributos()==this.cantAtributos()){
			for(int i=0; i<atributos.size(); i++){
				String nombre = this.atributos.get(i).getNombre();
				for(int j=0; j<c.getAtributo().size();j++){
					String nombreC = this.atributos.get(i).getNombre();
					if(nombreC.equals(nombre)){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public double aplicarPocima(String s) {
		Atributo a = this.getAtributo(s);
		Atributo nuevo = new Atributo(a.getNombre(), a.getValor());
		return this.pocima.usar(nuevo);
	}
	
	public String imprimirPocima(int valor){
		return "Se aplico pocima " + pocima.getNombre() + " valor resultante " + valor;
	}
	
	public String toString(){
		return this.getNombre();
	}
}
