package pets;

public class RoboDog extends AllDog implements Robot {

	protected int dogOil;
	
	public RoboDog(String name, String description, int dogOil) {
		super(name, description);
		this.dogOil = dogOil;
	}

	@Override
	public void addOil() {
	}
	
//	public static void roboDogOptions() {
//		System.out.println("Select 1 to oil all the robodogs."
//				+ "\nSelect 2 to play with a robodog."
//				+ "\nSelect 3 to walk all the robodogs."
//				+ "\nSelect 4 to adopt a robodog from the shelter."
//				+ "\nSelect 5 to admit a robodog to the shelter."
//				+ "\nSelect 6 to view overall health."
//				+ "\nType \"exit\" to exit.");
//	}// closes roboDogOptions

}
