//model class
public class VirtualPet {

	// instance variables
	private int hunger;
	private int thirst;
	private int weight;
	private int energy;
	private String name;
	private String description;

	// constructors

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(int hunger, int thirst, int weight, int energy) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.weight = weight;
		this.energy = energy;
	}

	public VirtualPet(String name, int hunger, int thirst, int weight, int energy) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.weight = weight;
		this.energy = energy;
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int weight, int energy) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.weight = weight;
		this.energy = energy;
	}

	// getters

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWeight() {
		return weight;
	}

	public int getEnergy() {
		return energy;
	}

	// setters

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	// methods

	public void tick() {
		hunger += 1; // gets hungrier every loop
		thirst += 1; // gets more thirsty every loop
		weight -= 1; // loses weight every loop
		energy -= 1; // loses energy every loop
	}

	public void feed() {
		hunger -= 4; // less hungry
		weight += 2; // +1 lb.
		energy += 1; // gain energy
	}

	public void hydrate() {
		thirst -= 4;
		weight += 1;
		energy += 2;
	}

	public void play() {
		hunger += 2;
		thirst += 2;
		weight -= 2;
		energy -= 5;
	}
}