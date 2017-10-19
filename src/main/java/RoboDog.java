
public class RoboDog extends AllDog implements Robot {

	protected int dogOil;
	
	public RoboDog(String name, String description, int dogOil) {
		super(name, description);
		this.dogOil = dogOil;
	}

	@Override
	public void addOil() {
	}

}
