
public abstract class AllDog extends VirtualPet {
	
	private int walk;
	
	public AllDog (String name, String description, int hunger, int thirst, int weight, int energy, int health, int happiness, int waste, int walk) {
		super(name, description, hunger, thirst, weight, energy, health, happiness, waste);
		this.walk = walk;
	}
	
	public AllDog (String name, String description) {
		super(name, description);
	}

	public int getWalk() {
		return walk;
	}
	
//	public void setWalk() {
//		this.walk = walk;
//	}

}
