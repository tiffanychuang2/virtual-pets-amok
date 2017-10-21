package pets;

public class RoboCat extends VirtualPet implements Robot {

	//instance variables
	protected int oilLevel;
	
	//constructors
	public RoboCat(String name, String description, int oilLevel) {
		super(name, description);
		this.oilLevel = oilLevel;
	}

	//getters
	public int getOilLevel() {
		return oilLevel;
	} 
	
	@Override
	public void addOil() {
	}
	
//	public static void roboCatOptions() {
//		System.out.println("Select 1 to oil all the robocats."
//				+ "\nSelect 2 to play with a robocat."
//				+ "\nSelect 3 to adopt a robocat from the shelter."
//				+ "\nSelect 4 to admit a robocat to the shelter."
//				+ "\nSelect 5 to view overall health."
//				+ "\nType \"exit\" to exit.");
//	}// closes roboCatOptions

}
