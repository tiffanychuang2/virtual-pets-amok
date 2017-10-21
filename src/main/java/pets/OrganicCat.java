package pets;

public class OrganicCat extends VirtualPet implements Organic {

	protected int litterWaste;

	// constructors
	public OrganicCat(String name, String description, int energy, int health, int happiness, int hunger, int thirst,
			int litterWaste) {
		super(name, description, energy, health, happiness, hunger, thirst);
		this.litterWaste = litterWaste;
	}

	// getters
	public int getLitterWaste() {
		return litterWaste;
	}

	// methods
	@Override
	public void feed() {

	}

	@Override
	public void hydrate() {

	}

	//// public static void orgCatOptions() {
	//// System.out.println("Select 1 to feed all the cats."
	//// + "\nSelect 2 to give water to all the cats."
	//// + "\nSelect 3 to play with a cat."
	//// + "\nSelect 4 to empty the litter box."
	//// + "\nSelect 5 to adopt a cat from the shelter."
	//// + "\nSelect 6 to admit a cat to the shelter."
	//// + "\nSelect 7 to view overall health."
	//// + "\nType \"exit\" to exit.");
	//// }// closes orgCatOptions
	//
}
