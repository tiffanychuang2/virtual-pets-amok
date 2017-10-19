
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

}
