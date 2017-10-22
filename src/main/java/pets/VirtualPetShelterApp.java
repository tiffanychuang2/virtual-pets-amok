package pets;

import java.util.Scanner;

//app
public class VirtualPetShelterApp {

	static String choice;
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter myDog = new VirtualPetShelter();

	public static void main(String[] args) {

		// VirtualPet dog1 = new VirtualPet("charlie", "smart, playful, majestic,
		// loving", 5, 5, 70, 10, 0, 0, 0, 0);

		// myDog.addDog(dog1);
		//
		// currentPups();
		System.out.println("");
		// currentHealth();

		System.out.println("\nWhat would you like to do?\n");

		do {
			// orgDogOptions();
			choice = input.nextLine().toLowerCase();
			myDog.petsTick();

			if (choice.equals("exit")) {
				System.out.println("Final Health:\n");
				// currentHealth();
				System.out.println("\n\nThanks for visiting.  See you next time!");
				System.exit(0);

			} else if (choice.equals("1")) { // feed all the dogs

				myDog.feedPets();

				System.out.println("Noms for all!");
				System.out.println("");

				// currentHealth();

			} else if (choice.equals("2")) { // hydrate all the dogs

				myDog.hydratePets();

				System.out.println("Drools profusely.");
				System.out.println("");

				// currentHealth();

			} else if (choice.equals("3")) { // play with a dog
				System.out.println("You have selected to play with a pup!  Which pup would you like to play with?");
				for (VirtualPet currentDogs : myDog.petValues()) {
					System.out.println("[" + currentDogs.getName().substring(0, 1).toUpperCase()
							+ currentDogs.getName().substring(1).toLowerCase() + "]" + " "
							+ currentDogs.getDescription());
				}
				String name = input.nextLine().toLowerCase();
				System.out.println(
						"Play with " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!");
				myDog.getName(name).play();

				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " is having so much fun! Zoomies time!  Derpy smile!");
				System.out.println("");

				// currentHealth();

			} else if (choice.equals("4")) { // adopt a dog
				System.out.println("Which pup would you like to adopt?\n");
				// currentPups();
				String name = input.nextLine().toLowerCase();

				myDog.adoptPet(name);
				System.out.println("\nYou've adopted " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "!\n");
				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " ruvs his furever home!\n");
				System.out.println("Remaining pups in the shelter:\n");
				// currentPups();

			} else if (choice.equals("5")) { // admit a dog
				System.out.println("We're happy to shelter your pup.  What is your pup's name?");
				String name = input.nextLine().toLowerCase();

				System.out.println("Can you tell us a little bit about " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "?");
				String description = input.nextLine();

				// VirtualPet dog5 = new VirtualPet(name, description);

				// myDog.addDog(dog5);

				System.out.println(
						name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " sounds great!\n");
				// currentPups();

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
		System.out.println("Select 1 to feed all the pets."
				+ "\nSelect 2 to give water to all the pets."
				+ "\nSelect 3 to play with a pet."
				+ "\nSelect 4 to walk all the dogs."
				+ "\nSelect 5 to clean all crates."
				+ "\nSelect 6 to clean the shelter litter box."
				+ "\nSelect 7 for housekeeping."
				+ "\nSelect 8 to adopt a pet from the shelter."
				+ "\nSelect 9 to admit a pet to the shelter."
				+ "\nSelect 10 to view overall health."
				+ "\nType \"exit\" to exit.");
	}// closes options

	// public static void currentHealth() {
	// System.out.println("Name\t|Happy\t|Hunger\t|Thirst\t|Oil\t|Weight\t|Energy\t|Waste\t|Overall
	// Health"
	// +
	// "\n--------|-------|-------|-------|-------|-------|-------|-------|--------------");
	// for (VirtualPet current : myDog.petValues()) {
	// System.out.println(current.getName().substring(0, 1).toUpperCase()
	// + current.getName().substring(1).toLowerCase() + "\t|" + current.getHunger()
	// + "\t|"
	// + current.getThirst() + "\t|" + current.getWeight() + "\t|" +
	// current.getEnergy());
	// }
	// }// closes currentHealth
	//
	// public static void currentPups() {
	// System.out.println("Our current pups are:\n");
	// for (VirtualPet current : myDog.petValues()) {
	// System.out.println("[" + current.getName().substring(0, 1).toUpperCase()
	// + current.getName().substring(1).toLowerCase() + "] " +
	// current.getDescription());
	// }
	// }// closes currentPups

}// final curly brace