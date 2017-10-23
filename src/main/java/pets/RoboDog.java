package pets;

public class RoboDog extends AllDog implements Robot {

	protected int oilLevel;

	public RoboDog(String name, String description, int health, int happiness, int boredom, int oilLevel) {
		super(name, description, health, happiness, boredom);
		this.oilLevel = oilLevel;
	}

	// getters
	public int getOilLevel() {
		return oilLevel;
	}

	// methods
	@Override
	public void tick() {
		Math.min(0, boredom);
		Math.max(boredom, 10);
		Math.min(0, oilLevel);
		Math.max(oilLevel, 10);
		boredom += 1;
		oilLevel -= 1;
		super.tick();
	}

	@Override
	public void play() {
		Math.min(0, oilLevel);
		Math.max(oilLevel, 10);
		Math.min(0, boredom);
		Math.max(boredom, 10);
		boredom -= 2;
		oilLevel -= 2;
		super.play();
	}

	@Override
	public void walk() {
		Math.min(0, oilLevel);
		Math.max(oilLevel, 10);
		Math.min(0, boredom);
		Math.max(boredom, 10);
		boredom -= 1;
		oilLevel -= 1;
	}

	@Override
	public void addOil() {
		Math.min(0, oilLevel);
		Math.max(oilLevel, 10);
		oilLevel *= 0;
	}

}
