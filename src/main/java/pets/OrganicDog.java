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

	}

	@Override
	public void walk() {

	}

	@Override
	public void feed() {

	}

	@Override
	public void hydrate() {

	}

	@Override
	public void cleanCrate() {

	}

}
