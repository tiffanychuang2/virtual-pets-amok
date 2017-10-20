package pets;

public abstract class AllDog extends VirtualPet {
	
	//instance variables
	protected int walk;
	
	//constructors
	public AllDog (String name, String description, int hunger, int thirst, int weight, int energy, int health, int happiness, int waste, int walk) {
		super(name, description, hunger, thirst, weight, energy, health, happiness, waste);
		this.walk = walk;
	}
	
	public AllDog (String name, String description) {
		super(name, description);
	}

	//getters
	public int getWalk() {
		return walk;
	}
	
	//setters
//	public void setWalk() {
//		this.walk = walk;
//	}

}
