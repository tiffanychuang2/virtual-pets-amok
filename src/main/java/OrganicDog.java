
public class OrganicDog extends AllDog implements Organic {
	
	public OrganicDog(String name, String description, int hunger, int thirst, int weight, int energy, int health,
			int happiness, int waste, int walk) {
		super(name, description, hunger, thirst, weight, energy, health, happiness, waste, walk);
	}
	
	@Override
	public void feed() {
		
	}
	
	public void hydrate() {
		
	}
	
	public void clean() {
		
	}
	
//	public static void orgDogOptions() {
//		System.out.println("Select 1 to feed all the dogs."
//				+ "\nSelect 2 to give water to all the dogs."
//				+ "\nSelect 3 to play with a dog."
//				+ "\nSelect 4 to walk all the dogs."
//				+ "\nSelect 5 to clean all the crates."
//				+ "\nSelect 6 to adopt a dog from the shelter."
//				+ "\nSelect 7 to admit a dog to the shelter."
//				+ "\nSelect 8 to view overall health."
//				+ "\nType \"exit\" to exit.");
//	}// closes orgDogOptions

}
