package juegoPrincipal;

import java.util.ArrayList;
import java.util.Collections;

import pocima.Pocima;

public class Mazo {
	
	private ArrayList<Carta> cartas;
	private ArrayList<Pocima> pocimas;
	
	public Mazo() {
		cartas= new ArrayList<Carta>();
		pocimas = new ArrayList<Pocima>();
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
	
	public void addPocima(Pocima p) {
		this.pocimas.add(p);
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
	
	public void mezclarMazo() {
		Collections.shuffle(cartas);
		repartirPocimas();
		Collections.shuffle(cartas);
	}
	
	public void repartirPocimas() {
		ArrayList<Pocima> aux = new ArrayList<>(this.pocimas);
		for(int i =0; i<this.cartas.size();i++) {
			Carta c = this.cartas.get(i);
			for(int j = 0; j < aux.size();j++) {
				c.setPocima(aux.get(j));
				aux.remove(aux.get(j));
			}
		}
	}
}
