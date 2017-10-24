package pets;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//maintenance class
public class VirtualPetShelter {

	protected int litterBox;
	protected int litterWaste;

	// OrganicDog orgDog = new OrganicDog("", "");
	// RoboDog roboDog = new RoboDog("", "");
	// OrganicCat orgCat = new OrganicCat("", "");
	// RoboCat roboCat = new RoboCat("", "");

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

	// clean litter box
	public int litterBox() {
		litterWaste *= 0;
		return litterWaste;
	}

	// feed all organic pets
	public void feedAllOrganic() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof Organic) {
				((Organic) currentPet).feed();
			}
		}
	}

	// hydrate all organic pets
	public void hydrateAllOrganic() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof Organic) {
				((Organic) currentPet).hydrate();
			}
		}
	}

	// oil all robopets
	public void oilAllRobots() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof Robot) {
				((Robot) currentPet).addOil();
			}
		}
	}

	// walk all dogs
	public void walkAllDogs() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof AllDog) {
				((AllDog) currentPet).walk();
			}
		}
	}

	// clean all crates
	public void cleanAllCrates() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicDog) {
				((OrganicDog) currentPet).cleanCrate();
			}
		}
	}

	// if (currentPet instanceof OrganicCat) {
	// litterWaste = orgCat.litterBox();
	// }

	// tick
	public void petsTick() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicCat) {
				litterWaste = ((OrganicCat) currentPet).collectWaste();
				litterBox += litterWaste;
			}
			if (currentPet instanceof OrganicDog) {
				((OrganicDog) currentPet).crateWaste += 1;
			}
			currentPet.tick();
			litterWaste += 1;
		}
	}

	public void orgDogHealth() {
		System.out.println("\n------------------------Organic Dogs---------------------------");
		System.out.println("Name\t|Health\t|Joy\t|Hunger\t|Thirst\t|Energy\t|Bored\t|Crate"
				+ "\n--------|-------|-------|-------|-------|-------|-------|------");
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicDog) {
				System.out.println(currentPet.toString());
			}
		}
	}

	public void roboDogHealth() {
		System.out.println("\n---------------Robotic Dogs---------------");
		System.out.println("Name\t|Health\t|Joy\t|Bored\t|Oil Level" + "\n--------|-------|-------|-------|---------");
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof RoboDog) {
				System.out.println(currentPet.toString());
			}
		}
	}

	public void orgCatHealth() {
		System.out.println("\n----------------Organic Cats--------------------");
		System.out.println("Name\t|Health\t|Joy\t|Hunger\t|Thirst\t|Energy"
				+ "\n--------|-------|-------|-------|-------|-------");
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicCat) {
				System.out.println(currentPet.toString());
			}
		}
		System.out.println("\t\t\tCurrent Litter Waste: " + litterWaste);
	}

	public void roboCatHealth() {
		System.out.println("\n-----------Robotic Cats-----------");
		System.out.println("Name\t|Health\t|Joy\t|Oil Level" + "\n--------|-------|-------|---------");
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof RoboCat) {
				System.out.println(currentPet.toString());
			}
		}
	}

	public void detailedHealth() {
		orgDogHealth();
		roboDogHealth();
		orgCatHealth();
		roboCatHealth();
	}

	public void orgHealth() {
		orgDogHealth();
		orgCatHealth();
	}

	public void dogHealth() {
		orgDogHealth();
		roboDogHealth();
	}

	public void roboHealth() {
		roboDogHealth();
		roboCatHealth();
	}

	public void catHealth() {
		orgDogHealth();
		roboCatHealth();
	}

	public void typeOfPet() {
		System.out.println("1) Organic Dog\n2) Robotic Dog\n3) Organic Cat\n4) Robotic Cat");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}// final curly brace
