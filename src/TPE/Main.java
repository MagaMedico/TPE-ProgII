package TPE;

public class Main extends VisorMazo{
	public static void main(String[] args) {
        String mazoPath = "./src/TPE/superheroes.json";
        Estrategia ambicioso = new Ambicioso();
        Estrategia obstinado = new Obstinado();
        Estrategia timbero = new Timbero();
        
        Multiplicadora p1 = new Multiplicadora("Fortelecedora", 1.2);
        Multiplicadora p2 = new Multiplicadora("Fortelecedora Plus", 1.5);
        Multiplicadora p3 = new Multiplicadora("Kriptonita", 0.75);
        Multiplicadora p4 = new Multiplicadora("Reductor de Plomo", 0.45);
        RetornaAlgo p5 = new RetornaAlgo("Quiero vale Cuatro", 4);
        RetornaAlgo p6 = new RetornaAlgo("Numero magico", 23);
        Selectiva p7 = new Selectiva("Selectiva Fuerza", "fuerza", 1.35);
        Selectiva p8 = new Selectiva("Selectiva Peso", "peso", 1.43);
        Cocktail p9 = new Cocktail("Cocktail");
        p9.addPocima(p7);
        p9.addPocima(p1);
        Cocktail p10 = new Cocktail("Cocktail");
        p10.addPocima(p9);
        p10.addPocima(p3);
        
        Jugador j1 = new Jugador("Benito", timbero);
        Jugador j2 = new Jugador("Jose", timbero);
        Mazo mazo = new Mazo();
        mazo = cargarMazo(mazoPath);
        mazo.addPocima(p1);
        mazo.addPocima(p2);
        mazo.addPocima(p3);
        mazo.addPocima(p4);
        mazo.addPocima(p5);
        mazo.addPocima(p6);
        mazo.addPocima(p7);
        mazo.addPocima(p8);
        mazo.addPocima(p9);
        mazo.mezclarMazo();
        Juego juego = new Juego(20, j1, j2, mazo);
        juego.Jugar();
        
        System.out.println(juego.getBitacora());
    }
}
