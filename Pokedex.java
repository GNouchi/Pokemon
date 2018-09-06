package folderOne.pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
	private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	public void listPokemon() {
		int temp =0 ; 
		for(Pokemon key: myPokemons) {
			temp++;
			System.out.println(temp+") Pokedex entry: "+pokemonInfo(key));
		}
	}
	public Pokemon callPokemon(int index) {
		Pokemon tempPokemon = myPokemons.get(index);
		System.out.println("Called Pokemon from Pokedex: ("+index+") "+pokemonInfo(tempPokemon) );
		return tempPokemon;
	}
	public Pokemon createPokemon(String name, String type, int health ) {
		Pokemon newPokemon = new Pokemon(name, type, health );
		this.myPokemons.add(newPokemon);
		System.out.println("Created a pokemon : " + pokemonInfo(newPokemon));
		return newPokemon;
	}	
}
