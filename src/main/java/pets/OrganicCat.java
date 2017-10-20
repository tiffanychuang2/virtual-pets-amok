package pets;

public class OrganicCat extends VirtualPet implements Organic {

	public OrganicCat(String name, String description, int hunger, int thirst, int weight, int energy, int health,
			int happiness, int waste) {
		super(name, description, hunger, thirst, weight, energy, health, happiness, waste);
	}
	
	@Override
	public void feed() {
		
	}
	
	@Override
	public void hydrate() {
		
	}
	
	@Override
	public void clean() {
		
	}

//	public static void orgCatOptions() {
//		System.out.println("Select 1 to feed all the cats."
//				+ "\nSelect 2 to give water to all the cats."
//				+ "\nSelect 3 to play with a cat."
//				+ "\nSelect 4 to empty the litter box."
//				+ "\nSelect 5 to adopt a cat from the shelter."
//				+ "\nSelect 6 to admit a cat to the shelter."
//				+ "\nSelect 7 to view overall health."
//				+ "\nType \"exit\" to exit.");
//	}// closes orgCatOptions
	
}
