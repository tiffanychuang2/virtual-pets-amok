package pets;

public class OrganicCat extends VirtualPet implements Organic {

	protected int litterWaste;

	// constructors
	public OrganicCat(String name, String description, int energy, int health, int happiness, int hunger, int thirst,
			int litterWaste) {
		super(name, description, energy, health, happiness, hunger, thirst);
		this.litterWaste = litterWaste;
	}

	// getters
	public int getLitterWaste() {
		return litterWaste;
	}

	// methods
	@Override
	public void play() {
		energy -= 3;
	}

	@Override
	public void feed() {
		hunger -= 2;
	}

	@Override
	public void hydrate() {
		thirst -= 2;
	}

	@Override
	public void litterBox() {
		litterWaste *= 0;
	}

}
