package pets;

public class RoboCat extends VirtualPet implements Robot {

	// instance variables
	protected int oilLevel;

	// constructors
	public RoboCat(String name, String description, int health, int happiness, int oilLevel) {
		super(name, description, health, happiness);
		this.oilLevel = oilLevel;
	}

	public RoboCat(String name, String description) {
		super(name, description);
	}

	// getters
	public int getOilLevel() {
		return oilLevel;
	}

	// methods
	@Override
	public void tick() {
		Math.min(0, oilLevel);
		Math.max(oilLevel, 10);
		oilLevel -= 1;
		super.tick();
	}

	@Override
	public void play() {
		Math.min(0, oilLevel);
		Math.max(oilLevel, 10);
		oilLevel -= 2;
		super.play();
	}

	@Override
	public void addOil() {
		Math.min(0, oilLevel);
		Math.max(oilLevel, 10);
		oilLevel *= 0;
	}

	@Override
	public String toString() {
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "\t|" + health + "\t|" + happiness
				+ "\t|" + oilLevel;
	}

}
