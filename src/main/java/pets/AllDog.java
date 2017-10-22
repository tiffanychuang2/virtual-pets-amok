package pets;

public abstract class AllDog extends VirtualPet {

	// instance variables
	protected int boredom;

	// constructors
	// robodog
	public AllDog(String name, String description, int energy, int health, int happiness, int boredom) {
		super(name, description, energy, health, happiness);
		this.boredom = boredom;
	}

	// orgdog
	public AllDog(String name, String description, int energy, int health, int happiness, int hunger, int thirst,
			int boredom) {
		super(name, description, energy, health, happiness, hunger, thirst);
		this.boredom = boredom;
	}

	// getters
	public int getBoredom() {
		return boredom;
	}

	// setters
	public void setBoredom() {
		this.boredom = boredom;
	}

	// methods
	@Override
	public void play() {
		energy -= 2;
	}

	public void walk() {
		boredom -= 2;
	}

}
