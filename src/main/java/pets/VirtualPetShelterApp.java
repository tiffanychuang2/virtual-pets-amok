package pets;
import java.util.Scanner;

//app
public class VirtualPetShelterApp {

	static String choice;
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter myDog = new VirtualPetShelter();

	public static void main(String[] args) {

//		VirtualPet dog1 = new VirtualPet("charlie", "smart, playful, majestic, loving", 5, 5, 70, 10, 0, 0, 0, 0);
//		VirtualPet dog2 = new VirtualPet("angus", "derpy, hyper, loving, loyal", 4, 6, 70, 15, 0, 0, 0, 0);
//		VirtualPet dog3 = new VirtualPet("snoopy", "sassy, sneaky, sarcastic, mischievous", 3, 4, 50, 10, 0, 0, 0, 0);
//		VirtualPet dog4 = new VirtualPet("scooby", "hungry, skittish, playful, happy", 8, 7, 120, 9, 0, 0, 0, 0);

//		myDog.addDog(dog1);
//		myDog.addDog(dog2);
//		myDog.addDog(dog3);
//		myDog.addDog(dog4);

		currentPups();
		System.out.println("");
		currentHealth();

		System.out.println("\nWhat would you like to do?\n");

		do {
//			orgDogOptions();
			choice = input.nextLine().toLowerCase();
			myDog.petsTick();

			if (choice.equals("exit")) {
				System.out.println("Final Health:\n");
				currentHealth();
				System.out.println("\n\nThanks for visiting.  See you next time!");
				System.exit(0);

			} else if (choice.equals("1")) { // feed all the dogs

				myDog.feedPets();

				System.out.println("Noms for all!");
				System.out.println("");

				currentHealth();

			} else if (choice.equals("2")) { // hydrate all the dogs

				myDog.hydratePets();

				System.out.println("Drools profusely.");
				System.out.println("");

				currentHealth();

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

				currentHealth();

			} else if (choice.equals("4")) { // adopt a dog
				System.out.println("Which pup would you like to adopt?\n");
				currentPups();
				String name = input.nextLine().toLowerCase();

				myDog.adoptPet(name);
				System.out.println("\nYou've adopted " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "!\n");
				System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
						+ " ruvs his furever home!\n");
				System.out.println("Remaining pups in the shelter:\n");
				currentPups();

			} else if (choice.equals("5")) { // admit a dog
				System.out.println("We're happy to shelter your pup.  What is your pup's name?");
				String name = input.nextLine().toLowerCase();

				System.out.println("Can you tell us a little bit about " + name.substring(0, 1).toUpperCase()
						+ name.substring(1).toLowerCase() + "?");
//				String description = input.nextLine();

//				VirtualPet dog5 = new VirtualPet(name, description);

//				myDog.addDog(dog5);

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

	public static void orgOrRobo() {
		System.out.println("Would you like to see an organic, or robot pet today?"
				+ "\nSelect 1 to see our organic pets."
				+ "\nSelect 2 to see our robotic pets."
				+ "\nType \"exit\" to exit");
	}// closes orgOrRobo
	
	public static void catOrDog() {
		System.out.println("Would you like to see the cats or the dogs?"
				+ "\nSelect 1 to see our cats."
				+ "\nSelect 2 to see our dogs."
				+ "\nType \"exit\" to exit");
	}// closes catOrDog

	public static void options() {
		System.out.println("Select 1 to feed all the pets."
				+ "\nSelect 2 to give water to all the pets."
				+ "\nSelect 3 to play with a pet."
				+ "\nSelect 4 to walk all the dogs."
				+ "\nSelect 5 for housekeeping."
				+ "\nSelect 6 to adopt a pet from the shelter."
				+ "\nSelect 7 to admit a pet to the shelter."
				+ "\nSelect 8 to view overall health."
				+ "\nType \"exit\" to exit.");
	}// closes orgDogOptions
	
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

//	public static void orgCatOptions() {
//		System.out.println("Select 1 to feed all the cats."
//				+ "\nSelect 2 to give water to all the cats."
//				+ "\nSelect 3 to play with a cat."
//				+ "\nSelect 4 to empty the litter box."
//				+ "\nSelect 5 to adopt a cat from the shelter."
//				+ "\nSelect 6 to admit a cat to the shelter."
//				+ "\nSelect 7 to view overall health."
//				+ "\nType \"exit\" to exit.");
//	}// closes orgCatOptions
	
//	public static void roboDogOptions() {
//		System.out.println("Select 1 to oil all the robodogs."
//				+ "\nSelect 2 to play with a robodog."
//				+ "\nSelect 3 to walk all the robodogs."
//				+ "\nSelect 4 to adopt a robodog from the shelter."
//				+ "\nSelect 5 to admit a robodog to the shelter."
//				+ "\nSelect 6 to view overall health."
//				+ "\nType \"exit\" to exit.");
//	}// closes roboDogOptions
	
//	public static void roboCatOptions() {
//		System.out.println("Select 1 to oil all the robocats."
//				+ "\nSelect 2 to play with a robocat."
//				+ "\nSelect 3 to adopt a robocat from the shelter."
//				+ "\nSelect 4 to admit a robocat to the shelter."
//				+ "\nSelect 5 to view overall health."
//				+ "\nType \"exit\" to exit.");
//	}// closes roboCatOptions
	
	public static void currentHealth() {
		System.out.println("Name\t|Happy\t|Hunger\t|Thirst\t|Oil\t|Weight\t|Energy\t|Waste\t|Overall Health"
				+ "\n--------|-------|-------|-------|-------|-------|-------|-------|--------------");
		for (VirtualPet current : myDog.petValues()) {
			System.out.println(current.getName().substring(0, 1).toUpperCase()
					+ current.getName().substring(1).toLowerCase() + "\t|" + current.getHunger() + "\t|"
					+ current.getThirst() + "\t|" + current.getWeight() + "\t|" + current.getEnergy());
		}
	}// closes currentHealth

	public static void currentPups() {
		System.out.println("Our current pups are:\n");
		for (VirtualPet current : myDog.petValues()) {
			System.out.println("[" + current.getName().substring(0, 1).toUpperCase()
					+ current.getName().substring(1).toLowerCase() + "] " + current.getDescription());
		}
	}// closes currentPups

}// final curly brace