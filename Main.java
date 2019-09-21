import java.util.ArrayList;
import java.util.List;

public class Main {
	//static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		Pokemon lucario = new Pokemon ("Lucario", new Type("fighting"));
		Pokemon chelast = new Pokemon ("Chelast", new Type("grass"));
		Pokemon panflam = new Pokemon ("Panflam",new Type("fire"));
		List <Pokemon> pokemons = new ArrayList <>();
		pokemons.add(lucario);
		pokemons.add(chelast);
		pokemons.add(panflam);
		
		Gummi yellowG = new Gummi(new Type("electric"));
		Gummi orangeG = new Gummi(new Type("fighting"));
		Gummi redG = new Gummi(new Type("fire"));
		Gummi blueG = new Gummi(new Type("water"));
		Gummi wonderG = new Gummi(new Type("wonder"));
		Gummi orangeG2 = new Gummi(new Type("fighting"));
		Gummi blackG = new Gummi(new Type("dark"));
		Gummi azurG = new Gummi(new Type("flying"));
		
		List <Gummi> gummis = new ArrayList <>();
		gummis.add(yellowG);
		gummis.add(orangeG);
		gummis.add(redG);
		gummis.add(blueG);
		gummis.add(wonderG);
		gummis.add(orangeG2);
		gummis.add(blackG);
		gummis.add(azurG);
		
		GummiCalculator calc = new GummiCalculator(pokemons, gummis);
		calc.distributeGummis();
		calc.ausgabe(true, true, true);
	}
}
