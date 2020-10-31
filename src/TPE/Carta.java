package TPE;

import java.util.ArrayList;

public class Carta {
	private ArrayList<Atributo> atributos;
	private Pocima pocima;
	
	
	public Carta() {
		atributos = new ArrayList<Atributo>();
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
	
	public void aplicarPocima(String s) {
		Atributo a = this.getAtributo(s);
		this.pocima.usar(a);
	}
}
