package pets;

public class OrganicDog extends AllDog implements Organic {

	protected int crateWaste;

	public OrganicDog(String name, String description, int energy, int health, int happiness, int hunger, int thirst,
			int boredom, int crateWaste) {
		super(name, description, energy, health, happiness, hunger, thirst, boredom);
		this.crateWaste = crateWaste;
	}

	// getters
	public int getCrateWaste() {
		return crateWaste;
	}

	@Override
	public void play() {
		energy -= 2;
	}

	@Override
	public void walk() {
		boredom -= 2;
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
	public void cleanCrate() {
		crateWaste *= 0;
	}

}
