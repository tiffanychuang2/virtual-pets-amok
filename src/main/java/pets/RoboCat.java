package pets;

public class RoboCat extends VirtualPet implements Robot {

	// instance variables
	protected int oilLevel;

	// constructors
	public RoboCat(String name, String description, int energy, int health, int happiness, int oilLevel) {
		super(name, description, energy, health, happiness);
		this.oilLevel = oilLevel;
	}

	// getters
	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void play() {
		energy -= 3;
	}

	@Override
	public void addOil() {
		oilLevel *= 0;
	}

}
