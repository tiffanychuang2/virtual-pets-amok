package pets;

import java.util.Scanner;

//app
public class VirtualPetShelterApp {

	static String choice;
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter myPet = new VirtualPetShelter();

	public static void main(String[] args) {

		OrganicDog charlie = new OrganicDog("charlie", "organic dog, smart, playful, majestic, loving", 6, 8, 7, 6, 6,
				7, 0);
		OrganicDog angus = new OrganicDog("angus", "organic dog, derpy, hyper, loving, loyal, destructive", 9, 9, 9, 8,
				7, 6, 1);
		RoboDog scooby = new RoboDog("scooby", "robodog, sassy, sneaky, sarcastic, mischievous", 8, 9, 9, 2, 6);
		RoboDog snoopy = new RoboDog("scooby", "robodog, hungry, skittish, playful, happy", 7, 9, 6, 8, 9);
		OrganicCat smellyCat = new OrganicCat("smelly", "organic feline, smelly, musical", 2, 10, 2, 5, 5, 1);
		OrganicCat mrsNorris = new OrganicCat("norris", "organic feline, fluffy, sneaky, guard cat, tattle tale", 6, 9,
				7, 5, 5, 1);
		RoboCat grumpyCat = new RoboCat("grumpy", "robocat, grumps, fluffy, silly", 2, 8, 2, 2);
		RoboCat tom = new RoboCat("tom", "robocat, obsessive, chases Jerry, not good at catching mice", 8, 8, 10, 10);

		myPet.addPet(charlie);
		myPet.addPet(angus);
		myPet.addPet(scooby);
		myPet.addPet(snoopy);
		myPet.addPet(smellyCat);
		myPet.addPet(mrsNorris);
		myPet.addPet(grumpyCat);
		myPet.addPet(tom);

		currentPups();
		System.out.println("");
		currentHealth();

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
				for (VirtualPet currentPets : myPet.petValues()) {
					if (currentPets instanceof Organic) {
						((Organic) myPet).feed();
						System.out.println(currentPets.getName() + ": Thank you for feeding me!");
					}
				}

				currentHealth();

			} else if (choice.equals("2")) { // hydrate organic pets

				// myDog.hydratePets();

				System.out.println("Drools profusely.");
				System.out.println("");

				// currentHealth();

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

				currentHealth();

			} else if (choice.equals("4")) { // walk dogs

			} else if (choice.equals("5")) { // clean org dog crates

				// Select 6 to clean the shelter litter box.
				// Select 7 for housekeeping.

				// Select 8 to adopt a pet from the shelter.
			} else if (choice.equals("8")) {
				System.out.println("Which pup would you like to adopt?\n");
				// currentPups();
				String name = input.nextLine().toLowerCase();

				myPet.adoptPet(name);
				System.out.println("\nYou've adopted " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "!\n");
				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " ruvs his furever home!\n");
				System.out.println("Remaining pups in the shelter:\n");
				currentPups();

				// Select 9 to admit a pet to the shelter.
			} else if (choice.equals("9")) {
				System.out.println("We're happy to shelter your pup.  What is your pup's name?");
				String name = input.nextLine().toLowerCase();

				System.out.println("Can you tell us a little bit about " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "?");
				String description = input.nextLine();

				// VirtualPet dog5 = new VirtualPet(name, description);
				pets.VirtualPet pet9 = new VirtualPet(name, description) {
				};

				myPet.addPet(pet9);

				System.out.println(
						name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " sounds great!\n");
				currentPups();

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
		System.out.println("Select 1 to feed all the organic pets."
				+ "\nSelect 2 to give water to all the organic pets." + "\nSelect 3 to play with a single pet."
				+ "\nSelect 4 to walk all the dogs." + "\nSelect 5 to clean all organic dog crates."
				+ "\nSelect 6 to clean the shelter litter box." + "\nSelect 7 for housekeeping."
				+ "\nSelect 8 to adopt a pet from the shelter." + "\nSelect 9 to admit a pet to the shelter."
				+ "\nSelect 10 to view overall health." + "\nType \"exit\" to exit.");
	}// closes options

	public static void currentHealth() {
		System.out.println("Name\t|Energy\t|Health\t|Happiness" + "\n--------|-------|-------|----------");
		for (VirtualPet currentPets : myPet.petValues()) {
			System.out.println(currentPets.getName().substring(0, 1).toUpperCase()
					+ currentPets.getName().substring(1).toLowerCase() + "\t" + "|" + currentPets.getEnergy() + "\t" + "|"
					+ currentPets.getHealth() + "\t" + "|" + currentPets.getHappiness());
		}
	}// closes currentHealth

	public static void currentPups() {
		System.out.println("Our current pups are:\n");
		for (VirtualPet currentPets : myPet.petValues()) {
			System.out.println("[" + currentPets.getName().substring(0, 1).toUpperCase()
					+ currentPets.getName().substring(1).toLowerCase() + "] " + currentPets.getDescription());
		}
	}// closes currentPups

}// final curly brace