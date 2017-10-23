package pets;

public class OrganicDog extends AllDog implements Organic {

	protected int hunger;
	protected int thirst;
	protected int crateWaste;

	public OrganicDog(String name, String description, int energy, int health, int happiness, int hunger, int thirst,
			int boredom, int crateWaste) {
		super(name, description, energy, health, happiness, boredom);
		this.hunger = hunger;
		this.thirst = thirst;
		this.crateWaste = crateWaste;
	}

	// getters
	public int getCrateWaste() {
		return crateWaste;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	// methods

	@Override
	public void tick() {
		Math.min(0, hunger);
		Math.max(hunger, 10);
		Math.min(0, thirst);
		Math.max(thirst, 10);
		Math.min(0, crateWaste);
		Math.max(crateWaste, 10);
		hunger += 1;
		thirst += 1;
		crateWaste += 1;
		super.tick();
	}

	@Override
	public void play() {
		Math.min(0, crateWaste);
		Math.max(crateWaste, 10);
		super.play();
		crateWaste *= 0;
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

	@Override
	public void walk() {
		Math.min(0, crateWaste);
		Math.max(crateWaste, 10);
		super.walk();
		crateWaste *= 0;
	}

	public void cleanCrate() {
		Math.min(0, crateWaste);
		Math.max(crateWaste, 10);
		Math.min(0, health);
		Math.max(health, 10);
		Math.min(0, happiness);
		Math.max(happiness, 10);
		crateWaste *= 0;
		if (crateWaste >= 8) {
			health -= 4;
			happiness -= 2;
		}
	}

	// feed all of the pets in the shelter
	// public void feedPets() {
	// for (VirtualPet currentPets : pets.values()) {
	// currentPets.feed();
	// }
	// }

	// water all of the pets in the shelter
	// public void hydratePets() {
	// for (VirtualPet currentPets : pets.values()) {
	// currentPets.hydrate();
	// }

}