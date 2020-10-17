package TPE;

import java.util.ArrayList;

public class Carta {
	private String nombre;
	private ArrayList<Atributo> atributos;
	
	public Carta(){
		
	}
	
	public Carta(String nombre) {
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
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
				for(int j=0; j<c.atributos.size();j++){
					String nombreC = this.atributos.get(i).getNombre();
					if(nombreC.equals(nombre)){//esta mal la comparacion
						return true;
					}
				}
			}
		}
		return false;
	}
}
