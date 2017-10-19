import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//maintenance class
public class VirtualPetShelter {

	Map<String, VirtualPet> dogs = new HashMap<String, VirtualPet>();

	// name = key, VirtualPet = value

	// return a Collection of all of the pets in the shelter
	public Collection<VirtualPet> dogValues() {
		return dogs.values();
	}

	// return a specific VirtualPet given its name
	public VirtualPet getName(String name) {
		return dogs.get(name);
	}

	// allow adoption of a homeless pet
	public VirtualPet adoptDog(String name) {
		return dogs.remove(name);
	}

	// allow intake of a homeless pet/admit a pet
	public void addDog(VirtualPet dog) {
		dogs.put(dog.getName(), dog);
	}

	// tick
	public void dogsTick() {
		for (VirtualPet currentDogs : dogs.values()) {
			currentDogs.tick();
		}
	}

	// feed all of the pets in the shelter
	public void feedDogs() {
		for (VirtualPet currentDogs : dogs.values()) {
			currentDogs.feed();
		}
	}

	// water all of the pets in the shelter
	public void hydrateDogs() {
		for (VirtualPet currentDogs : dogs.values()) {
			currentDogs.hydrate();
		}

	}

}// final curly brace
