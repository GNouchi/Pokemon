package folderOne.pokemon;

public class Pokemon {
	private String name;
	private String type;
	private int health;
	private static int count;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public static int getCount() {
		return count;
	}

// my methods
	public Pokemon(String name, String type, int health ) {
		count++;
		setName(name);
		setType(type);
		setHealth(health);	
	}
	public void attackPokemon(Pokemon enemy) {
		enemy.health -=10;
		System.out.println("Attacked "+ enemy.name + " for (10)!");
	}
	
	
}
