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

}
