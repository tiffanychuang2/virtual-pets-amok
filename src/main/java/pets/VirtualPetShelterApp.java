package pets;

import java.util.Scanner;

//app
public class VirtualPetShelterApp {

	static String choice;
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter myPet = new VirtualPetShelter();

	public static void main(String[] args) {

		OrganicDog charlie = new OrganicDog("charlie", "organic dog, smart, playful, majestic, loving", 6, 8, 7, 6, 5,
				7, 0);
		OrganicDog angus = new OrganicDog("angus", "organic dog, derpy, hyper, loving, loyal, destructive", 9, 9, 9, 8,
				9, 6, 1);
		RoboDog scooby = new RoboDog("scooby", "robodog, sassy, sneaky, sarcastic, mischievous", 8, 9, 9, 6);
		RoboDog snoopy = new RoboDog("scooby", "robodog, hungry, skittish, playful, happy", 7, 9, 6, 9);
		OrganicCat smellyCat = new OrganicCat("smelly", "organic feline, smelly, musical", 2, 10, 2, 5, 1);
		OrganicCat mrsNorris = new OrganicCat("norris", "organic feline, fluffy, sneaky, guard cat, tattle tale", 6, 9,
				7, 5, 1);
		RoboCat grumpyCat = new RoboCat("grumpy", "robocat, grumps, fluffy, silly", 2, 8, 2);
		RoboCat tom = new RoboCat("tom", "robocat, obsessive, chases Jerry, not good at catching mice", 8, 8, 10);

		myPet.addPet(charlie);
		myPet.addPet(angus);
		myPet.addPet(scooby);
		myPet.addPet(snoopy);
		myPet.addPet(smellyCat);
		myPet.addPet(mrsNorris);
		myPet.addPet(grumpyCat);
		myPet.addPet(tom);

		currentPets();
		System.out.println("");
		detailedHealth();

		System.out.println("\nWhat would you like to do?\n");

		do {
			options();
			choice = input.nextLine().toLowerCase();
			myPet.petsTick();

			if (choice.equals("exit")) {
				System.out.println("Final Health:\n");
				currentHealth();
				System.out.println("\n\nThanks for visiting.  See you next time!");
				System.exit(0);

			} else if (choice.equals("1")) { // feed organic pets
				myPet.feedAllOrganic();
				System.out.println("Noms for organic pets!");

				orgHealth();

			} else if (choice.equals("2")) { // hydrate organic pets
				myPet.hydrateAllOrganic();
				System.out.println("Thank you, we were very thirsty!");

				System.out.println("Drools profusely.");
				System.out.println("");

				orgHealth();

			} else if (choice.equals("3")) { // play with a pet
				System.out.println("You have selected to play with a pet!  Which pet would you like to play with?");
				for (VirtualPet currentPets : myPet.petValues()) {
					System.out.println("[" + currentPets.getName().substring(0, 1).toUpperCase()
							+ currentPets.getName().substring(1).toLowerCase() + "]" + " "
							+ currentPets.getDescription());
				}
				String name = input.nextLine().toLowerCase();
				System.out.println(
						"Play with " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!");
				myPet.getName(name).play();

				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " is having so much fun!");
				System.out.println("");

				detailedHealth();

			} else if (choice.equals("4")) { // walk dogs
				myPet.walkAllDogs();
				System.out.println("Thank you for walking the dogs!");

				dogHealth();

			} else if (choice.equals("5")) { // clean org dog crates
				myPet.cleanAllCrates();
				System.out.println("All the dog crates are clean!");

				orgHealth();

				// Select 6 to clean the shelter litter box.
			} else if (choice.equals("6")) {
				myPet.orgCat.litterBox();
				System.out.println("The shelter litter box is now clean!");

				orgHealth();

				// Select 7 to adopt a pet from the shelter.
			} else if (choice.equals("7")) {
				System.out.println("Which pup would you like to adopt?\n");
				// currentPups();
				String name = input.nextLine().toLowerCase();

				myPet.adoptPet(name);
				System.out.println("\nYou've adopted " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "!\n");
				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " ruvs his furever home!\n");
				System.out.println("Remaining pups in the shelter:\n");

				currentPets();

				detailedHealth();

				// Select 8 to admit a pet to the shelter.
			} else if (choice.equals("8")) {
				System.out.println("We're happy to shelter your pet.  What is your pet's name?");
				String name = input.nextLine().toLowerCase();

				System.out.println("Can you tell us a little bit about " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "?");
				String description = input.nextLine();

				System.out.println("What kind of pet is " + name + "?");

				typeOfPet();
				String petType = input.nextLine();

				if (petType.equals("1")) {
					OrganicDog pet9 = new OrganicDog(name, description);
					myPet.addPet(pet9);
					orgHealth();

				} else if (petType.equals("2")) {
					RoboDog pet9 = new RoboDog(name, description);
					myPet.addPet(pet9);
					roboHealth();

				} else if (petType.equals("3")) {
					OrganicCat pet9 = new OrganicCat(name, description);
					myPet.addPet(pet9);
					orgHealth();

				} else if (petType.equals("4")) {
					RoboCat pet9 = new RoboCat(name, description);
					myPet.addPet(pet9);
					roboHealth();

				} else {
					System.out.println("That is not an option, please try again.");
					petType = input.nextLine();
				}
				// VirtualPet dog5 = new VirtualPet(name, description);
				// pets.VirtualPet pet9 = new VirtualPet(name, description) {
				// };
				System.out.println("");

				System.out.println(
						name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " sounds great!\n");

				detailedHealth();

			} else {
				System.out.println("Invalid option, try again.\n");

			} // closes final "else"

			System.out.println("\nWhat would you like to do next?\n");
		} // closes "do"

