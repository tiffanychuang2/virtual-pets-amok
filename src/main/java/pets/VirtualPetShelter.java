package pets;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//maintenance class
public class VirtualPetShelter {

	protected int litterBox;
	protected int litterWaste;

	OrganicDog orgDog = new OrganicDog("", "");
	RoboDog roboDog = new RoboDog("", "");
	OrganicCat orgCat = new OrganicCat("", "");
	RoboCat roboCat = new RoboCat("", "");

	// Map to house pets
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

	// feed all organic pets
	public void feedAllOrganic() {
		for (VirtualPet currentPets : pets.values()) {
			if (pets instanceof Organic) {
				((Organic) pets).feed();
			}
		}
	}
	//
	// // feed all of the organic cats
	// public void feedCats() {
	// for (VirtualPet currentPets : pets.values()) {
	// if (pets instanceof OrganicCat) {
	// ((OrganicCat) pets).feed();
	// }
	// }
	// }
	//
	// // feed all organic dogs
	// public void feedDogs() {
	// for (VirtualPet currentPets : pets.values()) {
	// if (pets instanceof OrganicDog) {
	// ((OrganicDog) pets).feed();
	// }
	// }
	// }

	// hydrate all organic pets
	public void hydrateAllOrganic() {
		for (VirtualPet currentPets : pets.values()) {
			if (pets instanceof Organic) {
				((Organic) pets).hydrate();
			}
		}
	}
	//
	// // hydrate all of the organic cats
	// public void hydrateCats() {
	// for (VirtualPet currentPets : pets.values()) {
	// if (pets instanceof OrganicCat) {
	// ((OrganicCat) pets).hydrate();
	// }
	// }
	// }
	//
	// // hydrate all organic dogs
	// public void hydrateDogs() {
	// for (VirtualPet currentPets : pets.values()) {
	// if (pets instanceof OrganicDog) {
	// ((OrganicDog) pets).hydrate();
	// }
	// }
	// }

	// oil all robopets
	public void oilAllRobots() {
		for (VirtualPet currentPets : pets.values()) {
			if (pets instanceof Robot) {
				((Robot) pets).addOil();
			}
		}
	}

	// walk all dogs
	public void walkAllDogs() {
		for (VirtualPet currentPets : pets.values()) {
			if (pets instanceof AllDog) {
				((AllDog) pets).walk();
			}
		}
	}

	// clean all crates
	public void cleanAllCrates() {
		for (VirtualPet currentPets : pets.values()) {
			if (pets instanceof OrganicDog) {
				((OrganicDog) pets).cleanCrate();
			}
		}
	}

	// tick
	public void petsTick() {
		for (VirtualPet currentPets : pets.values()) {
			if (pets instanceof OrganicCat) {
				litterWaste = orgCat.collectWaste();
				litterBox = litterBox + litterWaste;
			}
			if (pets instanceof OrganicCat) {
				litterWaste = orgCat.litterBox();
			}
			currentPets.tick();
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

}// final curly brace
