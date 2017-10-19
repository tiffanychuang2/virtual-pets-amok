
public class RoboCat extends VirtualPet implements Robot {

	protected int catOil;
	
	public RoboCat(String name, String description, int catOil) {
		super(name, description);
		this.catOil = catOil;
	}

	@Override
	public void addOil() {
	}

}
