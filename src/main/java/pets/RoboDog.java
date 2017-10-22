package pets;

public class RoboDog extends AllDog implements Robot {

	protected int oilLevel;

	public RoboDog(String name, String description, int energy, int health, int happiness, int boredom, int oilLevel) {
		super(name, description, energy, health, happiness, boredom);
		this.oilLevel = oilLevel;
	}

	// getters
	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void play() {
		energy -= 1;
	}

	@Override
	public void walk() {
		boredom -= 1;
	}

	@Override
	public void addOil() {
		oilLevel *= 0;
	}

}
