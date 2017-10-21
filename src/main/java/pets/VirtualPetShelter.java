package pets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//maintenance class
public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	// name = key, VirtualPet = value

	// return a Collection of all of the pets in the shelter
	public Collection<VirtualPet> petValues() {
		return pets.values();
	}

	// return a specific VirtualPet given its name
	public VirtualPet getName(String name) {
		return pets.get(name);
	}

	// allow adoption of a homeless pet
	public VirtualPet adoptPet(String name) {
		return pets.remove(name);
	}

	// allow intake of a homeless pet/admit a pet
	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	// tick
	public void petsTick() {
		for (VirtualPet currentPets : pets.values()) {
			currentPets.tick();
		}
	}

	// feed all of the pets in the shelter
	public void feedPets() {
		for (VirtualPet currentPets : pets.values()) {
			currentPets.feed();
		}
	}

	// water all of the pets in the shelter
	public void hydratePets() {
		for (VirtualPet currentPets : pets.values()) {
			currentPets.hydrate();
		}

	}

	//litter box
	public void litterBox() {
		for (VirtualPet currentPets : pets.values()) {
//			currentPets.waste();
		}
	}
	
	//clean crates
	public void cleanCrates() {
		
	}
	
}// final curly brace
