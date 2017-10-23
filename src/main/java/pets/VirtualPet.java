package pets;

//model class
public abstract class VirtualPet {

	// instance variables
	protected String name;
	protected String description;
	protected int energy;
	protected int health;
	protected int happiness;
	protected int litterWaste;
	protected int crateWaste;

	// constructors
	// name, description
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// robo
	public VirtualPet(String name, String description, int energy, int health, int happiness) {
		this.name = name;
		this.description = description;
		this.energy = energy;
		this.health = health;
		this.happiness = happiness;
	}

	// getters

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getEnergy() {
		return energy;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	// setters

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	// methods

	public void tick() {
		Math.min(0, energy);
		Math.max(energy, 10);
		Math.min(0, health);
		Math.max(health, 10);
		Math.min(0, happiness);
		Math.max(happiness, 10);
		energy -= 1; // loses energy every loop
		health -= 2;
		happiness -= 1;
		if (health <= 8) {
			happiness -= 2;
		} else {
			happiness += 1;
		}
	}

	// energy
	public void play() {
		Math.min(0, energy);
		Math.max(energy, 10);
		Math.min(0, health);
		Math.max(health, 10);
		Math.min(0, happiness);
		Math.max(happiness, 10);
		energy -= 5;
		health += 4;
		happiness += 6;
		if (energy >= 4) {
			happiness -= 2;
		} else {
			happiness += 1;
		}
	}

	@Override
	public String toString() {
		return name + "\t" + description;
	}// close toString

}