		while (!choice.equals("exit"));

		System.out.println("Thanks for visiting, see you next time!");
		// System.exit(0);

		input.close();

	}// close main method

	public static void options() {
		System.out.println("Select 1 to feed all organic pets." + "\nSelect 2 to give water to all organic pets."
				+ "\nSelect 3 to play with a single pet." + "\nSelect 4 to walk all the dogs."
				+ "\nSelect 5 to clean all organic dog crates." + "\nSelect 6 to clean the shelter litter box."
				+ "\nSelect 7 to adopt a pet from the shelter." + "\nSelect 8 to admit a pet to the shelter."
				+ "\nType \"exit\" to exit.");
	}// closes options

	public static void currentHealth() {
		System.out.println("Name\t|Health\t|Joy" + "\n--------|-------|-------");
		for (VirtualPet currentPets : myPet.petValues()) {
			System.out.println(currentPets.getName().substring(0, 1).toUpperCase()
					+ currentPets.getName().substring(1).toLowerCase() + "\t" + "|" + currentPets.getHealth() + "\t"
					+ "|" + currentPets.getHappiness());
		}

		// add cages//add litterbox
	}// closes currentHealth

	// public static void orgDogHealth() {
	// System.out.println("Name\t|Health\t|Joy\t|Hunger\t|Thirst\t|Energy\t|Boredom"
	// + "\n--------|-------|-------|-------|-------|-------|-------");
	// for (VirtualPet currentPets : myPet.petValues()) {
	// if (myPet.petValues() instanceof OrganicDog) {
	// System.out.println(currentPets.getName().substring(0, 1).toUpperCase()
	// + currentPets.getName().substring(1).toLowerCase() + "\t" + "|" +
	// currentPets.getHealth() + "\t|" + currentPets.getHappiness() + "\t|" + );
	// }
	// }

	public static void orgDogHealth() {
		System.out.println("\n--------------------Organic Dogs------------------------");
		System.out.println("Name\t|Health\t|Joy\t|Hunger\t|Thirst\t|Energy\t|Boredom"
				+ "\n--------|-------|-------|-------|-------|-------|-------");
		for (VirtualPet currentPets : myPet.petValues()) {
			if (currentPets instanceof OrganicDog) {
				System.out.println(currentPets.toString());
			}
		}
		System.out.println("\t\t\t\tCurrent Crate Waste: " + myPet.orgDog.crateWaste);
	}

	public static void roboDogHealth() {
		System.out.println("\n---------------Robotic Dogs---------------");
		System.out.println("Name\t|Health\t|Joy\t|Bored\t|Oil Level" + "\n--------|-------|-------|-------|--------");
		for (VirtualPet currentPets : myPet.petValues()) {
			if (currentPets instanceof RoboDog) {
				System.out.println(currentPets.toString());
			}
		}
	}

	public static void orgCatHealth() {
		System.out.println("\n----------------Organic Cats--------------------");
		System.out.println("Name\t|Health\t|Joy\t|Hunger\t|Thirst\t|Energy"
				+ "\n--------|-------|-------|-------|-------|-------");
		for (VirtualPet currentPets : myPet.petValues()) {
			if (currentPets instanceof OrganicCat) {
				System.out.println(currentPets.toString());
			}
		}
		System.out.println("\t\t\tCurrent Litter Waste: " + myPet.orgCat.litterWaste);
	}

	public static void roboCatHealth() {
		System.out.println("\n-----------Robotic Cats-----------");
		System.out.println("Name\t|Health\t|Joy\t|Oil Level" + "\n--------|-------|-------|---------");
		for (VirtualPet currentPets : myPet.petValues()) {
			if (currentPets instanceof RoboCat) {
				System.out.println(currentPets.toString());
			}
		}
	}

	public static void detailedHealth() {
		orgDogHealth();
		roboDogHealth();
		orgCatHealth();
		roboCatHealth();
	}

	public static void orgHealth() {
		orgDogHealth();
		orgCatHealth();
	}

	public static void dogHealth() {
		orgDogHealth();
		roboDogHealth();
	}

	public static void roboHealth() {
		roboDogHealth();
		roboCatHealth();
	}

	public static void typeOfPet() {
		System.out.println("1) Organic Dog\n2) Robotic Dog\n3) Organic Cat\n4) Robotic Cat");
	}

	public static void currentPets() {
		System.out.println("Our current pets are:\n");
		for (VirtualPet currentPets : myPet.petValues()) {
			System.out.println("[" + currentPets.getName().substring(0, 1).toUpperCase()
					+ currentPets.getName().substring(1).toLowerCase() + "] " + currentPets.getDescription());
		}
	}// closes currentPups

}// final curly brace