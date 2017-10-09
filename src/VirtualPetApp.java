import java.util.Scanner;

public class VirtualPetApp {
	private static String displayMenu;

	public static void display(String displayMenu) {
		System.out.println("\nWhat would you like to do with Sparkles?");
		System.out.println("Choose an option.");
		System.out.println("1. Feed Sparkles a cupcake");
		System.out.println("2. Give Sparkles champagne");
		System.out.println("3. Play Beyonce songs for Sparkles to dance to");
		System.out.println("4. Tuck Sparkles in to bed");
		System.out.println("5. Do nothing");
	}

	public static void tick(int amount) {
	}

	public static void byeBye(int hungerLevel, int thirstLevel, int boredLevel, int tiredLevel) {
		if (hungerLevel <= 0 || thirstLevel <= 0 || boredLevel <= 0 || tiredLevel <= 0) {
			System.out.println("You have killed Sparkles.");
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet stats = new VirtualPet(30, 30, 30, 30);

		System.out.println("Sparkles the Unicorn\n");
		System.out.println(stats.petStat());
		display(displayMenu);

		int choice = input.nextInt();
		int amount = 10;

		while (choice >= 1 && choice < 6) {

			if (choice == 1) {
				System.out.println("You fed Sparkles a cupcake.\n");
				stats.feedHunger(amount);

			} else if (choice == 2) {
				stats.giveDrink(amount);
				System.out.println("You gave her champagne responsibly.\n");

			} else if (choice == 3) {
				stats.playBey(amount);
				System.out.println("You played her favorite Beyonce song to dance to.\n");

			} else if (choice == 4) {
				stats.tuckIn(amount);
				System.out.println("You tucked Sparkles in to go to bed.\n");

			} else {
				stats.noThing(amount);
				System.out.println("You did absolutely nothing. You are no help at all.\n");

			}
			stats.tick(amount);
			System.out.println(stats.petStat());
			byeBye(stats.getFood(), stats.getDrink(), stats.getSong(), stats.getSleep());
			display(displayMenu);
			choice = input.nextInt();

		}
		input.close();

	}
}
