package folderOne.pokemon;

public class PokeTest {
	public static void main (String[] args) {
		Pokedex test1 = new Pokedex();
		Pokemon wild1 = new Pokemon("Pidgey", "Normal", 50);
		System.out.println(test1);
		test1.createPokemon("Bulbasaur", "Grass", 150);
		test1.createPokemon("Squirtle", "Water", 100);
		test1.createPokemon("Charmander", "Fire", 100);
		test1.listPokemon();
		System.out.println("A wild Pokemon has appeared!");
		System.out.println("Name: "+wild1.getName()+"--> HP: " +wild1.getHealth());
		System.out.println("Call a Pokemon!");
		Pokemon call1 = test1.callPokemon(1);
		call1.attackPokemon(wild1);
		System.out.println("Name: "+wild1.getName()+"--> HP: " +wild1.getHealth());
	}
}
