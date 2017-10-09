
public class VirtualPet {
	private int hungerLevel;
	private int thirstLevel;
	private int boredLevel;
	private int tiredLevel;

	public VirtualPet(int hungerLevel, int thirstLevel, int boredLevel, int tiredLevel) {
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.boredLevel = boredLevel;
		this.tiredLevel = tiredLevel;
	}

	public void tick(int amount) {
		hungerLevel -= (amount / 2);
		thirstLevel -= (amount / 2);
		boredLevel -= (amount / 2);
		tiredLevel -= (amount / 2);
	}

	public void feedHunger(int amount) {
		hungerLevel += amount;
		thirstLevel -= amount;

	}

	public void giveDrink(int amount) {
		thirstLevel += amount;
		tiredLevel -= amount;
	}

	public void playBey(int amount) {
		boredLevel += amount;
		tiredLevel -= amount;

	}

	public void tuckIn(int amount) {
		tiredLevel += amount;
		hungerLevel -= amount;
	}

	public void noThing(int amount) {
		tiredLevel -= amount;
		thirstLevel -= amount;

	}

	public int getFood() {
		return hungerLevel;
	}

	public int getDrink() {
		return thirstLevel;
	}

	public int getSong() {
		return boredLevel;
	}

	public int getSleep() {
		return tiredLevel;
	}

	public String petStat() {
		return "Sparkles's levels are \n Hunger: " + hungerLevel + "\n Thirst: " + thirstLevel + "\n Boredom: "
				+ boredLevel + "\n Tired: " + tiredLevel;
	}

}
