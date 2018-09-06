package folderOne.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, String type, int health );
	String PokemonInfo(Pokemon pokemon);
	void listPokemon();
	
}
