package TPE;

import java.util.ArrayList;

public class Mazo {
	
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		cartas= new ArrayList<Carta>();
	}
	
	public ArrayList<Carta> getCarta(){
		return new ArrayList<Carta>(this.cartas);
	}
	
	public void addCarta(Carta c) {
		if(this.cartas.size()==0){
			this.cartas.add(c);
		}else if(verificarCarta(c)){
			this.cartas.add(c);
		}
	}
	
	public void removePrimerCarta() {
		this.cartas.remove(0);
	}
	
	public int size(){
		return this.cartas.size();
	}
	
	public Carta primerCarta(){
		Carta c = this.cartas.get(0);
		return c;
	}
	
	public boolean verificarCarta(Carta c){
		if(!c.compararAtributos(primerCarta())){
			return false;
		}
		return true;
	}
	/*metodo crearMazo()
	 * metodo verificarCartas(){recorrer el arraylist de cartas y compararlas para ver que son iguales}
	 * 							mismo nombre de atributos y cantidad.
	 */
}
