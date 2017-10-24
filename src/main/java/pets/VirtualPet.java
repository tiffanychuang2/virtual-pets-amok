package pets;

//model class
public abstract class VirtualPet {

	// instance variables
	protected String name;
	protected String description;
	protected int health;
	protected int happiness;

	// constructors
	// name, description
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// robo
	public VirtualPet(String name, String description, int health, int happiness) {
		this.name = name;
		this.description = description;
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

	public void setHealth(int health) {
		this.health = health;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	// methods

	public void tick() {
		Math.min(0, health);
		Math.max(health, 10);
		Math.min(0, happiness);
		Math.max(happiness, 10);
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
		Math.min(0, health);
		Math.max(health, 10);
		Math.min(0, happiness);
		Math.max(happiness, 10);
		health += 4;
		happiness += 6;
	}

	@Override
	public String toString() {
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "\t" + this.description;
	}// close toString

}