package pets;

//model class
public abstract class VirtualPet {

	// instance variables
	protected String name;
	protected String description;
	protected int hunger;
	protected int thirst;
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

	// org
	public VirtualPet(String name, String description, int energy, int health, int happiness, int hunger, int thirst) {
		this.name = name;
		this.description = description;
		this.energy = energy;
		this.health = health;
		this.happiness = happiness;
		this.hunger = hunger;
		this.thirst = thirst;

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

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
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

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	// methods

	public void tick() {
		hunger += 1; // gets hungrier every loop
		thirst += 1; // gets more thirsty every loop
		energy -= 1; // loses energy every loop
		crateWaste += 1;
		litterWaste += 1;
	}

	// hunger
	public void feed() {
		hunger -= 4; // less hungry
		energy += 1; // gain energy
	}

	// thirst
	public void hydrate() {
		thirst -= 4;
		energy += 2;
	}

	// energy
	public void play() {
		hunger += 2;
		thirst += 2;
		energy -= 5;
	}

	public void cleanCrate() {
		Math.min(0, crateWaste);
		Math.max(crateWaste, 10);
	}

	public void litterBox() {
		Math.min(0, litterWaste);
		Math.max(litterWaste, 10);
	}

	@Override
	public String toString() {
		return name + "\t" + description;
	}// close toString

}