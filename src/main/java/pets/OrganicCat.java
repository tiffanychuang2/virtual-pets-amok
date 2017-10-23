package pets;

public class OrganicCat extends VirtualPet implements Organic {

	protected int hunger;
	protected int thirst;
	protected int litterWaste;

	// constructors
	public OrganicCat(String name, String description, int energy, int health, int happiness, int hunger, int thirst,
			int litterWaste) {
		super(name, description, energy, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;
		this.litterWaste = litterWaste;
	}

	// getters
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getLitterWaste() {
		return litterWaste;
	}

	// methods
	@Override
	public void tick() {
		Math.min(0, hunger);
		Math.max(hunger, 10);
		Math.min(0, thirst);
		Math.max(thirst, 10);
		Math.min(0, litterWaste);
		Math.max(litterWaste, 20);
		hunger += 1;
		thirst += 1;
		litterWaste += 2;
		super.tick();
	}

	@Override
	public void play() {
		super.play();
	}

	@Override
	public void feed() {
		Math.min(0, hunger);
		Math.max(hunger, 10);
		Math.min(0, energy);
		Math.max(energy, 10);
		Math.min(0, health);
		Math.max(health, 10);
		Math.min(0, happiness);
		Math.max(happiness, 10);
		hunger -= 2;
		health += 2;
		happiness += 1;
		energy += 1;
	}

	// // feed all of the pets in the shelter
	// public void feedPets() {
	// for (VirtualPet currentPets : pets.values()) {
	// currentPets.feed();
	// }
	// }

	@Override
	public void hydrate() {
		Math.min(0, thirst);
		Math.max(thirst, 10);
		Math.min(0, energy);
		Math.max(energy, 10);
		Math.min(0, health);
		Math.max(health, 10);
		Math.min(0, happiness);
		Math.max(happiness, 10);
		thirst -= 2;
		health += 2;
		happiness += 1;
		energy += 1;
	}

	public void collectWaste() {
		Math.min(0, litterWaste);
		Math.max(litterWaste, 20);
		litterWaste += 2;
		if (litterWaste >= 8) {
			health -= 2;
			happiness -= 2;
		}
	}

	// // water all of the pets in the shelter
	// public void hydratePets() {
	// for (VirtualPet currentPets : pets.values()) {
	// currentPets.hydrate();
	// }
	// }

}
