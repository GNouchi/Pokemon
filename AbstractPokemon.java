package folderOne.pokemon;

public abstract class AbstractPokemon implements PokemonInterface{
	public Pokemon createPokemon(String name, String type, int health ) {
		Pokemon newPokemon = new Pokemon(name, type, health );
		return newPokemon;
	}
	public String pokemonInfo(Pokemon pokemon) {
		String str1 = ("Name: "+ pokemon.getName()+ " Type: "+pokemon.getType()+" Health: "+pokemon.getHealth());
		return str1;
	}
}
