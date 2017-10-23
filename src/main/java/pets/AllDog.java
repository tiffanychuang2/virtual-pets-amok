package pets;

public abstract class AllDog extends VirtualPet {

	// instance variables
	protected int boredom;

	// constructors
	public AllDog(String name, String description, int energy, int health, int happiness, int boredom) {
		super(name, description, energy, health, happiness);
		this.boredom = boredom;
	}

	// getters
	public int getBoredom() {
		return boredom;
	}

	// setters
	// public void setBoredom() {
	// this.boredom = boredom;
	// }

	// methods

	@Override
	public void tick() {
		Math.min(0, boredom);
		Math.max(boredom, 10);
		boredom += 1;
		super.tick();
	}

	@Override
	public void play() {
		Math.min(0, boredom);
		Math.max(boredom, 10);
		boredom -= 2;
		super.play();
	}

	public void walk() {
		Math.min(0, boredom);
		Math.max(boredom, 10);
		boredom -= 2;
		health += 2;
		happiness += 4;
	}

}
