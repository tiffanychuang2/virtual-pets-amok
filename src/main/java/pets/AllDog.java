package pets;

public abstract class AllDog extends VirtualPet {

	// instance variables
	protected int boredom;

	// constructors
	public AllDog(String name, String description, int health, int happiness, int boredom) {
		super(name, description, health, happiness);
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

	abstract void walk();

}
