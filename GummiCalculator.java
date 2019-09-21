import java.util.ArrayList;
import java.util.List;

class GummiCalculator {
	private List <Pokemon> pokemons;
	private List <Gummi> gummis;
	private TypeTable table;
	private List <GummiBag> gummiBags;
	
	GummiCalculator (List <Pokemon> pokemonList, List <Gummi> gummiList) {
		pokemons = pokemonList;
		gummis = gummiList;
		table = new TypeTable();
		gummiBags = new ArrayList <>();
		intialise();
	}
	
	private void intialise () {
		for (Pokemon p : pokemons) {
			gummiBags.add(new GummiBag(p.getName()));
		}
	}
	
	private void ausgabeGummis () {
		System.out.println("stored gummis:");
		for (Gummi g : gummis) {
			System.out.println(g.toString());
		}
	}
	
	private void ausgabePokemon () {
		System.out.println("stored pokemon:");
		for (Pokemon p : pokemons) {
			System.out.println(p.toString());
		}
	}
	
	private void ausgabeDistribution () {
		System.out.println("distributed gummis:");
		for (GummiBag candyBag : gummiBags) {
			System.out.println(candyBag.toString());
		}
	}
	
	void ausgabe (boolean gummis, boolean pokemon, boolean distribution) {
		if(gummis) {
			ausgabeGummis();
			System.out.println();
		}
		if (pokemon) {
			ausgabePokemon();
			System.out.println();
		}
		if (distribution) {
			ausgabeDistribution();
			System.out.println();
		}
	}
	
	void distributeGummis () {
		for (Gummi gummi : gummis) {
			findBestPokemon(gummi, pokemons);
		}
	}
	
	private int calculatePoints (Gummi gummi, Pokemon pokemon) {
		int points = 0;
		for (Type pokemonType : pokemon.getType()) {
			points += table.getPoints(gummi.getType(), pokemonType);
		}
		return points;
	}
	
	private void findBestPokemon (Gummi gummi, List <Pokemon> pokemons) {
		int maxPoints = 0;
		Pokemon bestPokemon = null;
		
		for (Pokemon pokemon : pokemons) {
			int currentPoints = calculatePoints(gummi, pokemon);
			if (maxPoints < currentPoints) {
				maxPoints = currentPoints;
				bestPokemon = pokemon;
			}
		}
		if (bestPokemon != null) {
			setCandyBag(bestPokemon.getName(), gummi, maxPoints);
		}
		
	}
	
	
	private void setCandyBag (String pokemonName, Gummi gummi, int points) {
		for (GummiBag candyBag : gummiBags) {
			if (candyBag.getBagName().equals(pokemonName)) {
				candyBag.addGummi(gummi);
				candyBag.addIQpoints(points);
			}
		}
	}
}
